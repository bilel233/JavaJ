public class Truc{
    private static int cpt=0;
    private int num;

    public Truc(){
        cpt ++;
        num=cpt;
    }
    public Truc(int x){
        num =x;
    }
    public static int getCpt(){
        return cpt;
    }
    public int getNum(){
        return num;
    }
}


// cpt est une variable de classe
// les instances de variables partagent la meme variable de classe


