
package rentcar.personnes;

import rentcar.exceptionsPersonne.TelException;
import rentcar.maintenance.Garage;
import rentcar.exceptionsPersonne.SpecialiteException;


public class Technicien {
    private int idTechnicien;
    private String nom;
    private String specialite;
    private int experience;
    private int numeroTelephone;
    private Garage garage;

    public Technicien() {}

    public Technicien(int idTechnicien, String nom, String specialite, int experience, int numeroTelephone, Garage garage) throws SpecialiteException ,TelException{
        this.idTechnicien = idTechnicien;
        this.nom = nom;
        this.specialite = specialite; if(specialite.trim().isEmpty()) throw new SpecialiteException();
        this.experience = experience;
        this.numeroTelephone = numeroTelephone;if(Double.toString(numeroTelephone).length()!=8) throw new TelException();
        this.garage = garage;
    }

    public int getIdTechnicien() {
        return idTechnicien;
    }

    public String getNom() {
        return nom;
    }

    public String getSpecialite() {
        return specialite;
    }

    public int getExperience() {
        return experience;
    }

    public int getNumeroTelephone() {
        return numeroTelephone;
    }

    public Garage getGarage() {
        return garage;
    }

    public void setIdTechnicien(int idTechnicien) {
        this.idTechnicien = idTechnicien;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setSpecialite(String specialite) throws SpecialiteException{
        this.specialite = specialite;
        if(specialite.trim().isEmpty()) throw new SpecialiteException();
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setNumeroTelephone(int numeroTelephone) throws TelException {
        this.numeroTelephone = numeroTelephone;
        if (Double.toString(numeroTelephone).length()!=8) throw new TelException();
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    @Override
    public String toString() {
        return "Technicien{" + "idTechnicien=" + idTechnicien + ", nom=" + nom + ", specialite=" + specialite + ", experience=" + experience + ", numeroTelephone=" + numeroTelephone + ", garage=" + garage + '}';
    }
    
    
    
    
}
