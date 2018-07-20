/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client_soap;

/**
 *
 * @author Naycene Boussoffara
 */
public class Client_SOAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int parameter=5;
        int parameter1=33;
        int result = add(parameter,parameter1);
        System.out.println("Result = " + result);
    }

    private static int add(int parameter, int parameter1) {
        entities.NewWebService_Service service = new entities.NewWebService_Service();
        entities.NewWebService port = service.getNewWebServicePort();
        return port.add(parameter, parameter1);
    }
    
}
