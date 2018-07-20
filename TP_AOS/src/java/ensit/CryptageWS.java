/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ensit;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Naycene Boussoffara
 */
@WebService(serviceName = "CryptageWS")
@Stateless()
public class CryptageWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    @WebMethod(operationName = "crypter_Message")
    public String crypter_Message(@WebParam(name = "crypter_Message")String msg){
        int i ;
        char c;
        char[] message = msg.toCharArray();
        for (i=0;i<msg.length()-1;i=+2){
            c=message[i];
            message[i]=message[i+1];
            message[i+1]=c;
        }
        msg=new String(message);
        return msg;
    }
}
