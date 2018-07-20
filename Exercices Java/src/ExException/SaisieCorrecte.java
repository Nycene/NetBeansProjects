package ExException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SaisieCorrecte  {
    public static void saisieCorrecte() throws Excep10{
        System.out.println("Donner un entier :\n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<10)
            throw new Excep10(n);
        System.out.println("L'entier saisi est: \n"+n);
        
    }
    public static void main (String[] argv) throws Excep10{
        while (true){
        try {
            saisieCorrecte();
            break;
        }
        catch (InputMismatchException e){
            System.out.println("Erreur de saisie\n");
        }
        finally {
            System.out.println("Fin\n");
        }

    }}
}
