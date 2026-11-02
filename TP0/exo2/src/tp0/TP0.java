/*
 * TP0 - Partie 2 : Addition d'entiers
 * Auteur : Sylvain COUTURIER
 * Groupe : BDML 2
 * Role   : calcule la somme des nb premiers entiers (nb saisi par l'utilisateur)
 * Date   : 02/11/2026
 */
package tp0;

import java.util.Scanner;

public class TP0 {
    public static void main(String[] args) {
        int nb;      // nombre d'entiers a additionner
        int result;  // resultat
        int ind;     // indice
 
        //nb=5;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        nb = sc.nextInt();
 
        result = 0;
 
        ind = 1;
        while (ind <= nb) {
            result = result + ind;
            ind += 1;
        }
 
        System.out.println();
        System.out.println("La somme des " + nb + " entiers est : " + result);
    }
}
