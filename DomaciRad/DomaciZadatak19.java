package DomaciRad;

import java.util.ArrayList;
import java.util.Scanner;

public class DomaciZadatak19 {
    public static void main(String[] args) {
//        Zadatak 2.
//        Napraviti neku listu brojeva pomocu skenera, sve dok se ne unese 0.
//        Zatim cete uneti neki broj, pomocu metode napraviti novu listu koja ce u
//        sebi sadrzati sve brojeve vece od unetog broja. Novu listu pozvati pomocu metode za
//        stampanje elemenata liste.

        stampanjeListe(unosenjePodataka(unosListe()));

    }
    public static int unosListe(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite elemente liste, nulu za sledeci korak.");
        int broj = sc.nextInt();
        return broj;
    }
    public static ArrayList<Integer> unosenjePodataka(int x){

            ArrayList<Integer> lista = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
        if(x!=0) {
            while (x != 0) {
                lista.add(x);
                x = sc.nextInt();
            }
        }
        return lista;
    }
    public static void stampanjeListe(ArrayList<Integer> lista){
        if(lista.size() != 0) {
            System.out.println("Unesite broj za poredjenje");
            Scanner sc = new Scanner(System.in);
            int broj2 = sc.nextInt();
            System.out.println("Brojevi veci od unetog su: ");
            ArrayList<Integer> listaB = new ArrayList<>();

            for (int i = 0; i < lista.size(); i++) {
                if (broj2 < lista.get(i)) {
                    listaB.add(lista.get(i));
                }
            }
            if(listaB.size()!=0){
            for (int j = 0; j < listaB.size(); j++) {
                System.out.println(listaB.get(j));
            }
        } else {
                System.out.println("Nema brojeva vecih od unetog!");
            }
        }
        System.out.println("Kraj programa");
    }
}