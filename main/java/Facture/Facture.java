/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facture;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import rentcar.vehicules.ContratLocation;
import rentcar.personnes.Client;


/**
 *
 * @author LENOVO
 */
public class Facture {
    private int idFacture;
    private LocalDate dateEmission;
    private double montantTotal;
    private ContratLocation location; // Association avec une location
    private EtatPaiement etatPaiement;
    private ModePaiement modePaiement;

    // Enum pour l'état de paiement
    public enum EtatPaiement {
        NON_PAYE, EN_COURS, PAYE
    }

    // Enum pour le mode de paiement
    public enum ModePaiement {
        ESPECES, CARTE_BANCAIRE, VIREMENT_BANCAIRE
    }

    // Constructeur
    public Facture(int idFacture, ContratLocation location) {
        this.idFacture = idFacture;
        this.dateEmission = LocalDate.now(); // Par défaut, la date actuelle
        this.location = location;
        this.montantTotal = calculerMontantTotal();
        this.etatPaiement = EtatPaiement.NON_PAYE;
        this.modePaiement = null; // Non défini au départ
    }

    // Méthode pour calculer le montant total
    private double calculerMontantTotal() {
    // Calcul du montant de base
    long dureeLocation = ChronoUnit.DAYS.between(
    location.getDateDebut().toInstant().atZone(ZoneId.from(dateEmission).systemDefault()).toLocalDate(),
    location.getDatFin().toInstant().atZone(ZoneId.systemDefault()).toLocalDate()
    );
      double montantBase = dureeLocation * location.getVehicule().getCoutParJour();
    // Assurez-vous qu'une durée minimum de 1 jour est prise en compte
    if (dureeLocation < 1) {
        dureeLocation = 1;
    }
    double reductions = 0;
    
     // Vérifier si au moins un client dans les conducteurs est fidèle
    boolean clientFidele = location.getConducteurs().stream().anyMatch(Client::estFidele);

    if (clientFidele) {
        reductions = montantBase * 0.1; // Réduction de 10% pour fidélité
    }

    return montantBase - reductions;
    }


    // Getter et Setter
    public int getIdFacture() {
        return idFacture;
    }

    public LocalDate getDateEmission() {
        return dateEmission;
    }

    public double getMontantTotal() {
        return montantTotal;
    }

    public ContratLocation getLocation() {
        return location;
    }

    public EtatPaiement getEtatPaiement() {
        return etatPaiement;
    }

    public void setEtatPaiement(EtatPaiement etatPaiement) {
        this.etatPaiement = etatPaiement;
    }

    public ModePaiement getModePaiement() {
        return modePaiement;
    }

    public void setModePaiement(ModePaiement modePaiement) {
        this.modePaiement = modePaiement;
    }

    // Méthode pour afficher les détails de la facture
    public void afficherDetails() {
        System.out.println("Facture #" + idFacture);
        System.out.println("Date d'émission : " + dateEmission);
        System.out.println("Location : " + location); // Suppose que Location a une méthode toString()
        System.out.println("Montant total : " + montantTotal + " €");
        System.out.println("État de paiement : " + etatPaiement);
        System.out.println("Mode de paiement : " + (modePaiement != null ? modePaiement : "Non défini"));
    }
}