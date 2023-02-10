package DomaciRad.D_23_Miroslav_Obradov;

import java.util.ArrayList;

public class Jelo {
    public String naziv;
    public ArrayList<String> listaSastojaka;
    public boolean bezLaktoze;

    public Jelo(String naziv) {
        this.naziv = naziv;
        bezLaktoze = true;
        this.listaSastojaka = new ArrayList<>();
    }

    public Jelo(String naziv, ArrayList<String> listaSastojaka) {
        this.naziv = naziv;
        bezLaktoze = true;
        for(int i=0; i<listaSastojaka.size(); i++){
            if (listaSastojaka.get(i).equals("Mleko")) {
                bezLaktoze = false;
                break;
            }
        }
        this.listaSastojaka = listaSastojaka;
    }

    public void dodajSastojak(String noviSastojak) {
        if (noviSastojak.equals("Mleko")) {
            bezLaktoze = false;
        }

        listaSastojaka.add(noviSastojak);
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public ArrayList<String> getListaSastojaka() {
        return listaSastojaka;
    }

    public boolean isBezLaktoze() {
        return bezLaktoze;
    }
    public void stampa(){


        System.out.println(this.getNaziv() + " sa sastoji od:");
        System.out.println(this.getListaSastojaka());
        if(isBezLaktoze()){
            System.out.println("Jelo je lactose-free");
        } else {
            System.out.println("Jelo nije lactose-free");
        }
        System.out.println("-----------------------------");
    }
}

