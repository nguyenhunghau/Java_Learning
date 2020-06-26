package SnakeGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author PC
 */
public class ManHinhGame extends JPanel  implements KeyListener{

    Snake snake = new Snake();
    Prey prey = new Prey();
    boolean drawPrey = true;

    public ManHinhGame() {
        Timer timer = new Timer(200, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                snake.moveXuong(700);
                repaint();
            }
        });
        timer.start();
            
    }

    @Override
    public void paintComponent(Graphics g2d) {
        super.paintComponent(g2d);
        try {
            g2d.setColor(Color.GREEN);
            snake.veHinh(g2d);
            prey.veHinh(g2d, drawPrey);
            drawPrey = false;
        } catch (Exception ex) {
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println(e.getKeyCode());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println(e.getKeyCode());
    }
    
    //https://docstore.mik.ua/orelly/webprog/DHTML_javascript/0596004672_jvdhtmlckbk-app-b.html
}
