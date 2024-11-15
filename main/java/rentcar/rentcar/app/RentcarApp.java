/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package rentcar.rentcar.app;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import rentcar.management.Assurance;
import rentcar.personnes.Adresse;
import rentcar.personnes.Client;
import rentcar.vehicules.CoordonnéesGPS;
import rentcar.vehicules.FiltreVehicule;
import rentcar.vehicules.Vehicule;
import rentcar.vehicules.VoitureCommerciale;
import rentcar.vehicules.VoitureFamiliale;

/**
 *
 * @author LENOVO
 */
public class RentcarApp {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Client c1 = new Client();
         List<Vehicule> vehicules = new ArrayList<>();
          CoordonnéesGPS positionInitiale = new CoordonnéesGPS(36.8065, 10.1815); // Par exemple, Tunis

        vehicules.add(new VoitureCommerciale("123ABC", "Peugeot", "Boxer", "90HP", "Diesel", 2020, 40000.0, true, true, true, true, true, true, 1200, true, true, "Commercial", 150.0,positionInitiale));
        vehicules.add(new VoitureFamiliale("456DEF", "Renault", "Scenic", "110HP", "Diesel", 2019, 30000.0, true, true, true, true, true, true, 7, true, true, "Familiale", 70.0,positionInitiale));
        vehicules.add(new VoitureCommerciale("789GHI", "Ford", "Transit", "95HP", "Diesel", 2021, 20000.0, true, true, true, true, true, true, 800, false, false, "Commercial", 90.0,positionInitiale));

     

        // Appliquer un filtre par prix (<= 100)
        FiltreVehicule filtrePrix = vehicule -> vehicule.getCoutParJour() <= 100;
        List<Vehicule> vehiculesFiltresParPrix = Vehicule.filtrerVehicules(vehicules, filtrePrix);

        System.out.println("Véhicules filtrés par prix (<= 100) :");
        for (Vehicule vehicule : vehiculesFiltresParPrix) {
            System.out.println(vehicule);
        }
       
       
        /** try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            
            // Créer les objets Date
            Date dateDebut = dateFormat.parse("12/11/2013");
            Date dateFin = dateFormat.parse("12/11/2012");
            
            // Créer l'objet ContratLocation
            ContratLocation contrat = new ContratLocation(1, c1, c1, v1, dateDebut, dateFin, -100);

        } catch (ParseException e) {
            System.out.println("Erreur lors de l'analyse de la date : " + e.getMessage());

        } catch (DateLocationException e) {
            System.out.println("Erreur de logique de date dans le contrat de location : " + e.getMessage());

        } catch (CoutException e) {
            System.out.println("Erreur de coût dans le contrat de location : " + e.getMessage());
        }**/
         
       
        Adresse adresseGarage = new Adresse("123 Rue de l'Atelier", "Tunis", "1000", "Tunisie");
        Adresse adresseClient = new Adresse("45 Avenue de la Liberté", "Ariana", "2080", "Tunisie");

        CoordonnéesGPS vehicleLocation = new CoordonnéesGPS(48.8566, 2.3522); // Paris coordinates

        // Create GPS coordinates for another location
        CoordonnéesGPS anotherLocation = new CoordonnéesGPS(51.5074, -0.1278); // London coordinates

        // Calculate distance between the two locations
        double distance = vehicleLocation.distanceTo(anotherLocation);
        System.out.println("Distance between Paris and London: " + distance + " km");

        // Create a Vehicule object
        Vehicule vehicle = new Vehicule(
                "ABC123",                 // Matricule
                "Toyota",                 // Marque
                "Corolla",                // Modele
                "90HP",                   // Puissance
                "Petrol",                 // Carburant
                2020,                     // AnneeModele
                30000.0,                  // Kilometrage
                true,                     // RoueSecours
                true,                     // CricOutils
                true,                     // RadioAntenne
                true,                     // Enjolivers
                true,                     // Retroviseurs
                true,                     // ClimatiseurMarche
                "Sedan",                  // Type
                45.0,                     // CoutParJour
                vehicleLocation           // CoordonnéesGPS
        );


        System.out.println(vehicle);

        Date dateDebut = new Date(2024-1900, 10, 15);
        Date dateFin = new Date(2026-1900, 9, 10);

        Assurance A1 = new Assurance(
                1,                          // idAssurance
                "AXA",                      // nomAssureur
                "123456789",                // numeroPolice
                "Full Coverage",            // typeAssurance
                dateDebut,                  // dateDebut
                dateFin,                    // dateFin
                500.0,                      // coutAssurance
                vehicle,                    // vehiculeAssure
                1000.0,                     // franchise
                "All risks",                // couverture
                "Active"                    // status
        );

        // Print the insurance details
        System.out.println(A1);
        System.out.println(A1.dureeAssuranceJours());
    }
}
