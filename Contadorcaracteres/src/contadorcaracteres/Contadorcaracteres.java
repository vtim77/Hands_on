package contadorcaracteres;

import java.util.Scanner;

public class Contadorcaracteres {

 
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        System.out.print("digite uma string: ");
        String texto = sc.nextLine();
        
        int letras = 0, espacos = 0, numeros = 0, outros = 0;
        
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            
            if (Character.isLetter(c)) {
                letras++;
           } else if (Character.isDigit(c)) {             
               numeros++;
           } else if (Character.isSpaceChar(c)) {
               espacos++;
           } else {     
               outros++;
           }    
        }   
        
        System.out.println("Letras: " + letras);
        System.out.println("Numeros: " + numeros);
        System.out.println("Espaços: " + espacos);
        System.out.println("Outros: " + outros);
        
        sc.close();
    }           
}              
               
               
               
               
    