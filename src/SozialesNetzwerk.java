import java.util.ArrayList;

public class SozialesNetzwerk {
    private ArrayList<Nachricht> nachrichtenliste = new ArrayList<Nachricht>();
    private ArrayList<Person> mitgliederliste = new ArrayList<Person>();
    public void hinzufuegenMitglied (Person person){
        this.mitgliederliste.add (person);
    }

    public void hinzufuegenNachricht (Nachricht nachricht){
        this.nachrichtenliste.add (nachricht) ;
    }

    public String getAlleNachrichten (){
        String text="";
        for (Nachricht n: this.nachrichtenliste) {
            text += n.getNachricht();
        }
        return text;
    }
}










