import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by tina.salehi on 1/26/2017 AD.
 */
public class Game extends BackGround implements ActionListener{

    int width = 100;
    int hieght = 100;
    int x = 300;
    int x2 = 500;
    int y = 200;
    int y2 = 300;

    Timer timer;
    Timer timer2;

    Game(){


        timer = new Timer(40 , this) ;
        timer.start();
    }
    Game(int x){
        timer2 = new Timer(x,this);
        timer2.start();


    }

    public void paint(Graphics g){

        g.drawRect(x,y,width,hieght);
        g.setColor(Color.red);
        g.fillRect(x,y,width,hieght);
        g.drawOval(x2 + 100 ,y2 ,70 , 70 );
        g.fillOval(x2 + 100 ,y2 ,70 , 70 );


    }



    @Override
    public void actionPerformed(ActionEvent e) {

        if(x>100){
            x+=5;
            x2+=7;
        }
        if(x>500){
            y-=5;
            y2*=0.5;
        }
        repaint();
    }
    public static void main(String args[]){

        JFrame frame = new JFrame("test");
        frame.setPreferredSize(new Dimension(800,800));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(new Game());
        frame.pack();
        frame.setVisible(true);
    }
}
