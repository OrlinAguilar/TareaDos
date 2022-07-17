/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareados;
//import java.util.Arrays;
import java.util.Scanner;

public class IntentoDosTarea {
    @SuppressWarnings("null")
    public static void main(String[] args) {
  
    Scanner cadena = new Scanner(System.in);
    
    // declarando la varile que almacenara la cadena.   
    String str;  
    
    //Slida del mendsaje en la consola 
    System.out.println("Ingrese la operacion que desea realizar ");  
    System.out.println("en   una   solo  linea   con  espacios: ");
    
    //Almacenando la cadena.
    str = cadena.nextLine();  
    
    // Declarando variables tipo String 
   String numero1;         
   String numero2;  
   String signo;  
   
   //Almacendando en posiciones de un arreglo la cadena ingresada 
   numero1 =str.split(" ")[0];
   numero2 =str.split(" ")[2];
   signo =str.split(" ")[1];
   
   //Declarando varibles enteras 
   int num1; 
   int num2;
   
   int num4;
   
   //convirtiendo los numeros de la cadena en enteros 
   num1= Integer.parseInt(numero1);
   num2=Integer.parseInt(numero2);
  
  //System.out.println("La cadena ingresada es: " + num3 );
  
  //Declarando variables tipo String 
   String mas;
   String menos;
   String division;
   String multiplicacion;
   
   //Almcenando los 4 operadores basico 
   mas = "+";
   menos = "-";
   division = "/";
   multiplicacion = "*";
   
   //Declarando variables tipo entero 
   int operacionSuma ;
   int operacionResta;
   int operacionDiv;
   int operacionMult;
   
   //Realizando un banco de operaciones posibles con los datos ingresados 
   operacionSuma= num1+num2;
   operacionResta= num1-num2;
   operacionDiv = num1/num2;
   operacionMult= num1*num2;
   
   //Verificar que tipo de operador es para posteriormete imprimir el resultado 
   if (signo == null ? mas == null : signo.equals(mas) ){
      System.out.println("El resultado de la operacion de la cadena ingresada es : " + operacionSuma ); 
       
   }
   
   if (signo == null ? menos == null : signo.equals(menos) ){
      System.out.println("El resultado de la operacion de la cadena ingresada es : " + operacionResta ); 
       
   }
   
   if (signo == null ? division == null : signo.equals(division) ){
      System.out.println("El resultado de la operacion de la cadena ingresada es : " + operacionDiv ); 
       
   }
   
   if (signo == null ? multiplicacion == null : signo.equals(multiplicacion) ){
      System.out.println("El resultado de la operacion de la cadena ingresada es : " + operacionMult ); 
       
   }
  
  
    }
}
   
 