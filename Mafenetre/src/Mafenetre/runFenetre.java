/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mafenetre;

import javax.swing.SwingUtilities;

/**
 *
 * @author Naycene Boussoffara
 */
public class runFenetre {
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				Mafenetre fenetre = new Mafenetre();
				fenetre.setVisible(true);
			}
		});
	}
}

