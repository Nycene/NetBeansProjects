package Collection2;
import java.util.ArrayList;
import java.util.List;

public class SalleService implements IDao<Salle>{
    //Attributs
    List <Salle> salles;
    //Constructeur 
    public SalleService(){
    salles=new ArrayList<>();
    }
    @Override
    public boolean create(Salle S){
        return salles.add(S);
    }

    @Override
    public boolean delete (Salle S){
    return salles.remove(S);
    }
    @Override
    public boolean update (Salle S){
        for (Salle s:salles){
            if (s.getId()==S.getId()){
                s.setId(S.getId());
                s.setLibelle(S.getLibelle());
                return true;
            }
        } return false;
    }
    @Override
    public Salle findById (int id){
        for (Salle s:salles){
            if (s.getId()==id)
                return s;
        }return null;
    }
    
    @Override
    public List <Salle> findAll(){
        return salles;
    }
}
    
