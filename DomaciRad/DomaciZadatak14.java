package DomaciRad;

public class DomaciZadatak14 {
    public static void main(String[] args) {
        //        2. Napraviti niz brojeva, gde cete svaki neparan broj povecati za 2.

        int niz[] = {5, 3, 9, -13, -4, -1};

        int nepar;

        for(int i=0; i<niz.length; i++) {

            if (((niz[i])%2==1) || (niz[i])%2==-1){
                nepar=niz[i] + 2;
                System.out.println("Neparni broj + 2 je: " + nepar);
            }

        }

    }
}

