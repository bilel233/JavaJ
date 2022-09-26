public class Quizz1{
    public static void main(String[] args){
        double val = Math.random()*20 + 10;
        System.out.println(val);
        int res = (int)(Math.random()*(101)+50);
        System.out.println(res);
        boolean b = Math.random() < 0.25;
        System.out.println(b);
        char c = (char)(Math.random()*('z'-'a')+'a');
        System.out.println(c);

    }
}