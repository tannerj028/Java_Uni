import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JTextField mField = new JTextField(5);
        JTextField nField = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("m:"));
        myPanel.add(mField);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("n:"));
        myPanel.add(nField);

        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Please Enter m and n Values", JOptionPane.OK_CANCEL_OPTION);

        Pythagoras pythagoras = new Pythagoras(Double.parseDouble(mField.getText()), Double.parseDouble(nField.getText()));

        JPanel resPanel = new JPanel();
        resPanel.add(new JLabel("side1:" + pythagoras.getSide1()));
        resPanel.add(new JLabel("side2:" + pythagoras.getSide2()));
        resPanel.add(new JLabel("Hypotenuse:" + pythagoras.getHypotenuse()));
        JOptionPane.showMessageDialog(null, resPanel);

    }
}