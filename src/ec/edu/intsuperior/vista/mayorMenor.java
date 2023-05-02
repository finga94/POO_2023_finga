/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Aplicacion {
     static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
               Aplicacion.adivinarNumero();
        
    }
    
    public static void metodo1(){
        int i=1;
        while(i<=5){
            System.out.println(i);
            i++;
        }
        
    }
    
    public static void metodo2(){
        
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }        
    }
    
    public static void metodo3(){
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=5);
    }
    
    public static void adivinarNumero(){
        int n=(int)(Math.random()*10);
        int adivina;
        do{
        System.out.println(n+"ingresa un numero para ver si adivinas");
         adivina=leer.nextInt();
        if (adivina==n) {
            System.out.println("Felicidades ganaste");
        } else {
            System.out.println("Intenta de nuevo");
        }
        }while(adivina!=n);
    }
    public static void Numeroparoinpar(){
        int n=(int)(Math.random()*10);
        int adivina;
        do{
        System.out.println(n+"ingresele numero");
         adivina=leer.nextInt();
        if (adivina==n) {
            System.out.println("par ");
        } else {
            System.out.println("Inpar");
        }
        }while(adivina!=n);
    }
           public static void factorial (String[] args){
        Scanner teclado;
        teclado = new Scanner(System.in);
        int fact = 1;
        int num = 0;
        System.out.println("Imgrese el numero");
        num = teclado.nextInt(); 
        for (int ind=1; ind <=num;ind++){
                fact*=ind;
    }
          System.out.println("el factorial es :" +fact );  
    }
          }
      class  mayorMenor {
          public static void main (String[] args){
              Scanner teclado = null;
              Scanner Scanner = new Scanner(System.in);
        int num1 ;
        int num2 ;
        System.out.println("ingrese el primer numero ");
        num1 = teclado.nextInt(); 
        System.out.println("ingrese el segundo numero ");
        num2 = teclado.nextInt(); 
       if (num1==num2){
           System.out.println("Son iguales ");
       }
       else if (num1>num2){
           System.out.println("el mayor es : "+num1);
                 }
       else {
           System.out.println("el mayor es : "+num2);
       }
    }
          }
class fibonaci{
public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
        int num,anterior=0,actual=1 , fibo = 0;
        System.out.println("Imgrese el numero");
        num = teclado.nextInt(); 
        System.out.println("0 ,");
        System.out.println("1 ,");
        while (fibo<=num){
            fibo=(anterior+actual);
            anterior=actual;
            actual=fibo;
                            System.out.println( fibo + ","  );
            }
    }
class sumadepareimpar{
public static void main (string []  arg){
        Scanner teclado = new Scanner(System.in);
        int num;
        int supar=0;
        int suimpar=0;
         System.out.println("ingrese el numero");
         num=teclado.nextInt();
         for (int ind=1;ind<=num;ind++){
             if (ind%2==0){
                 supar+=ind;
             }
             else {
                 suimpar+=ind;
             }
         }
          System.out.println("La suma de los pares es :"+supar);
           System.out.println("La suma de los numeros impar es :"+suimpar);
       }
      
   }
}