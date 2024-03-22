package beeCrowd;

import java.io.IOException;
import java.util.Scanner;

public class B_1011_Sphere {
    
    public static void main(String []args) throws IOException{
        
        Scanner sc = new Scanner(System.in);
        
        String entrada = sc.nextLine();
        
        Double raio = Double.parseDouble(entrada);
        
        Double volume = ((4.0/3) * 3.14159 * (raio*raio*raio));
        
//      String total = String.format("%.3f%", volume); Não funcionava por conta do % dps do f
        System.out.println(String.format("VOLUME = %.3f", volume));
        
    }
    
}
