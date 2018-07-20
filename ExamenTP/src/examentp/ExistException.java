
package examentp;

import java.util.List;

/**
 *
 * @author Naycene Boussoffara
 */
class ExistException extends Exception {
    public void Verif(Medicament M,int i,List L){
        
        if ((M.nom).equals(L.get(i)))
            System.out.println("Le nom du medicament n'existe pas");
        
    }
}
