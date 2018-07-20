package Formes;

import java.text.DecimalFormat;

/**
 *
 * @author Naycene Boussoffara
 */
public class Test {
	public static void main(String[] argv) {
		DecimalFormat df = new DecimalFormat(".##");
		Forme[] figures = new Forme[3];
		figures[0] = new Carre(2); // Création d'un carré de 2 cm de coté
		figures[1] = new Cercle(3); // Création d'un cercle de 3 cm de rayon
		figures[2] = new Carre(5.2); // Création d'un carré de 5,2 cm de coté
            for (Forme figure : figures) {
                System.out.println(figure + " surface = " + df.format(figure.getSurface()) + " cm2");
            }
	}
 
}


