class Main {//TestResto fait fctionnetr le code direct
  public static void main(String[] args) {
    /*int temps_ouverture=7*60;//7h de service
    int temps_entre_tour=10;//10 min entre chaque ajout d'aliments sur le sushi bar
    Restaurant resto=new Restaurant();
    System.out.println(resto.simulation(temps_ouverture, temps_entre_tour));
    if (resto.rentable()){
      System.out.println("le Sushi Bar a été rentable aujourd'hui pour "+((int)(temps_ouverture/60))+" heures de travail !!\n En effet le gain est de "+resto.ecart_rentabilite()+" euros.");
    }
    else{
      System.out.println("le Sushi Bar n'a pas été rentable aujourd'hui pour "+(temps_ouverture/60)+" heures de travail ..\n En effet la perte est de "+resto.ecart_rentabilite()+" euros.");
    }*/
    Table t= new Table();
    System.out.println(t.phrase_ouverture());
    try{for (int n=0;n<t.getNbPlace();n++){//ajouts des premiers clients
      if(Math.random()<0.5){
        t.ouverture(new Homme());
      }else{
        t.ouverture(new Femme());
      }
     } }
    catch(TabException e){System.out.println(e.toString());}

    System.out.println(t.toString());
    t.removeAndAdd();
    System.out.println("\n");

    SushiBar bar=new SushiBar();

    for(int i=0;i<bar.MENUBOISSON.length;i++){
      System.out.println(bar.MENUBOISSON[i]+" ");
    }
    System.out.println("\n");

    for(int i=0;i< bar.MENUDESSERT.length;i++){
      System.out.println(bar.MENUDESSERT[i]+" ");
    }
    System.out.println("\n");
  
    for(int i=0;i< bar.MENUPLAT.length;i++){
      System.out.println(bar.MENUPLAT[i]+" ");
    }   
    System.out.println("\n");

   
   


    
		/*Femme f=new Femme();
		System.out.println(f.toString());
		//f.rassasie();
		//System.out.println(f.facture());
    System.out.println("elle consomme mtn");
		System.out.println("elle s'est servie du Yuzucheese?"+f.seServir(new Yuzucheese()));
		System.out.println("elle s'est servie du Karaage?"+f.seServir(new Karaage()));
    System.out.println(f.getBudget());
		System.out.println(f.toString());*/

  
    

  }
}