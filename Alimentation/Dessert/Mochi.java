public class Mochi extends Dessert{
  private final int [] quantite={2,1,0,1,0};
  private String gout;

  public Mochi (String gout){
    super("Mochi "+gout,3.5);
  }

  public double coutdeProd(){
    double c=0.0;
    for ( int i=0;i<5;i++){
      c+=(super.Ingr[i].getPrix())*quantite[i];
    }
    return c;
  }
  
  public double getCalorie(){
    double calorie=0.0;
    for ( int i=0;i<5;i++){
      calorie+=(super.Ingr[i].getCalorie())*quantite[i];
    }
    return calorie;
  }

  
}