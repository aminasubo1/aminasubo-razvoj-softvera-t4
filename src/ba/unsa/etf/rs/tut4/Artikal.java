package ba.unsa.etf.rs.tut4;
import java.util.ArrayList;

public class Artikal {

    private String sifra, naziv;
    private double cijena;

    public Artikal(String sifra, String naziv, double cijena){
        setSifra(sifra);
        setNaziv(naziv);
        setCijena(cijena);

    }
    public Artikal(String s) {
        String[] rez = s.split(",");
        setSifra(rez[0]);
        setNaziv(rez[1]);
        setCijena(Double.parseDouble(rez[2]));
    }

    public String getSifra() {
        return sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public double getCijena() {
        return cijena;
    }

    public void setSifra(String sifra) {
        if(sifra.isEmpty()){
            throw new IllegalArgumentException("Šifra je prazna");
        }
        this.sifra = sifra;
    }

    public void setNaziv(String naziv) {
        if(naziv.isEmpty()){
            throw new IllegalArgumentException("Naziv je prazna");
        }
        this.naziv = naziv;
    }

    public void setCijena(double cijena) {
        if(cijena<0){
            throw new IllegalArgumentException("Cijena je negativna");
        }
        this.cijena = cijena;
    }



    public String toString(){
        String s = "";
        s = s + this.getSifra() + "," + this.getNaziv() + "," + this.getCijena();
        return s;
    }

    public boolean equals(Object o) {
        Artikal artikal = (Artikal)o;
        return (this.sifra.equals(((Artikal) o).sifra) &&
                this.naziv.equals(((Artikal) o).naziv) &&
                this.cijena == ((Artikal) o).cijena);
    }



    public static void izbaciDuplikate (ArrayList<Artikal> artikli){
        for (int i = 0; i < artikli.size(); i++) {
            for (int j = i + 1; j < artikli.size(); j++) {
                if(artikli.get(i).equals(artikli.get(j)))
                    artikli.remove(j);
            }
        }
    }
}