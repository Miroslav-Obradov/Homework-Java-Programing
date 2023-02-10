package DomaciRad.D_20_Miroslav_Obradov;


public class Main {
    public static void main(String[] args) {
//        Zadatak 1.
//        Napraviti klasu Knjiga koja ce imati naziv i zanr. U glavnoj klasi napraviti dve knjige,
//        zatim proveriti da li imaju isti zanr i naziv, ako imaju,
//        ispisati poruku da je u pitanju ista knjiga, ako je samo zanr isti,
//        ispisati poruku koji je to zanr, ako nista od toga nije isto,
//        ispisati poruku da su u pitanju dve razlicite knjige.


        Knjiga knjiga1 = new Knjiga("Alhemist", "drama");
        //Knjiga knjiga2 = new Knjiga("Alhemist", "drama");
        //Knjiga knjiga2 = new Knjiga("Pera", "drama");
        Knjiga knjiga2 = new Knjiga("Gospodar prstenova", "epska fantastika");


        if(knjiga1.naziv.equals(knjiga2.naziv) && knjiga1.zanr.equals(knjiga2.zanr)){
            System.out.println("U pitanju je ista knjiga.");
        }else if(knjiga1.zanr.equals(knjiga2.zanr)){
            System.out.println("Zanr knjiga je: " + knjiga1.zanr);
        }else{
            System.out.println("Obe knjige su razlicite.");
        }
    }
}
