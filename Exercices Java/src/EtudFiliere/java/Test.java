/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EtudFiliere.java;

/**
 *
 * @author Naycene Boussoffara
 */
public class Test {
    public static void main(String[] args){
        Filiere F1[];
        F1=new Filiere[6];
        F1[0]=new Filiere("2","Génie Informatique");
        F1[1]=new Filiere("5","Génie Civil");
        F1[2]=new Filiere("4","Génie Math");
        F1[3]=new Filiere("7","Génie Mécanique");
        F1[4]=new Filiere("8","Génie Electrique");
        F1[5]=new Filiere("2","Industriel");
        Etudiant E1[];
        E1=new Etudiant[6];
        E1[0]=new Etudiant("Ala","Selmi","20-10-1995",F1[0]);
        E1[1]=new Etudiant("BAla","Selmi","20-10-1995",F1[1]);
        E1[2]=new Etudiant("CAla","Selmi","20-10-1995",F1[5]);
        E1[3]=new Etudiant("DAla","Selmi","20-10-1995",F1[4]);
        E1[4]=new Etudiant("EAla","Selmi","20-10-1995",F1[2]);
         System.out.println("Etudiant par Filiere :\n");
        for (Filiere f:F1) {
            System.out.println(f);
            int compteur = 0;
            for (Etudiant e: E1){
                if (e.getFiliere().getLibelle()==f.getLibelle()){
                    System.out.println("\t"+e);
                    compteur++;
            }
                if (compteur==0)
                System.out.println("\t Aucun Etudiant dans cette Filiere");
        }
    }}}

