//3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
//• O menor valor de faturamento ocorrido em um dia do mês;
//• O maior valor de faturamento ocorrido em um dia do mês;
//• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.
//
//IMPORTANTE:
//a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
//b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média;

// arquivo utilizado foi o json, com biblioteca GSON

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;

public class FaturamentoMensal {

    public static void main(String[] args) {

        // Lendo os dados de faturamento diário a partir do arquivo JSON
        Gson gson = new Gson();
        double[] faturamentoDiario;
        try {
            faturamentoDiario = gson.fromJson(new FileReader(".idea/data/faturamento.json"), double[].class);
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo JSON: " + e.getMessage());
            return;
        }

        // Calculando o menor e o maior valor de faturamento diário
        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        for (double valor : faturamentoDiario) {
            if (valor > 0 && valor < menorFaturamento) {
                menorFaturamento = valor;
            }
            if (valor > maiorFaturamento) {
                maiorFaturamento = valor;
            }
        }
        System.out.println("Menor faturamento diário: " + menorFaturamento);
        System.out.println("Maior faturamento diário: " + maiorFaturamento);

        // Calculando a média mensal de faturamento diário
        double somaFaturamento = 0.0;
        int diasNoMes = 0;
        for (double valor : faturamentoDiario) {
            if (valor > 0) {
                somaFaturamento += valor;
                diasNoMes++;
            }
        }
        double mediaMensal = somaFaturamento / diasNoMes;

        // Contando o número de dias em que o valor de faturamento diário foi superior à média mensal
        int diasAcimaDaMedia = 0;
        for (double valor : faturamentoDiario) {
            if (valor > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }
        System.out.println("Número de dias com faturamento acima da média mensal: " + diasAcimaDaMedia);

    }

}
