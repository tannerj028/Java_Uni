import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int yardWidth = Integer.parseInt(JOptionPane.showInputDialog("Enter width of the yard :"));
        int yardHeight = Integer.parseInt(JOptionPane.showInputDialog("Enter height of the yard :"));
        int houseWidth = Integer.parseInt(JOptionPane.showInputDialog("Enter width of the yard :"));
        int houseHeight = Integer.parseInt(JOptionPane.showInputDialog("Enter height of the yard :"));

int houseArea = houseHeight*houseWidth;
int yardArea = yardHeight*yardWidth;

if(houseArea > yardArea)
{
    JOptionPane.showMessageDialog(null,"Inputs are not in correct format");
}
else{
    int totalArea = yardArea-houseArea;
    double totalTimeInSecond = totalArea * 2.3;
    double totalTimeInMinutes = totalTimeInSecond/60;
    JOptionPane.showMessageDialog(null,"Total times in minutes would be :" + Double.toString(totalTimeInMinutes));
}

             }
}