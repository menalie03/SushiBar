public class Table{
  public Client [] tab_Clients;
  private final int nbplace=20;
  private int nbpers=0;
  private double vente;

  public Table(){
    tab_Clients=new Client[nbplace]; 
    vente=0.0; 
  }

  public String phrase_ouverture(){
    return "le restaurant ouvre!";
  }
  
  public void ouverture(Client c)throws TabException{
    if(nbpers>=tab_Clients.length)
      throw new TabException("il n'y a  plus de place");
    tab_Clients[nbpers]=c;
    nbpers++;
  }

  public void removeAndAdd() throws TabException{
   try{
   for (int i=0;i<tab_Clients.length;i++){
     if (tab_Clients[i].rassasie()){
       vente+=tab_Clients[i].facture();
       tab_Clients[i].setIs_gone();//remplace le client parti/absent
       nbpers--;
     }
   }}
   catch(TabException r){System.out.println("il n'y a plus personne");}
   finally{
   for (int i=0;i<tab_Clients.length;i++){
     if (tab_Clients[i].is_gone){
       if(Math.random()<0.5){
         tab_Clients[i]=new Femme();}
        else{
          tab_Clients[i]=new Homme();
        }
        nbpers++;
      }
    }
   }
  }
  
  public String fermeture(){
   for(int i=0;i<tab_Clients.length;i++){
     vente+=tab_Clients[i].facture();
     tab_Clients[i].is_gone=true;
     nbpers=0;
   }
   return "\nLe restaurant est fermé !";
 }

  public double getVente(){
    return vente;
  }

  public int getNbPlace(){
    return nbplace;
  }
}
