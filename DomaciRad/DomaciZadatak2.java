package DomaciRad;

import java.util.Scanner;

public class DomaciZadatak2 {
    public static void main(String[] args) {

        //2.Napraviti program gde cete uneti svoju godinu rodjenja, trenutnu godinu i u konzoli istampati svoj broj godina.

        int godinaRodjenja, trenutnaGodina, brojGodina;

        Scanner nazivSkenera = new Scanner(System.in);
        System.out.println("Unesite godinu rodjenja:");
        godinaRodjenja = nazivSkenera.nextInt();
        System.out.println("Unesite trenutnu godinu:");
        trenutnaGodina = nazivSkenera.nextInt();

        brojGodina = trenutnaGodina - godinaRodjenja;


        System.out.println("Vi imate " + brojGodina + " godina");
    }
}
