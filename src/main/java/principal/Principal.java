package principal;
import model.Veiculo;
import javax.swing.JOptionPane;
public class Principal {

    public static void main(String[] args) {

        Veiculo v = new Veiculo();

        // Entrada
        v.setKm(Double.parseDouble(
                JOptionPane.showInputDialog("Digite os km percorridos:")));

        v.setLitro(Double.parseDouble(
                JOptionPane.showInputDialog("Digite os litros gastos:")));

        // Processamento
        double resultado = v.consumo();

        // Saída
        JOptionPane.showMessageDialog(null,
                "Consumo: " + resultado + " km/l");
    }
}
