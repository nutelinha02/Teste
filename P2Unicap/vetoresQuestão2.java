package P2Unicap;
import java.util.Scanner;
public class vetoresQuestão2{
  public static void preencherDados(String[] nome , double[] num1 , double[] num2, double[] media, String[] situacao){
    Scanner sc = new Scanner(System.in);
    int i;
   for(i = 0; i < nome.length ;i ++){
        
        System.out.printf("Escreva o nome do aluno: ");
        nome[i] = sc.nextLine();
        System.out.print("Escreva a primeira nota do aluno do aluno(a): ");
        num1[i] = sc.nextDouble();        
        System.out.printf("Escreva a segunda nota do aluno do aluno(a): ");
        num2[i] = sc.nextDouble();
        sc.nextLine();
        media[i] = (num1[i]*2 + num2[i]*3)/5;
       
       
        if(media[i]>= 7 && media[i]<= 10){
            situacao[i] = "Aprovado(a)";
         }
        else if(media[i]< 7 && media[i]>=3){
            situacao[i] = "de Recuperação";           
             }
        else if(media[i]< 3 && media[i]>=0){
            situacao[i] = "Reprovado(a)";           
                        }
                        }
 System.out.println("--------------------------------------------------------------");
    }      
public static void porcentagem(double[] porcent){
    int i;
    int j = 0;
    int tam = porcent.length;
    for(i = 0; i < porcent.length ; i++){
        if(porcent[i]<= 7 && porcent[i]>= 0){
            j++;
        }

}int por = (j*100)/(tam);
System.out.println("A porcentagem de alunos abaixo da media é : " +por + "%");
System.out.println("--------------------------------------------------------------");


} 
public static void lerDadosDaMedia(String[] nome,double[] media, String[] situacao){
    int i;
    for(i = 0; i < nome.length ; i ++){
    System.out.printf("O aluno(a) %s obteve média %.1f e está %s.\n",nome[i],media[i],situacao[i]);
    }
    System.out.println("--------------------------------------------------------------");
}
public static void mediaTotal(double[] medias){
    int i;
    double total = 0;
    double todasMedias = 0;
    double tam = medias.length;
    for (i = 0; i< medias.length; i++){
        total = total + medias[i];
        todasMedias = (total/tam);
    }

System.out.printf("Media total é : %.1f\n",todasMedias);
System.out.println("--------------------------------------------------------------");}
public static void maiorMedia(double[] maior){
    int i;
double better = 0;

for(i = 0; i < maior.length; i++){
if (better <=maior[i]){
better = maior[i];
}
if(i != 0 && better <= maior[(i-1)] ){
better = maior[(i-1)];
}
}System.out.printf("A maior media é: %.1f\n",better);
}
public static void main(String [] args){
       int tam = 2;
       String[] nomes = new String[tam];
       double[] nota1 = new double[tam];
       double[] nota2 = new double[tam];
       double[] media = new double[tam];
       String[] situacao = new String[tam];
        preencherDados(nomes,nota1,nota2,media,situacao);
       lerDadosDaMedia(nomes, media, situacao);
       mediaTotal(media);       
       porcentagem(media);
       maiorMedia(media);
}

}
