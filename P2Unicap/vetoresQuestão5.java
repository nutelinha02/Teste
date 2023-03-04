package P2Unicap;
import java.util.Scanner;
public class vetoresQuestão5 {
    System.out.print("Escreva a primeira nota do aluno do aluno: ");
        nota1[i] = sc.nextDouble();
        System.out.printf("Escreva a segunda nota do aluno do aluno: ");
        nota2[i] = sc.nextDouble();
        media[i] = (nota1[i]*2 + nota2[i]*3)/5;
        System.out.printf("Essa é a media do aluno: %.1f\n ",media[i]);
        if(media[i]>= 7 && media[i]<= 10){
            situacao[i] = "Aprovado";
         }
        else if(media[i]< 7 && media[i]>=3){
            situacao[i] = "Recuperação";           
             }
        else if(media[i]< 3 && media[i]>=0){
            situacao[i] = "Reprovado";           
                        }
}