import javax.swing.*;

public class Main {
    public static void main(String[] args)
    {
     int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter number1"));
     int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter number2"));
        JOptionPane.showMessageDialog(null,"sum:"+Integer.toString(num1+num2));
        JOptionPane.showMessageDialog(null,"num1 - num2 : "+Integer.toString(num1-num2));
        JOptionPane.showMessageDialog(null,"multiplied: "+Integer.toString(num1*num2));
        JOptionPane.showMessageDialog(null,"num1 over num2: "+Integer.toString(num1/num2));
        JOptionPane.showMessageDialog(null,"num1 over num2 remainder: "+Integer.toString(num1%num2));

    }
}