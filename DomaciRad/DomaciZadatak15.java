package DomaciRad;

import java.util.Scanner;

public class DomaciZadatak15 {
    public static void main(String[] args) {
//        3. Napraviti proizvoljan niz brojeva, zatim uneti preko Scanner-a neki broj,
//        i u novom nizu smestiti sve brojeve koji su veci od tog unetog broja
//        (Obratiti paznju da nov niz nema prazna polja tj 0).

        int niz[] = {8, 2, 1, 4, 9, 6};

        Scanner sc = new Scanner(System.in);

        System.out.println("unesite broj");
        int broj = sc.nextInt();

        for(int i=0; i<niz.length; i++) {
            if(niz[i]>broj){
               int max=niz[i];
        int noviniz[] = {max};
            for(int j=0; j< noviniz.length; j++)
            System.out.println(noviniz[j]);
    }

}
    }
    }