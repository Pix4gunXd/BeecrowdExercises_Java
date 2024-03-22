package beeCrowd;
import java.util.Scanner;

// @author caiop
 
public class B_1020_AgeInDays {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int ano = 0;
        int mes = 0;
        int dia = 0;
        
        boolean flag = false;
        
        int resposta = sc.nextInt();
        
        while(flag == false){
            
            if(resposta >= 365 ){
                ano++;
                resposta = resposta - 365;
            }else if(resposta >= 30){
                mes++;
                resposta = resposta - 30;
            }else{
                dia = resposta;
                flag = true;
            }
            
        }
        
        System.out.println(ano + " ano(s)\n" + mes + " mes(es)\n"+ dia + " dia(s)" );
     
    }
}
