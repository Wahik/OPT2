public class Klant {
    private String naam;
    private String adres;
    private String postcode;

    public Klant(String naam, String adres, String postcode) {
        this.naam = naam;
        this.adres = adres;
        this.postcode = postcode;
    }

    // Getter- en setter-methoden
    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "Klant{" +
                "naam='" + naam + '\'' +
                ", adres='" + adres + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }
}