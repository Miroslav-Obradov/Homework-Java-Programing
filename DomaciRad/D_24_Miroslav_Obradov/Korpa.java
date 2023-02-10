package DomaciRad.D_24_Miroslav_Obradov;
//Napraviti klasu Namirnica. Ona ima atribute za naziv i cenu. Dodati konstuktor i get metode za ovu klasu.
//        Zatim napraviti klasu Korpa. Unutar korpe imamo listu namirnica.
//        Osim konstuktora definisati:
//        - metoda int suma(ArrayList<Namirnica> lista) - vraca ukupnu cenu svih namirnica iz korpe.
//        - metoda boolean nalaziSe(Namirnica n) - vraca true ukoliko se neka namirnica nalazi u korpi.
//        - metoda stampaj() - istampace sve namirnice iz liste.
//        U glavnoj klasi napraviti listu namirnica koju cete proslediti konstruktoru klase Korpa.
import OOP18.Sastojak;

import java.util.ArrayList;

public class Korpa {

    ArrayList<Namirnica> listaNamirnica;
    boolean nalaziSe;


    public Korpa() {
        this.listaNamirnica = new ArrayList<>();


    }

    public void dodavanjeNamirnica(Namirnica namirnica) {
        listaNamirnica.add(namirnica);
    }
        public int sumaNamirnica() {
            int suma = 0;
            for (int i = 0; i < listaNamirnica.size(); i++) {
                suma = suma + listaNamirnica.get(i).getCena();
            }
            return suma;
        }

        public void stampa() {
            System.out.println("Namirnice u korpi su: ");
            for (int i = 0; i < listaNamirnica.size(); i++) {
                System.out.println(listaNamirnica.get(i).getNaziv());
            }
            System.out.println("Ukupna cena korpe je " + sumaNamirnica());

        }



    public boolean nalaziSe(Namirnica namirnica) {

        for (int i = 0; i < listaNamirnica.size(); i++) {
        if(listaNamirnica.get(i).getNaziv().equals(namirnica.getNaziv())){
            nalaziSe = true;
        }

        }
            return false;

}
    public void stampa2() {
        System.out.println("Izabrani artikal se nalazi u korpi " + nalaziSe);
}

}