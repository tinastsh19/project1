import javax.swing.*;
import java.awt.*;

/**
 * Created by tina.salehi on 1/27/2017 AD.
 */
public class Main

{
    public static void main (String args[]) {
        JFrame frame = new JFrame("Bomb Squad");
        frame.setSize(800,800);
        frame.getContentPane().add(new Game());
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.white);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }

}
