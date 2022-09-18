public class Piano extends Instrument{

	protected Piano(double poids,double prix){
		super(poids,prix);
	}

	public void jouer(){
		System.out.println("le piano joue");
		
	}

}