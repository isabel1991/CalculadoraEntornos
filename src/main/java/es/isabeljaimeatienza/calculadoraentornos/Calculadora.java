/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.isabeljaimeatienza.calculadoraentornos;

/**
 *
 * @author cadit
 */
public class Calculadora {
    
    private double ans;
    public double ans(){
        return ans;
    }
	
    public double suma (double a , double b){
        ans = a+b;
        return ans;
    } 
	
    public double resta (double a, double b){
        ans = b-a;
        return ans;
        
    }
    double divide (double a , double b){
        if (b==0){
            throw new ArithmeticException("INFINITO");
        }
        ans = a/b;
        return ans;
    }
    
    double multiplica (double a , double b){
        ans= a*b;
        return ans;
    }
	
    double suma (double a){
        ans = ans+a;
        return ans;
    } 

    double resta (double a){
        ans=ans-a;
        return ans;
        
    }

    double divide (double a){
        if (a==0){
            throw new ArithmeticException("No se puede dividir por cero!!!");
        }
        ans = ans/a;
        return ans;
    }
    
    double multiplica (double a){
        ans=ans*a;
        return ans;
        
    }
    public void clear(){
        ans=0;
    }
	
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
