import java.util.HashMap;
import java.util.Map;

public class FaturamentoPorEstado {

    public static void main(String[] args) {
        Map<String, Double> faturamentoPorEstado = new HashMap<>();
        faturamentoPorEstado.put("SP", 67836.43);
        faturamentoPorEstado.put("RJ", 36678.66);
        faturamentoPorEstado.put("MG", 29229.88);
        faturamentoPorEstado.put("ES", 27165.48);
        faturamentoPorEstado.put("Outros", 19849.53);

        double faturamentoTotal = faturamentoPorEstado.values().stream().mapToDouble(Double::doubleValue).sum();

        for (Map.Entry<String, Double> entry : faturamentoPorEstado.entrySet()) {
            double percentual = (entry.getValue() / faturamentoTotal) * 100;
            System.out.printf("Estado: %s - Percentual: %.2f%%\n", entry.getKey(), percentual);
        }
    }
}

