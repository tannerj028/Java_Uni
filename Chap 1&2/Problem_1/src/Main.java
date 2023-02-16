import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String rawSeconds = JOptionPane.showInputDialog(null, "Enter seconds", "");
        int seconds = Integer.parseInt(rawSeconds);
        int leftSeconds = seconds % 60;
        int minutes = seconds / 60;
        int leftMinutes = minutes % 60;
        int hours = minutes / 60;

        String result = hours + " hours:" + leftMinutes + " minutes:" + leftSeconds + " seconds";
        JOptionPane.showInternalMessageDialog(null, result);
    }
}