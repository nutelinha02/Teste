package P2Unicap;
import java.util.Scanner;
public class vetoresQuestão4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        final int tam = 20;   
        String[] nomes = new String[tam];
        double[] notas1 = new double[tam];
        double[] medias = new double[tam];
        double[] notas2 = new double[tam]; 
        boolean[] situcao = new boolean[tam];
        int i;
        for(i = 0; i < nomes.length; i++){
            System.out.println("aluno"+ (i+1));
            System.out.print("informe o nome : ");
            nomes[i] = sc.nextLine();
            System.out.println("informe a nota 1 do aluno: ");
            notas1[i] = sc.nextDouble();
            sc.nextLine();// limpeza do buffer de entrada
            System.out.println("informe a nota 2 do aluno: ");
            notas2[i] = sc.nextDouble();
            sc.nextLine();//limpeza do buffer de entrada

        } for(i = 0; i < nomes.length; i++){
            medias[i] = (notas1[i]*2 + notas2[i]*3)/5;
        
    }
    for(i = 0; i < nomes.length; i++){
        if(medias[i] >= 7.0){
            situcao[i] = true;
        }
    }
    System.out.println("Lista de alunos aprovados");
    for(i = 0; i < nomes.length; i++){
        if (situcao[i] == true){
            System.out.println("Nome: "+  nomes[i] + "media: " + medias[i]);
        }
    }  System.out.println("Lista de alunos reprovados");
    for(i = 0; i < nomes.length; i++){
        if (situcao[i] == false){
            System.out.println("Nome: "+  nomes[i] + "media: " + medias[i]);
    }
}
    }
}