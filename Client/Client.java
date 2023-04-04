import java.util.ArrayList;

public abstract class Client{
  protected double budget_calorique;
  public final double pchoix=0.6;
  protected ArrayList<Alimentation> tab;//choses consommées
  public boolean is_gone;

  
  public Client(double kal){
    tab=new ArrayList<Alimentation>();
    budget_calorique=kal;
    is_gone=false;
  }

  public double getBudget(){
    return budget_calorique;
  }
  
  public boolean seServir(Alimentation a){
    if (budget_calorique>=a.getCalorie()){
      if(pchoix>Math.random()){
          tab.add(a);
          budget_calorique-=a.getCalorie(); 
          return true;
      }
    }
    return false;
  }

  public String toString(){
    String s="Le budget du client : "+budget_calorique+" et mange[ ";
    for(Alimentation a : tab){
      s+=a.toString()+"\t";
    }
    s+=" ]";  
    return s;
  }

  public void setIs_gone(){
    is_gone=true;
  }
  
  public abstract boolean rassasie();
  public abstract double facture();
}