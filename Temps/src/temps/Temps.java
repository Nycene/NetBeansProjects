/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temps;

/**
 *
 * @author Naycene Boussoffara
 */
public class Temps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int heures1=14;
        int heures2=15;
        int minutes1=2;
        int minutes2=5;
        int minutes=42;
        int heures=7;
        
        String result1=afficherHeureFormat(heures, minutes);
        int result2=decalageHoraire(heures1, minutes1, heures2, minutes2);
        int result3=tempsEnMinutes(heures, minutes);
        System.out.println(result1+" /"+result2+" /"+result3);
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
