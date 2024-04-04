/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author alvar
 */
public class recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String palabra;
        System.out.println("ingrese una palabra para ver si es palindrome: ");
        palabra = entrada.nextLine();
        char[] normal = new char[palabra.length()];
        char[] revez = new char[palabra.length()];
        boolean validar = false;

        for (int i = 0; i < palabra.length(); i++) {
            normal[i] = palabra.charAt(i);
        }
        int index = palabra.length() - 1;
        for (int i : normal) {

            revez[index] = (char) i;
            index--;

        }
        for (int i = 0; i < palabra.length(); i++) {
            if (normal[i] == revez[i]) {
                validar = true;
            } else {
                validar = false;
            }

        }
        if (validar == false) {
            System.out.println("no es palindrome");
        } else {
            System.out.println("es palindrome");
        }

    }

}
