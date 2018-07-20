/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ensit.gestionetudiants.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.Temporal;

/**
 *
 * @author Naycene Boussoffara
 */

@Entity
@NamedQueries({
    @NamedQuery(
        name="Etudiant.findAll",
        query="SELECT * FROM ETUDIANTDB"),
@NamedQuery(
        name="Etudiant.findByNom",
        query="SELECT e FROM ETUDIANTDB WHERE u.nom=:n"),
})

public class Etudiant implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="nom")
    private String nom;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateNaissance;
    @Enumerated(EnumType.STRING)
    private NiveauEtude niveauEtude;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }
    

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etudiant)) {
            return false;
        }
        Etudiant other = (Etudiant) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.ensit.gestionetudiants.model.Etudiant[ id=" + id + " ]";
    }
     @PersistenceContext 
     private EntityManager em;
    public void queries () {
    Query p =em.createNamedQuery("Etudiant.findByNom");
    p.setParameter("n","Ines");
    List<Etudiant> list=(List<Etudiant>)p.getResultList();
    for (Etudiant e:list){
        System.out.println("Result :"+e);
    }
    Query q=em.createNamedQuery("Etudiant.findAll");
    List<Etudiant> List=(List<Etudiant>)q.getResultList();
    }
  }





