import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean doorgaan = true;

        while (doorgaan) {
            // Vraag om klantgegevens
            System.out.println("Voer de klant gegevens in:");
            System.out.print("Klantnaam: ");
            String klantNaam = scanner.nextLine();

            System.out.print("Klantadres: ");
            String klantAdres = scanner.nextLine();

            System.out.print("Klantpostcode: ");
            String klantPostcode = scanner.nextLine();

            // Maak een Klant object aan
            Klant klant = new Klant(klantNaam, klantAdres, klantPostcode);

            // Vraag om reparatiegegevens
            System.out.println("\nVoer de reparatie gegevens in: ");
            System.out.print("Factuurnummer: ");
            int factuurNummer = scanner.nextInt();

            scanner.nextLine(); // om de buffer te wissen
            System.out.print("Omschrijving: ");
            String omschrijving = scanner.nextLine();

            System.out.print("Prijs exclusief BTW: €");
            double prijsExclusiefBtw = scanner.nextDouble();

            System.out.print("Prijs inclusief BTW: €");
            double prijsInclusiefBtw = scanner.nextDouble();

            // Maak een Factuur object aan
            Factuur factuur = new Factuur(factuurNummer, klant, omschrijving, prijsExclusiefBtw, prijsInclusiefBtw);

            // Afdrukken van factuur
            FactuurPrinter factuurPrinter = new FactuurPrinter();
            factuurPrinter.printFactuur(factuur);

            // Geef opties weer
            System.out.println("\nKies een optie:");
            System.out.println("1. Factuur opslaan");
            System.out.println("2. Factuur bewerken");
            System.out.println("3. Factuur verwijderen");
            System.out.println("4. Stoppen");

            // Lees de keuze van de gebruiker
            int keuze = scanner.nextInt();
            scanner.nextLine(); // om de buffer te wissen

            switch (keuze) {
                case 1:
                    FactuurOpslag factuurOpslag = new FactuurOpslag();
                    factuurOpslag.saveFactuur(factuur);
                    System.out.println("Je factuur is opgeslagen.");
                    doorgaan = false;
                    break;
                case 2:
                    FactuurEditor factuurEditor = new FactuurEditor();
                    factuurEditor.editFactuur(factuur);
                    System.out.print("Ben je klaar met het bewerken van de factuur? (ja/nee): ");
                    String antwoord = scanner.nextLine();
                    if (antwoord.equalsIgnoreCase("ja")) {
                        System.out.println("De factuur is bijgewerkt.");
                        doorgaan = false;
                    }
                    break;
                case 3:
                    FactuurVerwijderaar factuurVerwijderaar = new FactuurVerwijderaar();
                    factuurVerwijderaar.deleteFactuur(factuur.getFactuurnummer());
                    System.out.println("Je factuur is verwijderd.");
                    System.out.println("Begin hieronder met het maken van een nieuwe!");
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Bedankt voor het gebruik van het systeem. Tot ziens!");
                    doorgaan = false;
                    break;
                default:
                    System.out.println("Ongeldige optie.");
            }
        }

        // Sluit de scanner
        scanner.close();
    }
}
