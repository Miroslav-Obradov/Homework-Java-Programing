package DomaciRad;

import java.util.Scanner;

public class DomaciZadatak9d {
    public static void main(String[] args) {


                Scanner scn = new Scanner(System.in);
                System.out.println("Unesite 5 brojeva");
                int max, min;
                min = scn.nextInt();
                max = min;
                int currNum;
                for (int i = 0; i < 4; i++) {
                    currNum = scn.nextInt();
                    if (currNum > max) {
                        max =currNum;
                    } else if (currNum < min) {
                        min = currNum;
                    }
                }
                System.out.println("Max je " + max);
                System.out.println("Min je " + min);
            }
        }

