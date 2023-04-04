public class Cafe extends Boisson implements Temperature{
  private final double cout=0.1;
  private final double prob=0.3;
  private final double calorie=0;


  public Cafe(){
    super("Café",1.5,1);//au lait, allongé, expresso
  }
   
  public String toString(){
    return super.toString()+" tasse";
  }


  public double coutdeProd(){
    return cout;
  }

  public double getCalorie(){
    return calorie;
  }

  public String setFroid_Chaud(){
    return "Café chaud";
  }
 
  public double temps_preparation(){return 2;}

  public void avecGlacon(){
    if(Math.random()<prob){
      System.out.println("avec glaçon");
    }
    else{
      System.out.println("sans glaçon");
      }
  }
  
  public void boire(){
    System.out.println("on boit du Café");
  }
  
  public void tempPourBoire(){
    System.out.println("Son volume est réduit 5ml à chaque gorgée");
  }

 
}
