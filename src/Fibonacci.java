// 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
//
//IMPORTANTE:
//Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Pedimos ao usuário para fornecer um número
        System.out.println("Digite um número inteiro:");
        int numero = sc.nextInt();

        // Variáveis para armazenar os valores de Fibonacci
        int anterior = 0;
        int atual = 1;
        int proximo = 1;

        // Enquanto o próximo valor de Fibonacci for menor ou igual ao número fornecido
        while (proximo <= numero) {
            // Se o próximo valor for igual ao número fornecido, o número pertence à sequência
            if (proximo == numero) {
                System.out.println(numero + " pertence à sequência de Fibonacci!");
                return;
            }
            // Caso contrário, atualizamos os valores de Fibonacci
            anterior = atual;
            atual = proximo;
            proximo = anterior + atual;
        }
        // Se chegarmos aqui, o número não pertence à sequência
        System.out.println(numero + " não pertence à sequência de Fibonacci!");
    }

}
