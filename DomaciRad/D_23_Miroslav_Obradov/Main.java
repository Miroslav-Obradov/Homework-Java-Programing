package DomaciRad.D_23_Miroslav_Obradov;
//Zadatak 2.
//        Napraviti klasu Jelo, koje ce imati atribute za naziv, listu sastojaka i
//        boolean vrednost bezLaktoze. Klase Corba, Torta i Sarma nasledjuju klasu Jelo.
//        Ukoliko je jedan od sastojaka mleko, podesicemo boolean vrednost za laktozu na false,
//        u suprotnom na true. U main klasi kreirati i istampati bar tri jela
//        (njihov naziv, sastojke i da li lactose-free).
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> listaSastojaka = new ArrayList<>();

        Sarma s1 = new Sarma("Sarma");
        s1.dodajSastojak("Meso");
        s1.dodajSastojak("Kupus");
        s1.dodajSastojak("Aleva paprika");
        s1.dodajSastojak("Slanina");
        s1.dodajSastojak("Voda");
        s1.stampa();

        Corba c1 = new Corba("Corba");
        c1.dodajSastojak("Fide");
        c1.dodajSastojak("Voda");
        c1.dodajSastojak("Paradajz");
        c1.dodajSastojak("Zacin");
        c1.stampa();


        Torta t1 = new Torta("Torta");
        t1.dodajSastojak("Mleko");
        t1.dodajSastojak("Brasno");
        t1.dodajSastojak("Prasak za pecivo");
        t1.dodajSastojak("Slag");
        t1.dodajSastojak("Krema");
        t1.stampa();
        }
    }

