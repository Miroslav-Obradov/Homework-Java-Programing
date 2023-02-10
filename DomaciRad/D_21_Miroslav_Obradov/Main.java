package DomaciRad.D_21_Miroslav_Obradov;

public class Main {
    public static void main(String[] args) {
        //        Zadatak 2.
//        Napraviti klasu Radnik koja ima ime, poziciju i platu.
//        U glavnoj klasi napraviti dva radnika, proveriti cija je plata veca,
//        i stampati informacije radnika cija je plata veca, uz 20% vecu platu.

        Radnik radnik1 = new Radnik("Pera Peric", "Junior QA", 100000);
        Radnik radnik2 = new Radnik("Nedeljko Subotic", "Senior QA", 200000);
        //Radnik radnik2 = new Radnik("Nedeljko Subotic", "Fizikalac", 60000);

        if(radnik1.plata>radnik2.plata){
            double uvecanaPlata1 = 1.2 * radnik1.plata;
            System.out.println("Radnik " + radnik1.Ime + " ima vecu platu i 20% uvecanu " + uvecanaPlata1);
        }else{
            double uvecanaPlata2 = 1.2 * radnik2.plata;
            System.out.println("Radnik " + radnik2.Ime + " ima vecu platu i 20% uvecanu " + uvecanaPlata2);
        }

    }
}
