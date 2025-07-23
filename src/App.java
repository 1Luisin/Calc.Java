import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner leitura = new Scanner(System.in); // instanciando o objeto Scanner usando um dispositivo de entrada (System.in)
        
        Double soma1; // Váriavel
        Double soma2; // Váriavel 2
        System.out.println("bem vindo a calculadora!");
        System.out.println("Informe um número");

        soma1 = leitura.nextDouble();

        System.out.println("Informe o segundo número.");

        soma2 = leitura.nextDouble();

        Double ResultadoSoma = soma1 + soma2;

        System.out.println("O resultado da soma é: " + ResultadoSoma);
    
    }
}
