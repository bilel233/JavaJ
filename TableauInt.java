public class TableauInt{
	private int[] tab;

	public TableauInt(){
		tab = new int[10];
		for(int i=0;i<tab.length;i++){
			tab[i]=(int)Math.random()%101;
		}

	}
	public TableauInt(int n){
		tab = new int[n]; // le tableau à n cases
		for(int i=n;i<tab.length;i++){
			tab[i] = n+i;
		}
	}
	// ajout des methodes

	public String toString(){
		String s = "";
		s = s + "["+tab[0];
		for(int i=1; i< tab.length;i++){
			s = s + ","+tab[i]+",";
		}
		s+="]";
		return s;
	}
	public int rangMax(){
		int rang = 0;
		for(int i=0;i<tab.length;i++){
			if (tab[i] > tab[i+1]){
				rang = i;
			}
		}
		return rang;
	}
}