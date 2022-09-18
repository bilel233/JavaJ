public class TableauInt{
	private int[] tab;

	public TableauInt(){
		tab = new int[10];
		for(int i=0;i<tab.length;i++){
			tab[i]=(int)Math.random()%101;
		}
	}
}