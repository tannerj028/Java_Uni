import javax.swing.*;

public class Main {
    public static void main(String[] args) {
    double firstNumerator = Double.parseDouble(JOptionPane.showInputDialog("first numerator: "));
        double firstDenominator = Double.parseDouble(JOptionPane.showInputDialog("first denominator: "));
        double secondNumerator = Double.parseDouble(JOptionPane.showInputDialog("second numerator: "));
        double secondDenominator = Double.parseDouble(JOptionPane.showInputDialog("second denominator: "));

    double result = (firstNumerator * secondNumerator) / (firstDenominator*secondDenominator);
    JOptionPane.showMessageDialog(null,"Result is: "+ result);

    }
}