package DomaciRad.D_24_Miroslav_Obradov;
//Napraviti klasu Namirnica. Ona ima atribute za naziv i cenu. Dodati konstuktor i get metode za ovu klasu.
//        Zatim napraviti klasu Korpa. Unutar korpe imamo listu namirnica.
//        Osim konstuktora definisati:
//        - metoda int suma(ArrayList<Namirnica> lista) - vraca ukupnu cenu svih namirnica iz korpe.
//        - metoda boolean nalaziSe(Namirnica n) - vraca true ukoliko se neka namirnica nalazi u korpi.
//        - metoda stampaj() - istampace sve namirnice iz liste.
//        U glavnoj klasi napraviti listu namirnica koju cete proslediti konstruktoru klase Korpa.


public class Main {
    public static void main(String[] args) {


    Namirnica n1 = new Namirnica("so", 90);
    Namirnica n2 = new Namirnica("fusili", 280);
    Namirnica n3 = new Namirnica("spagete", 189);
    Namirnica n4 = new Namirnica("paradajz", 87);
    Namirnica n5 = new Namirnica("masline", 216);

    Korpa k1 = new Korpa();
        k1.dodavanjeNamirnica(n1);
        k1.dodavanjeNamirnica(n2);
        k1.dodavanjeNamirnica(n4);
        k1.dodavanjeNamirnica(n5);
        k1.stampa();

        k1.nalaziSe(n1);
k1.stampa2();




}
}