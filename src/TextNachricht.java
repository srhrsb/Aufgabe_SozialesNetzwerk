public class TextNachricht extends Nachricht{
    private String nachricht;
    public TextNachricht() {
        this.nachricht ="";
    }
    public TextNachricht(String nachricht, Person absender){
        super (absender) ;
        this.nachricht=nachricht;
    }
    public String getNachricht (){
        String ergebnis =absender.getVorname()+" "+absender.getNachname()+
                         ": "+this.nachricht+" ("+this.likes+" Likes) \n";

        return ergebnis;
    }


}


