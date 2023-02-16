import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String text =  JOptionPane.showInputDialog("Enter star separated text:");
        String temp =  text;
        int nextStarIndex = temp.indexOf("*");
        String firstWord = temp.substring(0, nextStarIndex);
        temp = temp.substring(nextStarIndex + 1);
        nextStarIndex = temp.indexOf("*");
        String secondWord = temp.substring(0, nextStarIndex);
        temp = temp.substring(nextStarIndex + 1);
        nextStarIndex = temp.indexOf("*");
        String thirdWord = temp.substring(0, nextStarIndex);
        temp = temp.substring(nextStarIndex + 1);

        String forthWord = temp.substring(0);
        
        String reversed = forthWord + "*" + thirdWord + "*" + secondWord + "*" + firstWord;
        JOptionPane.showMessageDialog(null,reversed+"\n"+text);

    }
}