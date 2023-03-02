package P2Unicap;
import java.util.Scanner;
public class vetoresQuestão3{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int tam = 20;
        double vetA[] = new double[tam];
        double vetB[] = new double[tam];
        double vetC[] = new double[tam];
        int i;
        for(i = 0; i < vetA.length; i++){
            System.out.println("vetor A :");
            vetA[i] = sc.nextDouble();
            System.out.println("vetor B :");
            vetB[i] = sc.nextDouble();
            vetC[i] = vetA[i] + vetB[i];
            System.out.println("vetor C :");
            System.out.println(vetC[i]);
        }
    }
}