/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Naycene Boussoffara
 */
public class NewClass {
    public static String crypter_Message(String msg){
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
    public static void main(String[] args){
        String msg="Message";
        crypter_Message(msg);
        System.out.println(msg);
    }
}
