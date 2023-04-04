public class Homme extends Client{
  public Homme(){
    super(2700.0);
  }

  public boolean rassasie(){
    if(budget_calorique<=0.0){ 
        System.out.println("L'homme sort.");
        return true;}
    return false;  
  }

  public double facture(){
    double fac=0.0;
    for (Alimentation a : tab){
      fac+=a.getPrix();
    }
    return fac;
  }
}