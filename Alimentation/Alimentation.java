public abstract class Alimentation{
  protected String nom;
  protected double prix;
  protected Ingredient[] Ingr=new Ingredient[5];//ecrit ses cal
  
  public Alimentation(String nom, double prix){
    this.nom=nom;
    this.prix=prix;
    /*Singleton sing=Singleton.creerInstance();
    Ingr=sing;*/
    Ingr[0]=new Ingredient("feculent", 0.1, 20);/*15g*/
    Ingr[1]=new Ingredient("fruits", 0.3, 7.5);
    Ingr[2]=new Ingredient("legumes", 0.1, 9.75);
    Ingr[3]=new Ingredient("produits laitiers", 0.5, 60);
    Ingr[4]=new Ingredient("viande&poisson", 1, 30);
    
  }

  public String toString(){
    return nom+" : "+prix+" euros,\t\t";
  }

  public double getPrix(){
    return prix;
  }
 
  public abstract double getCalorie();
  public abstract double coutdeProd();


}


