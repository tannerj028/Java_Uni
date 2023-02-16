import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int priceOfFuelPerLiter = Integer.parseInt(JOptionPane.showInputDialog("enter price of fuel per liter: "));
        int usageOfFuelInLitersPerKM = Integer.parseInt(JOptionPane.showInputDialog("enter the usage of fuel in liters per km: "));
        int distance = Integer.parseInt(JOptionPane.showInputDialog("enter the distance in KM:"));

        var totalCost = distance*usageOfFuelInLitersPerKM*priceOfFuelPerLiter;
        JOptionPane.showMessageDialog(null,"total cost is: "+ totalCost);

    }
}