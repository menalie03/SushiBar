public class Ramen extends Plats implements Temperature{
  private final int [] quantite={15,0,0,0,5};

  public Ramen(){
    super("Ramen ",12);
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
    return 8;}

  public void avecGlacon(){ }
} 