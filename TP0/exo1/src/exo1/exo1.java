/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo1;
import java.util.Scanner;
/**
 *
 * @author sylvain922
 */
public class exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez votre prénom : ");
        String prenom = sc.nextLine();
 
        System.out.print("Entrez votre nom : ");
        String nom = sc.nextLine();

        if (prenom.equals("Harry") && nom.equals("Potter")) {
            System.out.println("Bienvenue Harry Potter.");
        } else {
            System.out.println("Bonjour");
        }
 
        // Âges
        System.out.print("Entrez votre âge : ");
        int age = sc.nextInt();
 
        System.out.print("Entrez l'âge de votre père : ");
        int agePere = sc.nextInt();
 
        System.out.print("Entrez l'âge de votre mère : ");
        int ageMere = sc.nextInt();
 

        System.out.println("Addition : " + (agePere + ageMere));
        System.out.println("Soustraction : " + (agePere - ageMere));
        System.out.println("Multiplication : " + (agePere * ageMere));
        if (ageMere != 0) {
            System.out.println("Division : " + ((double) agePere / ageMere));
        } else {
            System.out.println("Division impossible (âge de la mère = 0)");
        }
 
        if (agePere > ageMere) {
            System.out.println("supérieur");
        } else {
            System.out.println("inférieur");
        }
 
        sc.close();
    }
 
    
}
