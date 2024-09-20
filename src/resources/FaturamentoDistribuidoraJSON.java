package resources;

import org.json.JSONArray;
import org.json.JSONObject;

public class FaturamentoDistribuidoraJSON {
    public static void main(String[] args) {
        String jsonData = "[{\"dia\":1,\"faturamento\":1000},{\"dia\":2,\"faturamento\":2000},{\"dia\":3,\"faturamento\":0},{\"dia\":4,\"faturamento\":1500}]";
        JSONArray faturamentos = new JSONArray(jsonData);

        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
        double soma = 0;
        int diasComFaturamento = 0;

        for (int i = 0; i < faturamentos.length(); i++) {
            JSONObject dia = faturamentos.getJSONObject(i);
            double valor = dia.getDouble("faturamento");
            if (valor > 0) {
                diasComFaturamento++;
                soma += valor;
                if (valor < menor) menor = valor;
                if (valor > maior) maior = valor;
            }
        }

        double media = soma / diasComFaturamento;
        int diasAcimaDaMedia = 0;

        for (int i = 0; i < faturamentos.length(); i++) {
            JSONObject dia = faturamentos.getJSONObject(i);
            double valor = dia.getDouble("faturamento");
            if (valor > media) diasAcimaDaMedia++;
        }

        System.out.println("Menor faturamento: " + menor);
        System.out.println("Maior faturamento: " + maior);
        System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);
    }
}
