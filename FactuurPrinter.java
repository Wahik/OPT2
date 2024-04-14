public class FactuurPrinter {
    public void printFactuur(Factuur factuur) {
        // Implementeer de logica om de factuur af te drukken
        System.out.println();
        System.out.println("Factuur afgedrukt voor klant: " + factuur.getKlant().getNaam());
    }
}