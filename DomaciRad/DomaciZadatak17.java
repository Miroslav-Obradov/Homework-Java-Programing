package DomaciRad;

import java.util.ArrayList;
import java.util.Scanner;

public class DomaciZadatak17 {
    public static void main(String[] args) {
        //        2. Napraviti proizvoljnu listu imena, zatim uneti ime koje zelite da izbacite iz liste,
//        ispisati poruku u zavisnosti od toga da li je izbaceno ili ne, i da li se uopste nalazi u listi.

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Zika");
        lista.add("Laza");
        lista.add("Mirko");
        lista.add("Pera");
        lista.add("Sasa");
        lista.add("Darko");
        lista.add("Micha");

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ime koje zelite da izbacite sa liste");
        String ime = sc.next();
        int size = 0;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(ime)) {
                lista.remove(ime);
                size = lista.size();
                System.out.println("Ime " + ime + " je izbaceno sa liste");
            }
        }
        if (!(lista.size() == size)){
            System.out.println("Ime " + ime + " nije na listi");
        }
    }
}
