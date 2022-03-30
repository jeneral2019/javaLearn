package tankgame.event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BallMove extends JFrame{

    MyPanel mp = null;
    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }

    public BallMove(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }


}

class MyPanel extends JPanel implements KeyListener{

    int x = 10;
    int y = 10;

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.fillOval(x,y,20,20);
    }

    //监听 字符输出
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //监听某个键按下
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W){
            y--;
        }else if (e.getKeyCode() == KeyEvent.VK_S){
            y++;
        }else if(e.getKeyCode() == KeyEvent.VK_A){
            x--;
        }else if(e.getKeyCode() == KeyEvent.VK_D){
            x++;
        }

        this.repaint();
    }

    //监听某个键释放
    @Override
    public void keyReleased(KeyEvent e) {

    }
}