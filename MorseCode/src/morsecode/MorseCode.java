/*Covierte solo texto de  A-Z, los números 0-9 no están incluidos*/
package morsecode;

import java.util.Scanner;
/**
 *
 * @author Trainer
 */
public class MorseCode {

   
    public static void main(String[] args) {
        
        
/*=====================================
=            Texto a morse            =
=====================================*/

  Scanner escriba = new Scanner(System.in);
   
          String morse[]= new String[91];
        //Valores del Codigo ASCII de A a Z y Espaciado
          morse[65]=".- ";
          morse[66]="-... ";
          morse[67]="-.-. ";
          morse[68]="-.. ";
          morse[69]=". ";
          morse[70]="..-. ";
          morse[71]="--. ";
          morse[72]=".... ";
          morse[73]=".. "; //i
          morse[74]=".--- ";
          morse[75]="-.- ";
          morse[76]=".-.. ";
          morse[77]="-- ";
          morse[78]="-. ";
          morse[79]="--- ";
          morse[80]=".--. ";
          morse[81]="--.- ";
          morse[82]=".-. ";
          morse[83]="... ";
          morse[84]="- ";
          morse[85]="..- ";
          morse[86]="...- ";
          morse[87]=".-- ";
          morse[88]="-..- ";
          morse[89]="-.-- ";
          morse[90]="--.. ";
          morse[32]="   "; //Espaciado de 3 lineas
          //Pidiendo datos
          System.out.println("ESCRIBA UNA LETRA O PALABRA:");
          String palabra=escriba.nextLine();
          //Convierte la palabra en un array de caracteres
          palabra=palabra.toUpperCase();
          char texto[]=palabra.toCharArray();
          //Recorriendo la texto
          for(int i=0;i<(texto.length);i++){
           int indice=(int)texto[i];
           System.out.print(morse[indice]+"   ");
          }
     

/*=====  End of Texto a morse  ======*/

//Un salto de linea
System.out.println("\n");      
          
          
/*=======================================
=            Viceversa Morse            =
=======================================*/
//Variables
     String cadena;   
     Scanner entrada=new Scanner(System.in);
//Leer datos                 
      System.out.println("INGRESE UN CÓDIGO MORSE:");
        cadena=entrada.nextLine();

//Separacion de caracteres
        String [ ] caracter = cadena.split("\\ ");
        int i=0;
        
        while(i <= caracter.length-1){
            //Todas las opciones disponibles para cada caso
            if (caracter[i].equals(".-")){
                 System.out.print("A ");
             } else if (caracter[i].equals("-...")){
                 System.out.print("B ");
             }else if (caracter[i].equals("-.-.")){
                System.out.print("C ");
            }else if (caracter[i].equals("-..")){
                System.out.print("D ");
            }else if (caracter[i].equals(".")){
                System.out.print("E ");
            }else if (caracter[i].equals("..-.")){
                System.out.print("F ");
            }else if (caracter[i].equals("--.")){
                System.out.print("G ");
            }else if (caracter[i].equals("....")){
                System.out.print("H ");
            }else if (caracter[i].equals("..")){
                System.out.print("I ");
            }else if (caracter[i].equals(".---")){
                System.out.print("J ");
            }else if (caracter[i].equals("-.-")){
                System.out.print("K ");
            }else if (caracter[i].equals(".-..")){
                System.out.print("L ");
            }else if (caracter[i].equals("--")){
                System.out.print("M ");
            }else if (caracter[i].equals("-.")){
                System.out.print("N ");
            }else if (caracter[i].equals("---")){
                System.out.print("O ");
            }else if (caracter[i].equals(".--.")){
                System.out.print("P ");
            }else if (caracter[i].equals("--.-")){
                System.out.print("Q ");
            }else if (caracter[i].equals(".-.")){
                System.out.print("R ");
            }else if (caracter[i].equals("...")){
                System.out.print("S ");
            }else if (caracter[i].equals("-")){
                System.out.print("T ");
            }else if (caracter[i].equals("..-")){
                System.out.print("U ");
            }else if (caracter[i].equals("...-")){
                System.out.print("V ");
            }else if (caracter[i].equals(".--")){
                System.out.print("W ");
            }else if (caracter[i].equals("-..-")){
                System.out.print("X ");
            }else if (caracter[i].equals("-.--")){
                System.out.print("Y ");
            }else if (caracter[i].equals("--..")){
                System.out.print("Z ");
            }else if(caracter[i].equals(" ")){
                System.out.print("   ");
            }

             i++;
        }
/*=====  End of Viceversa Morse  ======*/   
          
//Un salto de linea
System.out.println("\n");      

        
    }
    
    
}
