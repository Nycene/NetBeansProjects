package ProfSpec.java;

/**
 *
 * @author Naycene Boussoffara
 */
public class Test {
    public static void main(String[] args) {
    }
        Specialite[] specialites =new Specialite[5];
        Professeur[] professeur=new Professeur[4];
        specialites[0]=new Specialite("2","Java/JEE");
        specialites[1]=new Specialite("5",".net");
        specialites[2]=new Specialite("4","Gestion de projet");
        specialites[3]=new Specialite("7","CISCO");
        specialites[4]=new Specialite("55","PHP");
        professeur[0]=new Professeur("Amal","Saafi",525252,"lala@la",specialites[0]);
        professeur[1]=new Professeur("Amel","Jenhani",525252,"lala@la",specialites[0]);
        professeur[2]=new Professeur("Said","Alami",525252,"lala@la",specialites[3]);
        professeur[3]=new Professeur("Reda","Aloui",525252,"lala@la",specialites[3]);
        System.out.println("Professeur par specialité :\n");
        for (Specialite s:specialites) {
            System.out.println(s);
            int compteur = 0;
            for (Professeur p: professeur){
                if (p.getSpecialité().getLibelle()==s.getLibelle()){
                    System.out.println("\t"+p);
                    compteur++;
            }
                if (compteur==0)
                System.out.println("\t Aucun professeur dans cette specialité");
        }
        
    }
}
