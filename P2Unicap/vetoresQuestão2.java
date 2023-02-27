package P2Unicap;
import java.util.Scanner;
public class vetoresQuestão2{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int A[] = new int[15];
        int B[] = new int[15];
        
        for(int i = 0;i < A.length ;i++){
            A[i] = 2*i++;
              
        }
        for(int e = 0; e < 8;e++){
            B[2*e] = A[2*e]/2;
            System.out.println(B[2*e]);
        }

    }
}