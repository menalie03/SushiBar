public abstract class Boisson extends Alimentation{
    protected double volume;

    public Boisson(String nom, double prix, double volume){
        super(nom,prix);
        this.volume=volume;

    }

    public String toString(){
        return super.toString()+" "+this.volume;
    }

    public abstract void boire();
    public abstract void tempPourBoire();
}