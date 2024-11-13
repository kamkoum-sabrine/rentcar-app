/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentcar.personnes;

import java.util.ArrayList;
import java.util.Date;
import rentcar.vehicules.ContratLocation;

/**
 *
 * @author LENOVO
 */
public class Client extends Personne{
     private ArrayList<ContratLocation> historiqueLocation; //type Location dans le tableau
     private String societe;
     private String carteCredit;
     private String numPermis;
     private Date datePermis;
     private String lieuPermis;

    public Client(String societe, String carteCredit, double cin, String nom, String prenom, 
            double tel, String email, String adresse, Date dateNaissance, String nationalite, Date dateCin, String lieuCin,
            String numPermis, String lieuPermis) {
            super(cin, nom, prenom, tel, email, adresse, dateNaissance, nationalite, dateCin, lieuCin);
            this.historiqueLocation= new ArrayList<>();
            this.societe = societe;
            this.carteCredit = carteCredit;
            this.numPermis = numPermis;
            this.datePermis = datePermis;
            this.lieuPermis = lieuPermis;
    }

    public void AfficherLesLocations(){
        for (int i = 0; i < historiqueLocation.size(); i++){
            System.out.println(historiqueLocation.get(i));
        }
    }

    public int CaluculeNbLocations(){
        return this.historiqueLocation.size();
    }
    
    public boolean VerifierHistorique(){
        return this.historiqueLocation.size()==1;
    }

    public ArrayList<ContratLocation> getHistoriqueLocation() {
        return historiqueLocation;
    }

    public String getSociete() {
        return societe;
    }

    public String getCarteCredit() {
        return carteCredit;
    }

    public String getNumPermis() {
        return numPermis;
    }

    public Date getDatePermis() {
        return datePermis;
    }

    public String getLieuPermis() {
        return lieuPermis;
    }

    public void setHistoriqueLocation(ArrayList<ContratLocation> historiqueLocation) {
        this.historiqueLocation = historiqueLocation;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }

    public void setCarteCredit(String carteCredit) {
        this.carteCredit = carteCredit;
    }

    public void setNumPermis(String numPermis) {
        this.numPermis = numPermis;
    }

    public void setDatePermis(Date datePermis) {
        this.datePermis = datePermis;
    }

    public void setLieuPermis(String lieuPermis) {
        this.lieuPermis = lieuPermis;
    }

    @Override
    public String toString() {
        return "Client{" + "historiqueLocation=" + historiqueLocation + ", societe=" + societe + ", carteCredit=" + carteCredit + ", numPermis=" + numPermis + ", datePermis=" + datePermis + ", lieuPermis=" + lieuPermis + '}';
    }
    
    public void ajouterLocation(ContratLocation location){
        this.historiqueLocation.add(location);
    }
    
    public void supprimerLocation(int index){
        this.historiqueLocation.remove(index);
    }
}
