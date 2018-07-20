package CollectionExercice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Naycene Boussoffara
 */
public class Test {
    public static void main(String[] args){
    List<Stagiaire> L1 =new ArrayList<Stagiaire>();
    Stagiaire S1=new Stagiaire("Asma","Fakhfakh");
    L1.add(S1);
    L1.add(new Stagiaire("Dhia","Nsit la9ab"));
    for (Stagiaire s:L1){
        System.out.println(s);
    }
    Collection.sort(L1);
}
}
