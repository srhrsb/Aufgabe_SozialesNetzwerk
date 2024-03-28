public abstract class Nachricht {
    protected Person absender;
    protected int likes;

    public Nachricht (){
        this.absender=null;
        this.likes=0;
    }
    public Nachricht(Person absender){
        this.absender=absender;
        this.likes=0;
    }

    public void hinzufuegenLike (){
        this.likes++;
    }

    public abstract String getNachricht ();
}
