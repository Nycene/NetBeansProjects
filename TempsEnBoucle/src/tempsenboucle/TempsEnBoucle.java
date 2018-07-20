/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempsenboucle;

import java.util.Scanner;

/**
 *
 * @author Naycene Boussoffara
 */
public class TempsEnBoucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Veuillez saisir heures1");
        int h1=sc.nextInt();
        System.out.println("Veuillez saisir minutes1");
        int m1=sc.nextInt();
        System.out.println("Veuillez saisir heures2");
        int h2=sc.nextInt();
        System.out.println("Veuillez saisir minutes2");
        int m2=sc.nextInt();
        
        while (decalageHoraire(h1, m1, h2, m2)!=0){
            System.out.println("Format Premiere heure\n");
            System.out.println(afficherHeureFormat(h1, m1));
            System.out.println("Format Deuxieme heure\n");
            System.out.println(afficherHeureFormat(h2, m2));
            System.out.println("****************\n");
            System.out.println("Decalage entre les deux heures entrées : \n");
            System.out.println(decalageHoraire(h1, m1, h2, m2));
            sc=new Scanner(System.in);
            System.out.println("Veuillez saisir heures1");
            h1=sc.nextInt();
            System.out.println("Veuillez saisir minutes1");
            m1=sc.nextInt();
            System.out.println("Veuillez saisir heures2");
            h2=sc.nextInt();
            System.out.println("Veuillez saisir minutes2");
            m2=sc.nextInt();
            
        }
    }

    private static String afficherHeureFormat(int heures, int minutes) {
        services.TimeWS_Service service = new services.TimeWS_Service();
        services.TimeWS port = service.getTimeWSPort();
        return port.afficherHeureFormat(heures, minutes);
    }

    private static int decalageHoraire(int heure1, int minute1, int heure2, int minute2) {
        services.TimeWS_Service service = new services.TimeWS_Service();
        services.TimeWS port = service.getTimeWSPort();
        return port.decalageHoraire(heure1, minute1, heure2, minute2);
    }

    private static int tempsEnMinutes(int heures, int minutes) {
        services.TimeWS_Service service = new services.TimeWS_Service();
        services.TimeWS port = service.getTimeWSPort();
        return port.tempsEnMinutes(heures, minutes);
    }
    
}
