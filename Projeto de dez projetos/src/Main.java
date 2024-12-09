/*
Aluno: Fabrício John Sullivan
Dia: 9/12/2024
Projeto: Catalisa
Professora: Laura Fumagalli Rodrigues
Atividade 5 (Compilado de 10 projetos:
##Neste compilado ieri usar um menu de opção switch e caso o usáurio quere usar um dos projetos é so clicar no respectivo numero em que ele está representado (de 1 á 10)
### 1 - Soma de Números
### 2 - Fatorial
### 3 - Contagem de Dígitos
### 4 - Números Primos
### 5 - Inversão de Número
### 6 - Potência
### 7 - Palíndromo
### 8 - Múltiplos de um Número
### 9 - Conversão de Binário para Decimal
### 10 - Série de Fibonacci
 */
// Importando biblioteca
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0; // Declaração da variável para armazenar a opção do usuário
        // ----------------------------------------------------------------------------------------------------
        // Loop para validar a opção
        // ----------------------------------------------------------------------------------------------------
        while (opcao < 1 || opcao > 10) {
            System.out.println("Digite um número entre 1 e 10:");
            System.out.println("1 - Soma de Números");
            System.out.println("2 - Fatorial");
            System.out.println("3 - Contagem de Dígitos");
            System.out.println("4 - Números Primos");
            System.out.println("5 - Inversão de Número");
            System.out.println("6 - Potência");
            System.out.println("7 - Palíndromo");
            System.out.println("8 - Múltiplos de um Número");
            System.out.println("9 - Conversão de Binário para Decimal");
            System.out.println("10 - Série de Fibonacci");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                if (opcao < 1 || opcao > 10) {
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next(); // Limpa a entrada inválida
            }
        }
        // ----------------------------------------------------------------------------------------------------
        // Realizando a operação com base na escolha do usuário
        // ----------------------------------------------------------------------------------------------------
        switch (opcao) {
            // ----------------------------------------------------------------------------------------------------
            case 1: // Soma de Números
                System.out.print("Digite um número inteiro: ");
                int numero = scanner.nextInt();
                int soma = 0;
                for (int i = 1; i <= numero; i++) {
                    soma += i;
                }
                System.out.println("A soma dos números de 1 a " + numero + " é: " + soma);
                break;
            // ----------------------------------------------------------------------------------------------------
            case 2: // Fatorial
                System.out.print("Digite um número inteiro: ");
                numero = scanner.nextInt();
                int fatorial = 1;
                for (int i = 1; i <= numero; i++) {
                    fatorial *= i;
                }
                System.out.println("O fatorial de " + numero + " é: " + fatorial);
                break;
            // ----------------------------------------------------------------------------------------------------
            case 3: // Contagem de Dígitos
                System.out.print("Digite um número inteiro: ");
                int ncd = Math.abs(scanner.nextInt());
                int contador = (ncd == 0) ? 1 : 0;
                while (ncd > 0) {
                    ncd /= 10;
                    contador++;
                }
                System.out.println("O número possui " + contador + " dígito(s).");
                break;
            // ----------------------------------------------------------------------------------------------------
            case 4: // Números Primos
                System.out.print("Digite um número inteiro: ");
                int nupri = scanner.nextInt();
                boolean ehPrimo = nupri > 1;
                for (int i = 2; i <= Math.sqrt(nupri); i++) {
                    if (nupri % i == 0) {
                        ehPrimo = false;
                        break;
                    }
                }
                System.out.println("O número " + nupri + " é primo? " + ehPrimo);
                break;
            // ----------------------------------------------------------------------------------------------------
            case 5: // Inversão de Número
                System.out.print("Digite um número inteiro: ");
                int nin = scanner.nextInt();
                int numeroInvertido = 0;
                while (nin != 0) {
                    numeroInvertido = numeroInvertido * 10 + nin % 10;
                    nin /= 10;
                }
                System.out.println("Número invertido: " + numeroInvertido);
                break;
            // ----------------------------------------------------------------------------------------------------
            case 6: // Potência
                System.out.print("Digite a base: ");
                double base = scanner.nextDouble();
                System.out.print("Digite o expoente: ");
                double expoente = scanner.nextDouble();
                System.out.println("Resultado: " + Math.pow(base, expoente));
                break;
            // ----------------------------------------------------------------------------------------------------
            case 7: // Palíndromo
                System.out.print("Digite um número inteiro: ");
                int npali = scanner.nextInt();
                int original = npali, reverso = 0;
                while (npali != 0) {
                    reverso = reverso * 10 + npali % 10;
                    npali /= 10;
                }
                System.out.println("O número " + original + " é um palíndromo? " + (original == reverso));
                break;
            // ----------------------------------------------------------------------------------------------------
            case 8: // Múltiplos de um Número
                System.out.print("Digite o número base (n): ");
                int n = scanner.nextInt();
                System.out.print("Digite o limite (m): ");
                int m = scanner.nextInt();
                System.out.print("Múltiplos de " + n + " até " + m + ": ");
                for (int i = n; i <= m; i += n) {
                    System.out.print(i + (i + n <= m ? ", " : ""));
                }
                System.out.println();
                break;
            // ----------------------------------------------------------------------------------------------------
            case 9: // Conversão de Binário para Decimal
                scanner.nextLine(); // Limpa o buffer
                System.out.print("Digite um número binário: ");
                String binario = scanner.nextLine();
                int decimal = Integer.parseInt(binario, 2);
                System.out.println("O número binário " + binario + " em decimal é: " + decimal);
                break;
            // ----------------------------------------------------------------------------------------------------
            case 10: // Série de Fibonacci
                System.out.print("Digite o número de termos da série de Fibonacci: ");
                int fib = scanner.nextInt();
                int a = 0, b = 1;
                System.out.print("Série de Fibonacci: ");
                for (int i = 0; i < fib; i++) {
                    System.out.print(a + (i < fib - 1 ? ", " : ""));
                    int temp = a + b;
                    a = b;
                    b = temp;
                }
                System.out.println();
                break;
            // ----------------------------------------------------------------------------------------------------
            //caso não seja de 1 á 10 vai dar como opção inválida
            default:
                System.out.println("Opção inválida.");
        }
        // ----------------------------------------------------------------------------------------------------
        scanner.close();
    }
}