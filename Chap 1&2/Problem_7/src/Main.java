import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int x = Integer.parseInt( JOptionPane.showInputDialog("Enter x: "));
        int y = Integer.parseInt( JOptionPane.showInputDialog("Enter y: "));
        int z = Integer.parseInt( JOptionPane.showInputDialog("Enter z: "));

        double first = (Math.pow(x,y) + Math.pow(y,x))/Math.abs(z);
        double second = Math.exp(y)-Math.log(x*z);
        double third = Math.max(x,y)%Math.min(y,z);

        double roundedFirst = Math.round(first);
        double flooredSecond = Math.floor(second);
        double ceiledThird= Math.ceil(third);

        JOptionPane.showMessageDialog(null,"rounded first = "+ roundedFirst);
        JOptionPane.showMessageDialog(null,"floored second = "+ flooredSecond);
        JOptionPane.showMessageDialog(null,"ceiled third = "+ ceiledThird);

    }
}