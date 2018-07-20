/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ensit.gestionetudiants.ejb;
import edu.ensit.gestionetudiants.model.Etudiant;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Naycene Boussoffara
 */
@Stateless
public class EtudiantService {
    @PersistenceContext(name="GestionEtudiantPU")
    private EntityManager em;
    public Long createEtudiant(Etudiant etudiant){
        return etudiant.getId();}
    
    public void updateEtudiant(Etudiant etudiant){
        em.merge(etudiant);
    }
    public void deleteEtudiant(Etudiant etudiant){
        updateEtudiant(etudiant);
        em.remove(etudiant);
    }
    public Etudiant findById(Long id){
        
      }
    public List<Etudiant> findAllEtudiant(){
        List<Etudiant> list = null;
    for (Etudiant e:list){
        System.out.println("Etudiant :"+e);
    }
        return null;
    }
    public List<Etudiant> findByNomEtudiant(String nom){
        return null;
        
    }
    
    
}
