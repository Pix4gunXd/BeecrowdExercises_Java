package beeCrowd;
import java.util.Scanner;
 // @author caiop

public class B_1019_TimeConversion {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        
        boolean flag = false;
        
        int sec = sc.nextInt();
        
        while(flag == false){
        
            if(sec >= 3600){
                hours++;
                sec = sec - 3600;
            }else if(sec >= 60){
                minutes++;
                sec = sec - 60;
            }else{
                seconds = sec;
                flag = true;
            }
        }//Fim while
        
        System.out.println(hours +":"+minutes+":"+seconds);
        
    }
    
}
