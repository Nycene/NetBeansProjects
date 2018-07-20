/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Naycene Boussoffara
 */
@WebService(serviceName = "TimeWS")
@Stateless()
public class TimeWS {


    /**
     * Web service operation
     */
    @WebMethod(operationName = "temps_en_minutes")
    public int temps_en_minutes(@WebParam(name = "heures") int heures, @WebParam(name = "minutes") int minutes) {
        int result=heures*60+minutes;
        return result;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "afficher_heure_format")
    public String afficher_heure_format(@WebParam(name = "heures") int heures, @WebParam(name = "minutes") int minutes) {
        return(heures+"h :"+minutes);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "decalageHoraire")
    public int decalageHoraire(@WebParam(name = "heure1") int heure1, @WebParam(name = "minute1") int minute1, @WebParam(name = "heure2") int heure2, @WebParam(name = "minute2") int minute2) {
        int result=temps_en_minutes(heure2, minute2)-temps_en_minutes(heure1, minute1);
        if (result<0) return (result*(-1));
        return result;
    }
}
