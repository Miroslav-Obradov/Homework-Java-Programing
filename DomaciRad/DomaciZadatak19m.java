package DomaciRad;

import java.util.ArrayList;
import java.util.Scanner;

public class DomaciZadatak19m {
    public static void main(String[] args) {
        //Zadatak 2.
//        Napraviti neku listu brojeva pomocu skenera, sve dok se ne unese 0.
//        Zatim cete uneti neki broj, pomocu metode napraviti novu listu koja ce u
//        sebi sadrzati sve brojeve vece od unetog broja. Novu listu pozvati pomocu metode za
//        stampanje elemenata liste.

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite elemente liste, nulu za nastavak");
        int broj = sc.nextInt();
        ArrayList<Integer> lista = new ArrayList<>();

        if(broj != 0) {
            while (broj != 0) {
                lista.add(broj);
                broj = sc.nextInt();
            }
            System.out.println("Unesite broj za poredjenje");
            int broj2 = sc.nextInt();
            stampanjeListe(lista, broj2);
        }

    }
    public static void stampanjeListe(ArrayList<Integer> lista, int broj2){
        ArrayList<Integer> listaB = new ArrayList<>();
        for(int i=0; i<lista.size(); i++){
            if(broj2<lista.get(i)){
                listaB.add(lista.get(i));
            }
        }
        System.out.println("Brojevi veci od unetog : ");
        for(int j=0; j<listaB.size(); j++){
            System.out.println(listaB.get(j));
        }
    }
}