

import ash.college.graphics.Ball;
import ash.college.graphics.BallWrapper;
import java.awt.Graphics;
/*import ash.college.graphics.BallWrapper;

import javax.swing.*;

import static ash.college.utils.Constants.WINDOW_HEIGHT;
import static ash.college.utils.Constants.WINDOW_WIDTH;

public class Window extends JFrame  {
    public static void main(String[] args) {
        new Window();
    }

    public Window() {
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setResizable(false);
        this.add(new BallWrapper());
        this.setVisible(true);
    }
}*/
/*import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static ash.college.utils.Constants.WINDOW_HEIGHT;
import static ash.college.utils.Constants.WINDOW_WIDTH;

public class Window extends JFrame
{

    public BallWrapper ballWrapper = new BallWrapper();

    public static void main(String[] args) {
        new Window();
    }

    public Window ()
    {
       this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setResizable(false);
        this.add(ballWrapper);
        this.setVisible(true);



        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP:
//                        Graphics g ;
//                        Ball ball = ballWrapper.returnBall() ;
 //                       ball.move();
                        ballWrapper.repaint();
                        //ballWrapper.paintComponents();
                        System.out.println("h");
                        break;
                    case KeyEvent.VK_DOWN:
                        System.out.println("t");
                        break;
                    case KeyEvent.VK_LEFT:
                        System.out.println("v");
                        break;
                    case KeyEvent.VK_RIGHT:
                        System.out.println("w");
                        break;
                }
            }

        });

        this.setFocusable(true);
    }
} */

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static ash.college.utils.Constants.WINDOW_HEIGHT;
import static ash.college.utils.Constants.WINDOW_WIDTH;

public class Window extends JFrame {

//    private BallPanel ballPanel = new BallPanel();
    private BallWrapper ballWrapper = new BallWrapper();

    public static void main(String[] args) {
        new Window();
    }

    public Window() {
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setResizable(false);
        this.add(ballWrapper);
        this.setVisible(true);
        this.setFocusable(true);
    }
}
