/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection2;

/**
 *
 * @author Naycene Boussoffara
 */
public class Test {
    public static void main(String[] args){
    SalleService S=new SalleService();
    S.create(new Salle());
    S.create(new Salle());
    S.create(new Salle());
    S.create(new Salle());
    S.create(new Salle());
    
    
    for (Salle s: S.salles){
    System.out.println(s);
}  
    //Delete a class
    S.delete(S.findById(2));
    S.update(S.findById(3));
    for (Salle s: S.salles){
    System.out.println(s);
    
}
}}