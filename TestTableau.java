public class TestTableau{
	public static void main(String[] args){
		TableauInt T = new TableauInt();
		TableauInt U = new TableauInt(20);

		System.out.println(U.toString());
		System.out.println(T.toString());

		System.out.println(U.rangMax()+" "+U.somme());
		System.out.println(T.rangMax()+" "+T.somme());
	}
}