public class Retro{
    public static void main(String[] args){
        int u0 = 1;
        int u1 = 2;
        int u;
        System.out.println(u0);
        System.out.println(u1);

        for(int i=1;i<=7;i++){
             u = u0+u1;
             u0=u1;
             u1=u;
             System.out.println(u);
        }

    }
}