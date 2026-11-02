/*
 * TP0 - Partie 3 : Calculette
 * Auteur : Sylvain COUTURIER
 * Groupe : BDML 2
 * Role   : calculatrice simple (addition, soustraction, multiplication,
 *          division, modulo) sur deux entiers saisis au clavier
 * Date   : 02/11/2026
 */
package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operateur;
        int operande1;
        int operande2;
        int result = 0;

        // Exercice 2 : affichage du menu
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");

        // Exercice 3 : lecture de l'operateur
        operateur = sc.nextInt();

        // Exercices 7 et 8 : test de l'operateur AVANT de demander les operandes
        if (operateur < 1 || operateur > 5) {
            System.out.println("Error: the operator must be between 1 and 5.");
            System.exit(0);
        }

        // Exercice 4 : premiere operande
        System.out.println("Please enter the first number:");
        operande1 = sc.nextInt();

        // Exercice 5 : deuxieme operande
        System.out.println("Please enter the second number:");
        operande2 = sc.nextInt();

        // Division / modulo par zero impossibles
        if ((operateur == 4 || operateur == 5) && operande2 == 0) {
            System.out.println("Error: division by zero.");
            System.exit(0);
        }

        // Exercice 6 : calcul selon l'operateur
        switch (operateur) {
            case 1:
                result = operande1 + operande2;
                break;
            case 2:
                result = operande1 - operande2;
                break;
            case 3:
                result = operande1 * operande2;
                break;
            case 4:
                result = operande1 / operande2;
                break;
            case 5:
                result = operande1 % operande2;
                break;
        }

        System.out.println("The result is : " + result);
    }
}