package P2Unicap;
import java.util.Scanner;
public class vetoresQuestão2{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int tam = 20;
        int vetA[] = new int[tam];
        int i;
        int maior = 0;
        int menor = 0;
        for(i = 0; i < vetA.length; i++){
            System.out.println("vetor A "+ (i+1));
            vetA[i] = sc.nextInt();
            menor = vetA[i];
            if (maior <=vetA[i]){
            
                maior = vetA[i];
                
            }
            if(i != 0 && maior <= vetA[(i-1)] ){
                maior = vetA[(i-1)];
            } if (menor >= vetA[i]){
            
                menor = vetA[i];
                
            }
            if(i != 0 && menor >= vetA[(i-1)] ){
                menor = vetA[(i-1)];
            }
            

    }System.out.println("maior valor: "+maior);
    System.out.println("menor valor: "+menor);
}
}