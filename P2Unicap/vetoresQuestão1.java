package P2Unicap;
import java.util.Scanner;
public class vetoresQuestão1 {
    public static void preencherDados(double[] n) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n.length; i ++){
           System.out.printf( "coloque o valor %d: ",(i+1));
            n[i] = sc.nextDouble();
            

        }System.out.println("-------------------------------");
    }
    public static void calcularLucros ( double[] a, double [] b , double[] c ) {
        int i;
        for(i = 0; i < a.length; i ++){
            c[i] =(a[i] - b[i]);}
     
    }

    public static void mostraDados ( double[] n) {
        int i;
        for(i = 0; i < n.length; i ++){
     System.out.printf ("esses são os dados: %.1f\n",n[i]);
        }
        System.out.println("-------------------------------");
    }
    public static void somar ( double[] n) {
        int i;
        double soma = 0;
        for(i = 0; i < n.length; i ++){
        soma = soma + n[i];
        
        }
        System.out.printf ("esses são os dados: %.1f\n",soma);
     
        System.out.println("-------------------------------");}


            public static void main(String [] args){
        
        int tam = 12;
        double[] vetGanhos= new double[tam];
        double[] vetGastos = new double[tam];
        double[] vetLucros = new double[tam];
        System.out.println("Valores Ganhos :");
        preencherDados(vetGanhos);
        System.out.println("Valores Gastos :");
        preencherDados(vetGastos);
        calcularLucros(vetGanhos, vetGastos,vetLucros);
        System.out.println("Esses são os valores Ganhos :");
        mostraDados(vetGanhos);
        System.out.println("Esses são os valores Gastos :");
        mostraDados(vetGastos);
        System.out.println("Esses são os Lucros :");
        mostraDados(vetLucros);
        System.out.println("Esses são os valores totais Ganhos :");
        somar(vetGanhos);
        System.out.println("Esses são os valores totais Gastos :");
        somar(vetGastos);
        System.out.println("Esses são os Lucros totais :");
        somar(vetLucros);
        }
    
    
}

