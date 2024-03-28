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

        System.out.println("Erzeugtes Passwort: "+getPassword("Viel Spaß in der Mittagspause und dann Frohe Ostern") );
    }

    private static String getPassword(String str){

        var words = str.split(" ");

        String password ="";

        for(int i = 0; i < words.length; i++){
            if(i%2 == 0){
                password+=words[i].substring(0,1).toUpperCase();
            }
            else{
                password+=words[i].substring(0,1).toLowerCase();
            }
        }
        return password;
    }


}