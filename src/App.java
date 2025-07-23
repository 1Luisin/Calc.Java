import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Boolean exitBoolean = false;

        Scanner leitura = new Scanner(System.in); // instanciando o objeto Scanner usando um dispositivo de entrada (System.in)        
        Adicao ObjAdicao = new Adicao();
        
        while(exitBoolean != true){
        
        System.out.println("Bem vindo a calculadora!");
        System.out.println("Informe um número");

        ObjAdicao.adicao1= leitura.nextDouble();

        System.out.println("Informe um segundo número.");

        ObjAdicao.adicao2= leitura.nextDouble();

        Double ResultadoSoma = ObjAdicao.adicao1 + ObjAdicao.adicao2;

        System.out.println("O resultado da soma é: " + ResultadoSoma);
        }
        
        
            
        
    }

    //public static double FuncDiv() {
        
        //Subtracao ObjSubtracao = new Subtracao();

        
}




     
        

    