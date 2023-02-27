//4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
//
//SP – R$67.836,43
//RJ – R$36.678,66
//MG – R$29.229,88
//ES – R$27.165,48
//Outros – R$19.849,53
//
//Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.

public class Distribuidora {

    public static void main(String[] args) {

        // Definindo o faturamento mensal por estado
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        // Calculando o valor total mensal
        double total = sp + rj + mg + es + outros;

        // Calculando o percentual de representação de cada estado
        double percSp = (sp / total) * 100;
        double percRj = (rj / total) * 100;
        double percMg = (mg / total) * 100;
        double percEs = (es / total) * 100;
        double percOutros = (outros / total) * 100;

        // Imprimindo os resultados
        System.out.println("Percentual de representação de cada estado:");
        System.out.println("SP: " + percSp + "%");
        System.out.println("RJ: " + percRj + "%");
        System.out.println("MG: " + percMg + "%");
        System.out.println("ES: " + percEs + "%");
        System.out.println("Outros: " + percOutros + "%");

    }

}
