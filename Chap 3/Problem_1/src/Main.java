import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt( JOptionPane.showInputDialog("Enter your next move number:"));
        int r = new Random().nextInt(10)+1;

        JOptionPane.showMessageDialog(null,"your next move is:"+ nextMove(n,r));
    }

    private static int nextMove(int n,int r){
        return n*(r-n+1);
    }
}