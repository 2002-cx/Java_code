package Game_Two;

import javax.swing.*;
import java.awt.*;

public class Bullet {
    //飞机发射的炮弹
    //面板上的坐标
    int x,y;
    int width=50,height=50;
    //定义飞机子弹默认速度
    int speed=10;
    Image image = new ImageIcon("D://Love//bullet.png").getImage();

    public Bullet(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Bullet(int x, int y, int width, int height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }
}
