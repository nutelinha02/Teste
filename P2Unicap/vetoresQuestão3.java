package P2Unicap;
import java.util.Scanner;
public class vetoresQuestão3{
public static void votação(String[] part){
  
        

    }

    public static void main(String [] args){
       String[] participantes = new String [9];
       participantes[0] = "Voto em branco";
       participantes[1] = "Voto em João";
       participantes[2] = "Voto em Maria";
       participantes[3] = "Voto em Pedro";
       participantes[4] = "Voto em Luís";
       participantes[5] = "Voto em Ana";
       participantes[6] = "Voto em Luiza";
       participantes[7] = "Voto em Silvia";
       participantes[8] = "Voto em André";
       Scanner sc = new Scanner(System.in);
       System.out.println("escolha o candidato de 0 até 8");
       int candidato = sc.nextInt();
       String resposta = null;
       String S = "S";
       String s = "s";
       String n = "n";
       String N = "N";
       int i ;
       int branco = 0;
       int joao = 0;
       int maria = 0; 
       int pedro = 0;
       int ana = 0;
       int silvia = 0;
       int luis = 0;
       int luiza = 0;
       int nulo = 0;
       int andre = 0;
    
      
       for(i = 0; i == 0 || resposta == S || resposta == s;i++){
        System.out.println("0-Voto em branco");
        System.out.println("1-Voto em João");
        System.out.println("2-Voto em Maria");
        System.out.println("3-Voto em Pedro");
        System.out.println("4-Voto em Luís");
        System.out.println("5-Voto em Ana");
        System.out.println("6-Voto em Luiza");
        System.out.println("7-Voto em Silvia");
        System.out.println("8-Voto em André");
        
        if(participantes[candidato].equals("Voto em branco")){

            branco++;
        } else if(participantes[candidato].equals("Voto em João")){
            joao++;

        }else if(participantes[candidato].equals("Voto em Maria")){
            maria++;
        }else if(participantes[candidato].equals("Voto em Pedro")){
        pedro++;}
        else if(participantes[candidato].equals("Voto em Luís")){
            luis++;
        }else if(participantes[candidato].equals("Voto em Ana")){
        ana++;}
        else if(participantes[candidato].equals("Voto em Luiza")){
        luiza++;
        }
        else if(participantes[candidato].equals("Voto em Silvia")){
            silvia++;
        }
        else if(participantes[candidato].equals("Voto em André")){
        andre++;}
        else{
            nulo++;

        }
        System.out.println("Tem pessoas querendo votar?(S ou s ou N ou n)");
        resposta = sc.next();
        resposta.trim();
        
        if(resposta == s || resposta == S){
            System.out.println("--------------------------------------------------------------");
            System.out.println("escolha o candidato de 0 até 8");
            candidato = sc.nextInt();
        }
        else if(resposta==N || resposta==n){
        break;
        }
        else{
        for(int h = 0;(!s.equalsIgnoreCase(resposta)) && (!n.equalsIgnoreCase(resposta));h++){
        System.out.println("Tem pessoas querendo votar?(S ou s ou N ou n)");
        resposta = sc.next();
        resposta.trim();
       
        }   
        }
        }

    }


        }
       
        
        
       
       

    
