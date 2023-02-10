package DomaciRad;

import java.util.Scanner;

public class DomaciZadatak12 {
    public static void main(String[] args) {
//        3. Napraviti program za korpu voca, izracunati sumu cena, ako znamo da jabuke kostaju 50 din, kruske 100 din i banane 140 din, tako da se suma
//        racuna sve dok unosimo "jabuka" "banana" ili "kruska"(u zavisnosti koji string unesemo), toliko dodajemo na sumu, kada se unese ".",
//                program izlazi iz petlje i pise ukupnu cenu navedenog voca.

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite naziv voca a " + "'.'" + " za ukupan iznos");
        String voce = sc.next();
        int jabuka = 50;
        int banana = 140;
        int kruska = 100;
        int x = 0;
        int y = 0;
        int z = 0;
        int d = 0;
            if (voce.equals("jabuka") || voce.equals("kruska") || voce.equals("banana") || voce.equals(".")){
            do {
            if (voce.equals("jabuka")){
                x = jabuka + x;
                voce = sc.next();
            }else if (voce.equals("kruska")){
                y = kruska + y;
                voce = sc.next();
            }else if (voce.equals("banana")) {
                z = banana + z;
                voce = sc.next();
            }else if(voce.equals(".")){
                d = x + y + z;
                System.out.println("Ukupna cena voca iznosi: " + d);
                break;
            }
            }while (voce.equals("jabuka") || voce.equals("kruska") || voce.equals("banana") || voce.equals("."));

            }else{System.out.println("Uneli ste voce koje nije na listi");
        }
        System.out.println("Kraj programa");
    }
}
