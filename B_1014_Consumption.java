package beeCrowd;

import java.util.Scanner;


public class B_1014_Consumption {
    
    public static void main(String []args){
    
        Scanner sc = new Scanner(System.in);
        
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        
        double saida = x/y;
        
        System.out.println(String.format("%.3f", saida) + " km/l");
        
    }
    
}
