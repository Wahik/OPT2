public class Factuur {
    private int factuurnummer;
    private Klant klant;
    private String reparatiegegevens;
    private double prijsExclusiefBtw;
    private double prijsInclusiefBtw;

    public Factuur(int factuurnummer, Klant klant, String reparatiegegevens, double prijsExclusiefBtw, double prijsInclusiefBtw) {
        this.factuurnummer = factuurnummer;
        this.klant = klant;
        this.reparatiegegevens = reparatiegegevens;
        this.prijsExclusiefBtw = prijsExclusiefBtw;
        this.prijsInclusiefBtw = prijsInclusiefBtw;
    }

    // Getter- en setter-methoden
    public int getFactuurnummer() {
        return factuurnummer;
    }

    public void setFactuurnummer(int factuurnummer) {
        this.factuurnummer = factuurnummer;
    }

    public Klant getKlant() {
        return klant;
    }

    public void setKlant(Klant klant) {
        this.klant = klant;
    }

    public String getReparatiegegevens() {
        return reparatiegegevens;
    }

    public void setReparatiegegevens(String reparatiegegevens) {
        this.reparatiegegevens = reparatiegegevens;
    }

    public double getPrijsExclusiefBtw() {
        return prijsExclusiefBtw;
    }

    public void setPrijsExclusiefBtw(double prijsExclusiefBtw) {
        this.prijsExclusiefBtw = prijsExclusiefBtw;
    }

    public double getPrijsInclusiefBtw() {
        return prijsInclusiefBtw;
    }

    public void setPrijsInclusiefBtw(double prijsInclusiefBtw) {
        this.prijsInclusiefBtw = prijsInclusiefBtw;
    }

    public void printFactuur() {
        // Implementeer de logica om de factuur af te drukken
        System.out.println("De factuur is afgedrukt voor klant: " + klant.getNaam());
    }

    @Override
    public String toString() {
        return "Factuur{" +
                "factuurnummer=" + factuurnummer +
                ", klant=" + klant +
                ", reparatiegegevens='" + reparatiegegevens + '\'' +
                ", prijsExclusiefBtw=" + prijsExclusiefBtw +
                ", prijsInclusiefBtw=" + prijsInclusiefBtw +
                '}';
    }
}