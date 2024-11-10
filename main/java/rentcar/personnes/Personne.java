/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentcar.personnes;

import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class Personne {
    protected double cin ;
    protected String nom;
    protected String prenom;
    protected double tel;
    protected String email;
    protected String adresse;
    protected Date dateNaissance;
    protected String nationalite;
    protected Date dateCin;
    protected String lieuCin;

    public Personne(double cin, String nom, String prenom, double tel, String email, String adresse, Date dateNaissance, String nationalite, Date dateCin, String lieuCin) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.email = email;
        this.adresse = adresse;
        this.dateNaissance = dateNaissance;
        this.nationalite = nationalite;
        this.dateCin = dateCin;
        this.lieuCin = lieuCin;
    }

    public double getCin() {
        return cin;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public double getTel() {
        return tel;
    }

    public String getEmail() {
        return email;
    }

    public String getAdresse() {
        return adresse;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public String getNationalite() {
        return nationalite;
    }

    public Date getDateCin() {
        return dateCin;
    }

    public String getLieuCin() {
        return lieuCin;
    }

    public void setCin(double cin) {
        this.cin = cin;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setTel(double tel) {
        this.tel = tel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public void setDateCin(Date dateCin) {
        this.dateCin = dateCin;
    }

    public void setLieuCin(String lieuCin) {
        this.lieuCin = lieuCin;
    }

    @Override
    public String toString() {
        return "Personne{" + "cin=" + cin + ", nom=" + nom + ", prenom=" + prenom + ", tel=" + tel + ", email=" + email + ", adresse=" + adresse + ", dateNaissance=" + dateNaissance + ", nationalite=" + nationalite + ", dateCin=" + dateCin + ", lieuCin=" + lieuCin + '}';
    }
}