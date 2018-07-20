package Heritage;

/**
 *
 * @author Naycene Boussoffara
 */
public class Application {
    public static void main(String[] args){
    Etudiant E1=new Etudiant("Douk","Rashid",2552);
    Etudiant E2=new Etudiant("Douja","Rania",5252);
    Employe Emp1=new Employe("Hammemi","Sleh",250);
    Employe Emp2=new Employe("Houiji","Slim",500);
    Professeur P1=new Professeur("Ramzi","farhat",700,"Info");
    Professeur P2=new Professeur("Mariem","Riahi",900,"Math");
    System.out.print(E1+"\n");
    System.out.print(E2+"\n");
    System.out.print(Emp1+"\n");
    System.out.print(Emp2+"\n");
    System.out.print(P1+"\n");
    System.out.print(P2+"\n");
    
    }
}
