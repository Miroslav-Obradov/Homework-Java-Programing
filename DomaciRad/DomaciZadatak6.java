package DomaciRad;

import java.util.Scanner;

public class DomaciZadatak6 {
    public static void main(String[] args) {
//        2. Napisati program gde unosimo zanr neke knjige (Romantika, Triler, Horor, Krimi) nakon toga, uneti neku godinu
//        izdanja knjige, ukoliko su Triler i Romantika starija od 30 godina, onda treba ispisati poruku da zanr knjige
//        vise nije na lageru, takodje ako je Horor stariji od 40 godina i ako je Krimi starije od 20 godina,


        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite zanr knjige");
        String knjiga = sc.next().toLowerCase();

        System.out.println("Unesite godinu izdanja");
        int godina = sc.nextInt();
        int starost = 2022 - godina;

        if (starost >= 0) {

            switch (knjiga) {
                case "triler", "romantika":
                    if (starost > 30) {
                        System.out.println("Zanr knjige nije vise na lageru");
                    } else {
                        System.out.println("Zanr knjige je na lageru");
                    }
                    break;
                case "horor":
                    if (starost > 40) {
                        System.out.println("Zanr knjige nije vise na lageru");
                    } else  {
                        System.out.println("Zanr knjige je na lageru");
                    }
                    break;
                case "krimi":
                    if (starost > 20) {
                        System.out.println("Zanr knjige nije vise na lageru");
                    } else {
                        System.out.println("Zanr knjige je na lageru");
                    }
                    break;
                default:
                    System.out.println("Ne postoji zanr sa nazivom " + "'" + knjiga + "'");
                    break;
            }
        } else {
                System.out.println("Pogresan unos godine");
        }
    }
}





