import java.util.ArrayList;

public class SushiBar{
  private Table clients;
  private int nb_alim_present;//nb d'aliments sur la table
  private double depense;
  public final int MAX_ALIM=30;//nb max d'aliments sur la table
  private ArrayList <Alimentation> tab;

  public final Boisson [] MENUBOISSON = {new Biere(),new Cafe(),new Coca(),new Evian(), new Jus(), new Sake(),new The()};
 
  public final Dessert [] MENUDESSERT = {new Dorayaki(), new Mochi("Mangue"), new Mochi("Chocolat"), new Mochi("Coco"), new Mochi("Matcha"), new Mochi("Vanille"), new Taiyaki(), new Yuzucheese()};
  
  public final Plats [] MENUPLAT = {new Karaage(), new Ramen(), new Sashimi(), new SushiLegume(), new SushiViande(), new Yakitori()};


  public SushiBar(){
    tab= new ArrayList <Alimentation>();
    clients= new Table();
    nb_alim_present=0;
    depense=0.0;

  }

  public String ajout_aliments(int nb_alim_supp)throws TabException{
    String s="\nOnt été ajouté les aliments suivants: ";
    Alimentation alim_a_ajouter;
    if((MAX_ALIM-nb_alim_present)<nb_alim_supp){
      throw new TabException("il n'y a  plus de place");}
    for (int i=0;i<nb_alim_supp;i++){
      int type=(int)(Math.random()*3);//choix de si c'est une boisson, un plat ou un dessert
      if (type==1){
        int nb_alim_du_type=MENUBOISSON.length;
        alim_a_ajouter=MENUBOISSON[(int)(Math.random()*nb_alim_du_type)];
      } else if (type==2){
        int nb_alim_du_type=MENUDESSERT.length;
        alim_a_ajouter=MENUDESSERT[(int)(Math.random()*nb_alim_du_type)];
      } else{
        int nb_alim_du_type=MENUPLAT.length;
        alim_a_ajouter=MENUPLAT[(int)(Math.random()*nb_alim_du_type)];
      }
      tab.add(alim_a_ajouter);
      depense+=alim_a_ajouter.coutdeProd();
      s+=alim_a_ajouter.toString();
    }
    nb_alim_present+=nb_alim_supp;
    return s;
  }

  public String remove_aliments(){
    String s="\nOnt été enlevé de la ronde par les clients les aliments suivants: ";
    for (Alimentation a : tab){
      for (Client c : clients.tab_Clients){
        if (c.seServir(a)){
          s+=a.toString() ;
          tab.remove(a);
        }
      }
    }
    return s;
  }
  
  public double sommeDepense(){
    return depense;
  }
}