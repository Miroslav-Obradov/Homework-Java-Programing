package DomaciRad;

import java.util.ArrayList;

public class DomaciZadatak16 {
    public static void main(String[] args) {
//        1. Napraviti proizvoljan niz brojeva, podeliti ih u dve liste,
//        jedna lista ce u sebi sadrzati sve parne brojeve dok ce druga lista zadrzati sve neparne brojeve.



        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(2);
        lista.add(5);
        lista.add(11);
        lista.add(9);
        lista.add(18);
        lista.add(21);
        lista.add(26);

        ArrayList<Integer> parnaLista= new ArrayList<>();
        ArrayList<Integer> neparnaLista= new ArrayList<>();
        int par;
        int nepar;
        for (int i = 0; i < lista.size(); i++){
            if (lista.get(i)%2==0) {
                par = lista.get(i);
                parnaLista.add(par);
            }else{
                nepar = lista.get(i);
                neparnaLista.add(nepar);
                }
            }
        System.out.println("Parna lista je: " + parnaLista);
        System.out.println("Neparna lista je: " + neparnaLista);
    }
}

