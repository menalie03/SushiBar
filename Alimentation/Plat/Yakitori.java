public class Yakitori extends Plats implements Temperature{
  private final int [] quantite={0,0,0,0,4};

  public Yakitori(){
    super("Yakitori ",6);
  }

  public double coutdeProd(){
    double c=0.0;
    for ( int i=0;i<5;i++){
      c+=super.Ingr[i].getPrix()*quantite[i];
    }
    return c;
  }
  
  public double getCalorie(){
    double calorie=0.0;
    for ( int i=0;i<5;i++){
      calorie+=super.Ingr[i].getCalorie()*quantite[i];
    }
    return calorie;
  }

  public String toString(){
    return super.toString();
  }



  public String setFroid_Chaud(){
    return "Plat chaud";
  }
 
  public double temps_preparation(){
    return 6;}
 
  public void avecGlacon(){ }

} 