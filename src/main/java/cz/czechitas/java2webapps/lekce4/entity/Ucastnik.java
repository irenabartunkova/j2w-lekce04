package cz.czechitas.java2webapps.lekce4.entity;

public class Ucastnik {
    private String jmeno;
    private String prijmeni;
    private String bydliste;

    public String getObrazek() {
        return obrazek;
    }

    public void setObrazek(String obrazek) {
        this.obrazek = obrazek;
    }

    private String obrazek;

    public Ucastnik(String jmeno, String prijmeni, String bydliste, String obrazek) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.bydliste = bydliste;
        this.obrazek = obrazek;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public String getBydliste() {
        return bydliste;
    }

    public void setBydliste(String bydliste) {
        this.bydliste = bydliste;
    }


}

