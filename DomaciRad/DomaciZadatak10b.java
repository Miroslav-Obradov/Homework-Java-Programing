package DomaciRad;

import java.util.Scanner;

public class DomaciZadatak10b {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Do kog broja zelite da saberete sve prethodne brojeve?");
        int broj = sc.nextInt();
        int suma = 0;
        int i = 0;
        while (i <= broj) {
            suma = suma + i;
            i++;
        }
        System.out.println("Zbir brojeva je: " + suma);
        System.out.println("Kraj programa");
    }
}

