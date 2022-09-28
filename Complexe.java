public class Complexe{
    private double reelle;
    private double imag;

    public Complexe(double reelle,double imag){
        this.reelle=reelle;
        this.imag=imag;

    }
    public Complexe(){
      this(Math.random()*(2),Math.random()*2);
    }

}