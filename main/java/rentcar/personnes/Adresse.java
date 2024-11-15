/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rentcar.personnes;

/**
 *
 * @author LENOVO
 */
public record Adresse(String rue, String ville, String codePostal, String pays) {

    // Constructeur additionnel pour fournir une adresse sans code postal
    public Adresse(String rue, String ville, String pays) {
        this(rue, ville, "Non spécifié", pays);
    }

    // Exemple de méthode pour un affichage formaté de l'adresse
    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s", rue, ville, codePostal, pays);
    }
}