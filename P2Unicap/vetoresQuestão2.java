package P2Unicap;
import java.util.Scanner;
public class vetoresQuestão2{
    public static void preencherDados(String[] nome , double[] nota1 , double[] nota2, double[] media, String[] situacao){
    Scanner sc = new Scanner(System.in);
    int i;
    for(i = 0; i < nome.length ;i ++){
        System.out.print("Escreva o nome do aluno: ");
        nome[i] = sc.nextLine();
        System.out.print("Escreva a primeira nota do aluno do aluno: ");
        nota1[i] = sc.nextDouble();
        System.out.printf("Escreva a segunda nota do aluno do aluno: ");
        nota2[i] = sc.nextDouble();
        media[i] = (nota1[i]*2 + nota2[i]*3)/5;
        System.out.printf("Essa é a media do aluno: %.1f\n ",media[i]);
                 
                        }
 System.out.println("-------------------------------");
    }
               


    

public static void setMedia(String[] nome,double[] media, String[] situacao){
    int i;
    for(i = 0; i < nome.length ; i ++){
    System.out.printf("O aluno %s obteve média %.1f e está %s.\n",nome[i],media[i],situacao[i]);
    }
}
  

    public static void main(String [] args){
       int tam = 5;
       String[] nomes = new String[tam];
       double[] nota1 = new double[tam];
       double[] nota2 = new double[tam];
       double[] media = new double[tam];
       String[] situacao = new String[tam];
       preencherDados(nomes,nota1,nota2,media,situacao);
       setMedia(nomes, media, situacao);
}

}
