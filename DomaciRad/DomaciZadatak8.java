package DomaciRad;

import java.util.Scanner;

public class DomaciZadatak8 {
    public static void main(String[] args) {
        // 2. Napraviti program gde unosite svoju godinu rodjenja i ispisati broj prestupnih godina od vaseg rodjenja do tekuce godine.


        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite godinu rodjenja");
        int godinaRodjenja = sc.nextInt();
        int brojGodina = 2022 - godinaRodjenja;
        int godina = 0;
        int brojac = 0;
        if (brojGodina > 0) {
        for (int i=0; i<brojGodina; i++){

        godina = godinaRodjenja + i;

            if ((godina%4==0 &&  godina%100!=0) || (godina%400==0) ){
           brojac = brojac + 1;
            }
        }
        System.out.println("Broj prestupnih godina je: " + brojac);
        } else {
            System.out.println("Niste jos rodjeni");
    }
}
}