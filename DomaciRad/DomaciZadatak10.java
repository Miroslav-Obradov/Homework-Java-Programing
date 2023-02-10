package DomaciRad;

import java.util.Scanner;

public class DomaciZadatak10 {
    public static void main(String[] args) {
//        1. Napraviti program gde cete uneti
//        neki broj i kao rezultat vratiti zbir svih njegovih prethodnih brojeva.
//    (napraviti sa for i while primere)

        Scanner sc = new Scanner(System.in);
        System.out.println("Do kog broja zelite da saberete sve prethodne brojeve?");
        int broj = sc.nextInt();
        int suma = 0;

        for (int i = 0; i <= broj; i++) {
            suma = suma + i;

        }
        System.out.println("Zbir brojeva je: " + suma);
        System.out.println("Kraj programa");
    }
}
