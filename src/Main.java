public class Main {
    public static void main(String[] args) {
        //Soziales Netzwerk der Schule
        SozialesNetzwerk socialNetwork = new SozialesNetzwerk();

        //Personen der Schule
        Person p1=new Person ("Walton","Elizabeth");
        Person p2=new Person ("Walton", "John Boy") ;

        //Personen dem Netzwerk hinzufügen
        socialNetwork.hinzufuegenMitglied (p1);
        socialNetwork.hinzufuegenMitglied(p2);

        //Nachricht schreiben
        TextNachricht tn1 = new TextNachricht ("Gute Nacht JohnBoy!",p1);
        TextNachricht tn2 = new TextNachricht("Gute Nacht Elizabeth",p2);

        socialNetwork.hinzufuegenNachricht (tn1);
        socialNetwork.hinzufuegenNachricht (tn2) ;

        //Likes setzen
        tn1.hinzufuegenLike();
        tn2.hinzufuegenLike();

        //Nachrichten ausgeben
        System.out.println (socialNetwork.getAlleNachrichten ());
    }
}