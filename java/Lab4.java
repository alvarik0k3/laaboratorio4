/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import java.util.Scanner;


/**
 *
 * @author alvar
 */
public class Lab4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i=0,op,num1,num2;
        Calculadora calculadora;
        while(i==0){
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Dividir");
            System.out.println("4. Multiplicar");
            System.out.println("5. Salir");
            op = entrada.nextInt();
            if(op==1){
                System.out.println("ingrese los numeros para realizar la operacion");
                num1 = entrada.nextInt();
                num2 = entrada.nextInt();
                calculadora = new Calculadora(num1,num2);
                if(calculadora.validar()==true){
                    System.out.println("el resultados es: "+calculadora.sumar());
                }
                else{
                    System.out.println("debe ingresar dos numeros positivos y distintos entre si (intentelo otra vez)");
                }
                
                
            }
            if(op==2){
                System.out.println("ingrese los numeros para realizar la operacion");
                num1 = entrada.nextInt();
                num2 = entrada.nextInt();
                calculadora = new Calculadora(num1,num2);
                if(calculadora.validar()==true){
                    System.out.println("el resultados es: "+calculadora.restar());
                }
                else{
                    System.out.println("debe ingresar dos numeros positivos y distintos entre si (intentelo otra vez)");
                }
                
                
            }
            if(op==3){
                System.out.println("ingrese los numeros para realizar la operacion");
                num1 = entrada.nextInt();
                num2 = entrada.nextInt();
                calculadora = new Calculadora(num1,num2);
                if(calculadora.validar()==true){
                    System.out.println("el resultados es: "+calculadora.div());
                }
                else{
                    System.out.println("debe ingresar dos numeros positivos, distintos entre si y que no existe la divicion entre 0 (intentelo otra vez)");
                }
                
                
            }
            if(op==4){
                System.out.println("ingrese los numeros para realizar la operacion");
                num1 = entrada.nextInt();
                num2 = entrada.nextInt();
                calculadora = new Calculadora(num1,num2);
                if(calculadora.validar()==true){
                    System.out.println("el resultados es: "+calculadora.mult());
                }
                else{
                    System.out.println("debe ingresar dos numeros positivos, distintos entre si(intentelo otra vez)");
                }
                
                
            }
            if(op==5){
                i=1;
            }
            else{
                System.out.println("ingrese una opcion valida");
            }
        }
        
    }
}
