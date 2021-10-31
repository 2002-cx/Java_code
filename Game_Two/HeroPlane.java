package Game_Two;

import javax.swing.*;
import java.awt.*;

public class HeroPlane extends Thread{
    public HeroPlane() {
    }

    //通过线程不断循环判断键盘按下的键
    @Override
    public void run() {
        while (true){
            if(up){
                y-=speed;
            }

            else if(down)
            {
                y+=speed;
            }
            else if(left)
            {
                x-=speed;
            }
            else if(right)
            {
                x+=speed;
            }
            try {
                this.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public HeroPlane(int x, int y, int width, int heigh) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.heigh = heigh;
    }

    //飞机
    int x=200,y=500;//飞机坐标
    int width=50,heigh=50;//飞机宽、高
    int speed=10;//飞机默认移动速度

    //获得飞机图片
    Image image = new ImageIcon("D:\\Love\\c.png").getImage();

    //通过键盘按下的方向键来改变飞机在画板上的位置

    //定义键盘方向键、控制飞机移动
    boolean up,down,left,right;


}
