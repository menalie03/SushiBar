public class Biere extends Boisson implements Temperature,Alcoolise{ 
  private final double cout=2.3;
  private final double prob=0.3;
  private final double calorie=200;

  public Biere(){
    super("Bière",4.5,33);
  }
  
  public String toString(){
    return super.toString()+" cl";
  }

  public String setFroid_Chaud(){
    return "Bière froid";
  }

  public double coutdeProd(){
    return cout;
  }
  
  public double getCalorie(){
    return calorie;
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
    System.out.println("on boit le bière");
  }
  
  public void tempPourBoire(){
    System.out.println("Son volume est réduit 10ml à chque gorgée");
  }


  public double degre_alcool(){
    System.out.println("Le degré d'alcool de bière est 5");
    return 5;
  }
} 

