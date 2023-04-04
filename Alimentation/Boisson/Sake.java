public class Sake extends Boisson implements Temperature,Alcoolise{
  private final double cout=8.1;
  private final double prob=0.3;
  private final double calorie=133;

  public Sake(){
    super("Sake",10,15);
  }
  
  public String toString(){
    return super.toString()+" cl";
  }

  public double coutdeProd(){
    return cout;
  }
  
  public double getCalorie(){
    return calorie;
  }
  
  public String setFroid_Chaud(){
    return "Saké normal";
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
    System.out.println("on boit le saké");
  }
  
  public void tempPourBoire(){
    System.out.println("Son volume est réduit 10ml à chaque gorgée");
  }


  public double degre_alcool(){
    System.out.println("Le degré d'alcool du Sake est 15.4");
    return 15.4;
  }
} 

