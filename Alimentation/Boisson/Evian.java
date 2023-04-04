public class Evian extends Boisson implements Temperature{
  private final double cout=0.34;
  private final double prob=0.3;//proba pour les glaçons
  private final double calorie=0;


  public Evian(){
    super("Evian",3.2,50);
  }

  public Evian clone(){
    Evian e=new Evian();
    return e;
  }

  public double getCalorie(){
    return calorie;
  }

  public double coutdeProd(){
    return cout;
  }
  
  public String toString(){
    return super.toString()+" cl";
  }

  public String setFroid_Chaud(){
    return "Evian froid";
  }

 
  public double temps_preparation(){return 0.0;}

  public void avecGlacon(){
    if(Math.random()<prob){
      System.out.println("avec glaçon");
    }
    else{
      System.out.println("sans glaçon");
      }
  }
  
  public void boire(){
    System.out.println("on boit Evian");
  }
  
  public void tempPourBoire(){
    System.out.println("Son volume est réduit 25ml à chque gorgée");
  }

 
}
