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
        System.out.println("Sair ou continuar no programa?\nContinuar\nSair");
        int EntradaUser = leitura.nextInt();
            
            if(EntradaUser == 1) {
                exitBoolean = false;
            }
            else if (EntradaUser == 2){
                exitBoolean = true;
            }
            else {
                System.out.println("Comando não encontrado!");
                exitBoolean = true;                
            }
    }
        
     }

    public static double FuncSubt() {

         Scanner leitura = new Scanner(System.in); // instanciando o objeto Scanner usando um dispositivo de entrada (System.in)        
         Adicao ObjAdicao = new Adicao();
        
        Subtracao ObjSubtracao = new Subtracao();

            System.out.println("Informe um número:");

            ObjSubtracao.subtracao1 = leitura.nextDouble();

            System.out.println("Informe outro número:");

            ObjSubtracao.subtracao2 = leitura.nextDouble();

        Double ResultadoSubt = ObjSubtracao.subtracao1 - ObjSubtracao.subtracao2;
        
        return ResultadoSubt;

        }
        
    public static double FuncDiv(){

        Scanner leitura = new Scanner(System.in); // instanciando o objeto Scanner usando um dispositivo de entrada (System.in)        
         Adicao ObjAdicao = new Adicao();

        Divisao ObjDivisao = new Divisao();

        System.out.println("Informe um número:");
        ObjDivisao.divisao1 = leitura.nextDouble();
        System.out.println("Informe outro número");
        ObjDivisao.divisao2 = leitura.nextDouble();
        
        Double ResultadoDiv;
        return ResultadoDiv;


    }

    }




     
        

    