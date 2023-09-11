package ash.college.graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;

import javax.swing.*;

/*public class BallWrapper extends BallPanel{
    private static final int MOVE_AMOUNT = 5; // Adjust the move amount as needed

    public BallWrapper() {
        super();
        this.requestFocusInWindow();
        Ball ball = this.ball;
        BallKeyListener ballKeyListener = new BallKeyListener(ball);
        int x = ball.getX();
        int y = ball.getY();
        int radius = ball.getRadius();
        // Call other methods as needed
        ball.move(2, 2);
        // Request focus for the KeyListener to work
    }
} */
// In your BallWrapper or BallPanel class:
public class BallWrapper extends BallPanel  {
    // ... other code ...

    public BallWrapper()
    {
        super();
        Ball ball1 = this.ball ;
        // Register the KeyListener
        this.requestFocusInWindow(); // Request focus
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        ball1.move(0,-10);
                        System.out.println("v");
                        break;
                    case KeyEvent.VK_DOWN:
                        System.out.println("t");
                        ball1.move(0,10);
                        break;
                    case KeyEvent.VK_LEFT:
                        System.out.println("z");
                        ball1.move(-10,0);
                        break;
                    case KeyEvent.VK_RIGHT:
                        System.out.println("j");
                        ball1.move(10,0);
                        break;
                }
                repaint();
            }
        });
    }

/*    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        int moveAmount = 100; // Adjust the move amount as needed

        if (keyCode == KeyEvent.VK_LEFT)
        {
            ball.setDelta(-moveAmount, 0); // Move left
            System.out.println("h");
        } else if (keyCode == KeyEvent.VK_RIGHT)
        {
            ball.setDelta(moveAmount, 0); // Move right
            System.out.println("t");
        } else if (keyCode == KeyEvent.VK_UP) {
            ball.setDelta(100, -moveAmount); // Move up
            System.out.println("p");
        } else if (keyCode == KeyEvent.VK_DOWN)
        {
            ball.setDelta(100, moveAmount); // Move down
            System.out.println("v");
        }

        // Repaint the panel to update the ball's position
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Implement if needed
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Implement if needed
    }*/
}