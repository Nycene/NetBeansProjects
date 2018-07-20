package javaapplication3;
class ArithmeticTest {
    //class qui permet de tester les opérations arithmétiques 
    public static void main (String[] args) {
        //declaration de deux entiers et de deux réels
        int x;
        int y;
        double a;
        double b;
        
        //initiation des quatres variables 
        x=12;
        y=5;
        a=12.5;
        b=7;
        //affichage des deux entiers et de leur somme 
        System.out.println ("x + y vaut " + x + ", y vaut " + y);
        //calcul de l'addition 
        int z=x+y; 
        System.out.println ("L'addition vaut "+ z);
        // La soustraction de deux entiers
        int e=x-y;
        System.out.println("La soustraction vaut " +e);
        // La multiplication de deux entiers 
        int i=x*y;
        System.out.println("L'addition vaut " +i);
        
        
    }
}