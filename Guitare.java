public class Guitare extends Instrument{
	protected Guitare(double poids,double prix){
		super(poids,prix);
	}

	public String toString(){
		return super.toString();
	}
	public void jouer(){
		System.out.println("la guitare joue");
	}
}