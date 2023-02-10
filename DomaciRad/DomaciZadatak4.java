package DomaciRad;

import java.util.Scanner;

public class DomaciZadatak4 {
    public static void main(String[] args) {

// Napraviti program gde cete uneti svoju radnu poziciju, mozete uneti "fizikalac", "injzenjer" i "masinovodja" i uneti svoju platu.
// Ispisati u konzoli poziciju koju radis i platu.
// Ako ste na poziciji fizikalca, povecati platu za 15%.
// Ako ste na poziciji inzenjera, povecati platu za 20%.
// Ako ste na poziciji masinovodje, povecati platu za 30%.
// Ako je uneta pogresna informacija, potrebno je prijaviti to putem poruke.

                Scanner sc = new Scanner(System.in);
                System.out.println("Unesite radnu poziciju");
                String radPoz = sc.next();

                System.out.println("Unesite svoju platu");
                int plata = sc.nextInt();

                    if (radPoz.equalsIgnoreCase("fizikalac") && plata>0) {
                        plata = plata + plata*15/100;
                        System.out.println("Vi radite na poziciji " + radPoz.toUpperCase() + " a Vasa plata je: " + plata);
                    } else if (radPoz.equalsIgnoreCase("inzenjer") && plata>0) {
                        plata = plata + plata*20/100;
                        System.out.println("Vi radite na poziciji " + radPoz.toUpperCase() + " a Vasa plata je: " + plata);
                    } else if (radPoz.equalsIgnoreCase("masinovodja") && plata>0) {
                        plata = plata + plata*30/100;
                        System.out.println("Vi radite na poziciji " + radPoz.toUpperCase() + " a Vasa plata je: " + plata);
                    } else {
                        System.out.println("Neispravan unos podataka");
                    }
        System.out.println("Kraj programa");
    }
}

        /*else {
            Deo koda koji nema svrhu u programu zovemo mrtav kod
        }*/



        /*if (pol.toUpperCase().equals("ZENSKI")) {
            //toUpperCase ce uzeti nas unos, promeniti ga u velika slova i tek onda uporediti
        }

        if (pol.toLowerCase().equals("muski")) {
            //toLowerCase ce uzeti nas unos, promeniti ga u mala slova i tek onda uporediti

        }*/

