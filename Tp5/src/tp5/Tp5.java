package tp5;

public class Tp5 {
int N,max=7;
public Tp5(int N) throws ErrConst{
    if (N<0) 
    { throw new ErrConst("Nombre saisi negatif");}
    else 
        this.N=N;
}
public int somme(int a) throws ErrSomme{
    int S = 0;
    if(N+a>max) 
        throw new ErrSomme("Somme depasse le maximum");
    else 
        S=N+a;
    return S;
}
public double produit(int a) throws ErrProduit{
    int P=1;
    if(N*a>max)
        throw new ErrProduit("Produit depasse le maximum");
    else
        return P=N*a;
}
public static void main(String[] args){
        try {
            Tp5 e =new Tp5(-2);
            int S=e.somme(1);
            double P=e.produit(7);
        } 
        
        catch (ErrConst e) {
            System.out.println(e.getMessage());
        }
        catch (ErrProduit e){
            System.out.println(e.getMessage());
        }
        catch(ErrSomme e){
            System.out.println(e.getMessage());
        }
}
       
        
}


