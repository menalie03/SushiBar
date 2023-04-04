public class Ingredient{
    private String nom;
    private double prix_de_cout;
    private double calorie;


    public Ingredient(String nom,double prix_de_cout,double calorie){
      this.nom=nom;
      this.prix_de_cout=prix_de_cout;
      this.calorie=calorie;
      
    }

    public String getNom(){
      return nom;
    }
    public double getPrix(){
      return prix_de_cout;
    }

    public double getCalorie(){
      return calorie;
    }

    public String toString(){
      return nom+" : prix "+ prix_de_cout +" , calorie "+ calorie;
    }

}