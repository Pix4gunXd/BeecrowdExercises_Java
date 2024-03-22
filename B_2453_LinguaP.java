package beeCrowd;

import java.util.Scanner;

public class B_2453_LinguaP {
   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String msg = sc.nextLine();
        
        String msgDeco = decodificarP(msg);
        
        System.out.println(msgDeco);
        
        
    }//Fim psvm
    
    public static String decodificarP(String msg){
        
        StringBuilder deco = new StringBuilder();
        
        int i = 0;
        
        while(i < msg.length()){
            
            char c = msg.charAt(i);
            
            if(c == 'p'){
                i++; //Se a letra for p pula para pegar letra original
            }
            
             deco.append(msg.charAt(i)); // Coloca a letra
           
             i++; // Prox. Letra
            
        }//FIM WHILE
        
        return deco.toString();
    }
    
    

}//FIM CLASSE
