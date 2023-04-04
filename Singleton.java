public class Singleton{
  private static Singleton instance=null;
  private Singleton(){
    Ingredient[] tab=new Ingredient[5];
    tab[0]=new Ingredient("feculent", 0.1, 20);/*15g*/
    tab[1]=new Ingredient("fruits", 0.1, 7.5);
    tab[2]=new Ingredient("legumes", 0.1, 9.75);
    tab[3]=new Ingredient("produits laitiers", 0.2, 60);
    tab[4]=new Ingredient("viande&poisson", 1, 30);
    
  }

  public static Singleton creerInstance(){
    if(instance==null){
      return new Singleton();
      }
    return instance;
  }

public static void changerInstance(){
    instance=new Singleton();
  }

}