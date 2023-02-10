package DomaciRad.D_24_Miroslav_Obradov;
//Napraviti klasu Namirnica. Ona ima atribute za naziv i cenu. Dodati konstuktor i get metode za ovu klasu.
//        Zatim napraviti klasu Korpa. Unutar korpe imamo listu namirnica.
//        Osim konstuktora definisati:
//        - metoda int suma(ArrayList<Namirnica> lista) - vraca ukupnu cenu svih namirnica iz korpe.
//        - metoda boolean nalaziSe(Namirnica n) - vraca true ukoliko se neka namirnica nalazi u korpi.
//        - metoda stampaj() - istampace sve namirnice iz liste.
//        U glavnoj klasi napraviti listu namirnica koju cete proslediti konstruktoru klase Korpa.
public class Namirnica {

    String naziv;
    int cena;

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getCena() {
        return cena;
    }

    public Namirnica(String naziv, int cena) {
        this.naziv = naziv;
        this.cena = cena;
    }
    public void stampa() {
        System.out.println("Namirnica " + this.naziv + " kosta " + this.cena + " dinara.");
    }
}
