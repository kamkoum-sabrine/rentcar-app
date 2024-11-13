/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package rentcar.rentcar.app;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import rentcar.management.CoutException;
import rentcar.management.DateLocationException;
import rentcar.personnes.Client;
import rentcar.vehicules.ContratLocation;
import rentcar.vehicules.Vehicule;
import rentcar.vehicules.VoitureCommerciale;

/**
 *
 * @author LENOVO
 */
public class RentcarApp {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Client c1 = new Client();
        VoitureCommerciale v1 = new VoitureCommerciale("245 TN 1234", "KIA", "Sportege", "5CV", "Essence", 2024, 154.2, true, true, true, true, true, true, 0, true, true);
       
         try {
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
        }
    }
}
