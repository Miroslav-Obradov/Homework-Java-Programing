package DomaciRad.D_22_Miroslav_Obradov;
//Investitor ce imati dodatno polje za broj zgrada koje je do sada digao.
 //Istampati njihove podatke sa tim da racunamo 20% vecu platu sefu smene
//        i fizikalcu ako imaju vise od 5 godina iskustva i 30% vecu platu investitoru ako je digao bar 5 zgrada.
public class Investitor extends Radnik{
    int brojZgrada;

    public Investitor(int ID, String nazivRadnika, int godineIskustva, double plata, int brojZgrada) {
        super(ID, nazivRadnika, godineIskustva, plata);
        this.brojZgrada = brojZgrada;
    }
    public void stampa(){
        System.out.println("ID: " + ID + "." + " Ime i prezime: "+ nazivRadnika + " broj zgrada: " + brojZgrada);
        if(brojZgrada > 5) {
            System.out.println("Plata za vise od 5 zgrada je uvecana za 30%: " + (plata = plata*1.3));
            System.out.println("------------------------");
    }else{
        System.out.println("Plata za manje ili 5 zgrada je ista: " + plata);
            System.out.println("------------------------");
        }
    }
}
