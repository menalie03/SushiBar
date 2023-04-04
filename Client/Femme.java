public class Femme extends Client{
  public Femme(){
    super(2200.0);
  }

  public boolean rassasie(){
    if(budget_calorique<=0){
        System.out.println("La femme sort.");
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