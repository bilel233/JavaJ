public class Addition{
    private int x,y;
    public Addition(int x,int y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return "("+x+","+y+")" ;
    }
    public Addition addition(){
       Addition c = new Addition(x,y);
       c.x = c.x + this.x;
       c.y = c.y + this.y;
       return c;
    }
    

}