/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExException;

/**
 *
 * @author Naycene Boussoffara
 */
public class Excep10 extends Exception {
    public static void Controle(int nombre){
        if (nombre<10) 
                System.out.println("valeur <10\n");
        
    }

    Excep10(int n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
