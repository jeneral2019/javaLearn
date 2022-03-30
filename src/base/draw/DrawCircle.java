package base.draw;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class DrawCircle extends JFrame{

    private MyPaner mp = null;

    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle(){
        //初始化面板
        mp = new MyPaner();
        //把面板放入到画框
        this.add(mp);

        this.setSize(400,300);
        //当点击窗口的关闭按钮，程序就会退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);//可以显示

    }
}

//1. 先定义一个MyPanel,继承JPaner类，画图形，就在面板上话

class MyPaner extends JPanel{
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        /*
        * fill 填充 draw 画边
        * */

//        //设置画笔颜色
//        g.setColor(Color.BLUE);
//
//        //椭圆
//        g.drawOval(10,10,100,100);
//
//        //直线
//        g.drawLine(10,10,100,100);
//
//        //矩形边框
//        g.drawRect(10,10,100,100);
//
//        g.fillRect(20,20,10,10);
//
//        //获取图片资源
//        Image image = Toolkit.getDefaultToolkit().getImage("/Users/yuxiangfeng/Pictures/画板 1.png");
//        g.drawImage(image,10,10,100,100,this);

    }
}

class Tanke{

}