package distancia;

import java.util.Scanner;

public class Distancia {

  
    public static void main(String[] args) {
        double x1 = Math.toRadians(25);
        double y1 = Math.toRadians(35);
        double x2 = Math.toRadians(35.5);
        double y2 = Math.toRadians(25.5);
        
        double raio = 6371.01;
        
        double distancia = raio * Math.acos(
                Math.sin(x1) * Math.sin(x2) +
                Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)
        );
        
        System.out.println("a distancia entre esses pontos e: " + distancia + " km" );
        
    }
    
}
