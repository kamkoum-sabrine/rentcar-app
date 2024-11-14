/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package rentcar.rentcar.app;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import rentcar.management.CoutException;
import rentcar.management.DateLocationException;
import rentcar.personnes.Client;
import rentcar.vehicules.ContratLocation;
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
        
        vehicules.add(new VoitureCommerciale("123ABC", "Peugeot", "Boxer", "90HP", "Diesel", 2020, 40000.0, true, true, true, true, true, true, 1200, true, true, "Commercial", 150.0));
        vehicules.add(new VoitureFamiliale("456DEF", "Renault", "Scenic", "110HP", "Diesel", 2019, 30000.0, true, true, true, true, true, true, 7, true, true, "Familiale", 70.0));
        vehicules.add(new VoitureCommerciale("789GHI", "Ford", "Transit", "95HP", "Diesel", 2021, 20000.0, true, true, true, true, true, true, 800, false, false, "Commercial", 90.0));

     

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
         
        

      
    }
}
