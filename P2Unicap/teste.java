package P2Unicap;

import java.util.Scanner;

public class teste{
    public static void preencherVetor(int[] vet){
        Scanner sc = new Scanner(System.in);
        int i;
        for(i=0; i< vet.length ; i++){
            System.out.println("["+i+"] =");
            vet[i] =sc.nextInt();
        }
    }
public static void main (String[] args){
    int [] numeros1 = new int[10];
    int[]  numeros2 = new int[20];
    int [] numeros3 = new int[15];

    System.out.println("Preechimento do vetor 1!");
    preencherVetor(numeros1);
    System.out.println("Preechimento do vetor 2!");
    preencherVetor(numeros2);
    System.out.println("Preechimento do vetor 3!");
    preencherVetor(numeros3);
   
}
}