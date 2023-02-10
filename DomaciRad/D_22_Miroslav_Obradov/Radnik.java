package DomaciRad.D_22_Miroslav_Obradov;
//Napraviti klasu Radnik koja ima atribute id, naziv radnika, godine iskustva i plata.
 //Investitor ce imati dodatno polje za broj zgrada koje je do sada digao.
//        Istampati njihove podatke sa tim da racunamo 20% vecu platu sefu smene
//        i fizikalcu ako imaju vise od 5 godina iskustva i 30% vecu platu investitoru ako je digao bar 5 zgrada.
public class Radnik {

    int ID;
    String nazivRadnika;
    int godineIskustva;
    double plata;

    public Radnik(int ID, String nazivRadnika, int godineIskustva, double plata) {
        this.ID = ID;
        this.nazivRadnika = nazivRadnika;
        this.godineIskustva = godineIskustva;
        this.plata = plata;
    }
    public double uvecanje(){
        if(godineIskustva > 5){
           return plata = plata*1.2;
        }
        return plata;
    }
    public void stampa(){
        System.out.println("ID: " + ID + "." + " Ime i prezime: "+ nazivRadnika + " godine iskustva: " + godineIskustva);
        if(godineIskustva > 5){
        System.out.println("Plata za staz veci od 5 godina je uvecana za 20% " + (plata = plata*1.2));
            System.out.println("------------------------");
    }else{
            System.out.println("Plata za staz manji ili jednak od 5 godina je ista " + plata);
            System.out.println("------------------------");
        }
    }
}
