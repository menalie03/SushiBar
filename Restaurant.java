public class Restaurant{
  private Table t;
  private SushiBar sb;
  private final int MAX_AJOUT_PAR_TOUR=5; 

  public Restaurant(){
    t=new Table();
    sb=new SushiBar();
  }

  public String simulation(int horaires_en_min, int temps_entre_tour){
    String s="";
    s+=t.phrase_ouverture()+" pour "+horaires_en_min+" min aujourd'hui !\n";
    try{for (int n=0;n<t.getNbPlace();n++){//ajouts des premiers clients
      if(Math.random()<0.5){
        t.ouverture(new Homme());
      }else{
        t.ouverture(new Femme());
      }
     }
    }
    catch(TabException e){System.out.println(e.toString());}
    
    try{for (int min=0; min<horaires_en_min;min+=temps_entre_tour){
      int i=1;
      s+="\nTour "+i+":\n";
      s+=sb.ajout_aliments((int)(Math.random()*(MAX_AJOUT_PAR_TOUR+1)));
      s+=sb.remove_aliments();
      t.remove()
      t.Add(); 
      i++;
    }
     }
    catch(TabException e1){System.out.println(e1.toString());}
    return s+t.fermeture();
  }

  public boolean rentable(){
    return (t.getVente()>sb.sommeDepense());
  }

  public double ecart_rentabilite(){
    if (rentable()){
      return t.getVente()-sb.sommeDepense();
    } 
    return sb.sommeDepense()-t.getVente();
  }
}