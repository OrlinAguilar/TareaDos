/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareados;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TareaDos {

     
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner cadena = new Scanner(System.in); 
        
        
        String str; // declarando la varile que almacenara la cadena.   
           System.out.println("Ingrese la operacion que desea realizar en una solo linea con espacios");  
            str = cadena.nextLine();//Almacenando la cadena.
           //str = " 3 + 2";
       //Esta parte es solo para hacer la salida de un arreglo 
           System.out.println("La cadena ingresada es: " + str );
           System.out.println(Arrays.toString(str.split(" ")));  
             
      // Para tokenizar la cadena
        StringTokenizer tokens = new StringTokenizer(str, " ");  
        String[] newStr = new String[tokens.countTokens()];
             int index=0;
              while(tokens.hasMoreTokens()){
                 newStr[index] = tokens.nextToken();
                 System.out.println(newStr[index]);
                 index++;
        }
      //Solo funciona cundo la cadena son numeoros enteros 
        Integer número = Integer.decode(str);
    }
    
    }
