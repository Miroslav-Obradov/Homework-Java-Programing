package DomaciRad;

import java.util.Scanner;

public class DomaciZadatak11 {
//    2. Napraviti program gde cete uneti broj nekih knjiga na lageru, zatim svaki put kada unesete
//    '.' on ce skinuti po jednu knjigu sa lagera,
//    tek nakon sto unesete neki drugi string ili ponestaje knjiga na lageru,
//    izaci ce iz petlje i ispisati poruku, ukoliko je ponestajalo knjiga
//    ispisati poruku da nema vise knjiga na lageru, ukoliko je unet neki drugi String,
//    onda samo ispisati stanje knjiga na lageru.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj knjiga na lageru");
        int broj = sc.nextInt();
        if(broj>0) {
            System.out.println("Unesite tacku za skidanje sa stanja ili neki karakter za stanje");
            String  tacka = sc.next();

            while (tacka.equals(".")) {

                broj = broj - 1;
                if (broj == 0) {
                    break;
                }
                tacka = sc.next();
            }
            if(broj>0){
                System.out.println("Stanje knjiga je: " + broj);
            }else{System.out.println("Nema vise knjiga na lageru");
        }

        }else{System.out.println("Uneli ste pogresan broj");

    }
}
}