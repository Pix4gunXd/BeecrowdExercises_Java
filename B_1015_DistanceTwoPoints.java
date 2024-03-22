package beeCrowd;

import java.io.IOException;
import java.util.Scanner;

public class B_1015_DistanceTwoPoints{
    
    public static void main(String[] args) throws IOException {
    
        Scanner sc = new Scanner(System.in);
        
        String valor_1 = sc.nextLine();//Coordenadas 1
        String valor_2 = sc.nextLine();//Coordenadas 2
        
        
        String[] ns = valor_1.split(" ");
        
        if(ns.length >=1){
            
            String N1_1 = ns[0];
            String N1_2 = ns[1];
            
            String[] ns_2 = valor_2.split(" ");
            
            if(ns_2.length >=1){
                
                String N2_1 = ns_2[0];
                String N2_2 = ns_2[1];
                
               double X1;
               double Y1;
               
               double X2;
               double Y2;
                
               X1 = Double.parseDouble(N1_1); 
               Y1 = Double.parseDouble(N1_2); 
               
               X2 = Double.parseDouble(N2_1); 
               Y2 = Double.parseDouble(N2_2); 
                
              double distancia = Math.sqrt(Math.pow(X2-X1, 2) + Math.pow(Y2-Y1, 2));
                
              System.out.println(String.format("%.4f", distancia));
              
            }//Fim IF 2
            
        }//Fim IF 1
    }//Fim Main
   
}
