/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alvar
 */
public class Calculadora {
    private int num1;
    private int num2;

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum2() {
        return num2;
    }
    public int sumar(){
        int suma = num1+num2;
        return suma;
    }
    public int restar(){
        int resta = num1-num2;
        return resta;
    }
    public int mult(){
        int mult = num1*num2;
        return mult;
    }
    public double div(){
        
            double div = num1/num2;
            return div;
        
        
    }
    public boolean validar(){
        return !(this.getNum1()<=0 ||this.num2<=0 || this.num1 == this.num2);
    }
    
    
}
