public class Person {
    private String nachname;
    private String vorname;
    public Person(){
        this.nachname = "";
        this.vorname = "";
    }

    public Person(String nn, String vn){
        this.nachname=nn;
        this.vorname=vn;
    }

    public String getNachname(){
        return this.nachname;
    }
    public String getVorname(){
        return this. vorname;
    }
}
