package P2Unicap;
import java.util.Scanner;
public class vetoresQuestão1 {
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int tam = 100;
        double vetA[] = new double[tam];
        double total = 0;
        int i;
        for(i = 0; i < vetA.length; i++){
            System.out.println("vetor A " +(i+1));
            vetA[i] = sc.nextDouble();
           total = total + vetA[i];
           if((i+1)%10 == 0  && i != 0){
            System.out.println("A soma até o momento é "+ total);
           }

        }
        System.out.print("A soma é "+ total);
        }
    
}

