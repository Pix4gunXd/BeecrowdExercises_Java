package beeCrowd;

import java.util.Scanner;
/**
 *
 * @author caiop
 */
public class B_1017_FuelSpent {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String time = sc.nextLine();
        String speed = sc.nextLine();
        
        double t = Double.parseDouble(time);
        double s = Double.parseDouble(speed);
        
        double distance = s * t;
        
        double resposta = distance / 12;
        
        System.out.println(String.format("%.3f", resposta));
        
        
    }//FIM PSVM
}
