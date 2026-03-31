package múltiplaescolha;

import java.util.Scanner;

public class Múltiplaescolha {
 
    
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     int tentativa = 0;
     char resposta;
     boolean acertou = false;
     
     do {
         tentativa++;
         
         System.out.println("\nQual e o resultado de 2 + 2?");
         System.out.println("(a) 3");
         System.out.println("(b) 4");
         System.out.println("(c) 5");
         System.out.println("(d) 6");
         System.out.println("(e) 7");
         System.out.println("escolha uma opcao: ");
         
         resposta = sc.next().charAt(0);
         
         switch (resposta) {
             case 'b':
             case 'B':
                 System.out.println("resposta correta na tentativa " + tentativa);
                 acertou = true;
                 break;
                 
             case 'a':
             case 'c':
             case 'd':
             case 'e':
             case 'A':
             case 'C':
             case 'D':
             case 'E':
                 System.out.println("resposta incorreta");
                 break;
                 
             default: 
                 System.out.println("Opcao invalida");
         }        
     } while (!acertou && tentativa <3);
     
     if (!acertou) {
         System.out.println("Resposta incorreta nas 3 tentativas");
     }
     
     sc.close();
    }
    
}
