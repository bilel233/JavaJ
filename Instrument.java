public class Instrument{
	protected double poids;
	protected double prix;

	protected Instrument(double poids,double prix){
		this.poids=poids;
		this.prix=prix;
	}


	public String toString(){
		return "le poids de l'instrument est"+poids+"et son prix"+prix;
	}
}