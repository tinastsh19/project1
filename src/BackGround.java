import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackGround extends JComponent  {


    public void paint(Graphics g) {

        g.drawRect(40, 40, 400, 400);
        g.fillRect(40, 40, 400, 400);

        for (int i = 40; i <= 400; i += 40) {
            for (int j = 40; j <= 400; j += 40) {
                g.setColor(Color.green);
                g.drawRect(i, j, 20, 20);
                g.fillRect(i, j, 20, 20);
            }
        }

        for (int i = 60; i <= 420; i += 40) {
            for (int j = 60; j <= 420; j += 40) {
                g.drawRect(i, j, 20, 20);
                g.fillRect(i, j, 20, 20);
            }
        }

//        g.setColor(Color.red);
//        g.drawRect(40, 40, 20, 20);
//        g.fillRect(40, 40, 20, 20);
    }
}