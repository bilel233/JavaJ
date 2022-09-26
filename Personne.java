public class Personne{
    protected final  String nom;
    protected String numTel;
    private int nbEnfants;

    public Personne(String nom,String numTel){
        this.nom=nom;
        this.numTel=numTel;
        nbEnfants=0;
    }
    public String getNom(){
        return nom;
    }
    public String numTel(){
        return numTel;
    }
    protected int getNbEnfants(){
        return nbEnfants;
    }
    public void ajouterEnfant(){
        nbEnfants++;
    }

    public class Etudiant extends Personne{
        private String cursus;

        public  Etudiant(String n,String t,String c){
            super(n,t);
            cursus = c;
        }
        public boolean estEnL2(){
            return cursus.equals("L2");
        }
        public void afficherInfo(){
            System.out.println(nom);
        }
        public void modifierInfo(){
           // nom="toto";
           numTel="0102030405";
        }
    }
}