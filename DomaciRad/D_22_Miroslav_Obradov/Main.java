package DomaciRad.D_22_Miroslav_Obradov;
//Zadatak 1.
//        Napraviti klasu Radnik koja ima atribute id, naziv radnika, godine iskustva i plata.
//        Klase Fizikalac, SefSmene i Investitor nasledjuju klasu Radnik.
//        Investitor ce imati dodatno polje za broj zgrada koje je do sada digao.
//        Istampati njihove podatke sa tim da racunamo 20% vecu platu sefu smene
//        i fizikalcu ako imaju vise od 5 godina iskustva i 30% vecu platu investitoru ako je digao bar 5 zgrada.
public class Main {
    public static void main(String[] args) {

    Fizikalac f1 = new Fizikalac(1, "Pera Peric", 4,50000);
    f1.stampa();

    Radnik r1 = new Radnik(2, "Zika Zivac",6, 50000);
        r1.stampa();

    Investitor i1 = new Investitor(3,"Mitar Miric", 6,50000,6);
        i1.stampa();
}
}