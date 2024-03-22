package beeCrowd;

import static java.lang.Math.abs;
import java.util.Scanner;

public class B_1013_TheGreatest {
    
    public static void main (String []args){
    
        Scanner sc = new Scanner(System.in);
        
        String entrada = sc.nextLine();
        
        String[] ns = entrada.split(" ");
        
        if(ns.length >=2){
         
            String N1 = ns[0];
            String N2 = ns[1];
            String N3 = ns[2];
            
            int a = Integer.parseInt(N1);
            int b = Integer.parseInt(N2);
            int c = Integer.parseInt(N3);
            
            if((a>b)&&(a>c)){
                System.out.println(a + " eh o maior");
            }else if((b>a)&& (b>c)){
                System.out.println(b + " eh o maior");
            }else if((c>a)&& (c>b)){
                System.out.println(c + " eh o maior");
            }
          
        }//Fim IF
    } //Fim Main     
}
