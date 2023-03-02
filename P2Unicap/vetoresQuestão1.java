package P2Unicap;
import java.util.Scanner;
public class vetoresQuestão1 {
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int tam = 13;
        double vetA[] = new double[tam];
        double total = 0;
        int i;
        for(i = 0; i < vetA.length; i++){
            System.out.printf("vetor A %d : ",(i+1));
            vetA[i] = sc.nextDouble();
           total = total + vetA[i];
           if((i+1)%10 == 0 ){
            System.out.printf("A soma até o momento é %.1f\n",total);
           }
sc.close();
        }
        System.out.printf("A soma é %.1f\n",total);
        }
    
    
}

