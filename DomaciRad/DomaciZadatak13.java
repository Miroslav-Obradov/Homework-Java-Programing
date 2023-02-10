package DomaciRad;

public class DomaciZadatak13 {
    public static void main(String[] args) {
//        Domaci:
//        1. Unesite velicinu niza, zatim uneti brojeve koji ce se nalaziti u nizu,
//        na kraju treba ispisati najveci broj od onih koje smo uneli.


        int niz[] = {100, -1, 20, 15, 4, -2};

        int max = niz[0];
        for(int i=0; i<niz.length; i++) {
            if(niz[i]>max){
                    max=niz[i];
        }
    }
        System.out.println("Najveci broj je: " + max);
    }
}