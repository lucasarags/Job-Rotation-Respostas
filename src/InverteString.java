//5) Escreva um programa que inverta os caracteres de um string.
//
//IMPORTANTE:
//a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
//b) Evite usar funções prontas, como, por exemplo, reverse;

import java.util.Scanner;

public class InverteString {

    public static void main(String[] args) {

        // Lendo a string a ser invertida
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String original = scanner.nextLine();
        scanner.close();

        // Convertendo a string para um array de caracteres
        char[] array = original.toCharArray();

        // Invertendo os caracteres
        for (int i = 0; i < array.length / 2; i++) {
            char temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        // Convertendo o array de caracteres de volta para uma string
        String invertida = new String(array);

        // Imprimindo o resultado
        System.out.println("String invertida: " + invertida);

    }

}
