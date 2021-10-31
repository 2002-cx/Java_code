package Game_Two;

import javax.swing.*;
import java.awt.*;

public class EnemyPlane extends Thread{
    //敌机
public EnemyPlane(){}
    public GameFrame gf;
    //子弹的坐标，大小，速度
    public int x,y;
    public int width,height;
    public int speed=2;
    public Image image  = new ImageIcon("D://Love//敌机.png").getImage();

    public EnemyPlane(int x,int y,int width,int height,GameFrame gf){
        super();
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        this.gf=gf;
    }

    public void run(){
        while(true){
            //向左走
                //碰撞到了
            if(hit())
            {
                System.out.println("hit...");
                this.speed=0;
                this.image=new ImageIcon("d:\\Love\\boom.jpg").getImage();
                try {
                    this.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //我方飞机击毁敌方飞机
                gf.enemys.remove(this);
              break;
            }
            if (this.y>=664)
            {
                break;
            }
            try {
                this.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(collision())
            {
                System.out.println("you are died!");
                System.exit(0);
            }
        }
    }
    HeroPlane hp = new HeroPlane();
    public boolean collision(){
        if (x==hp.x&&y==hp.y)
            //两个飞机撞到了就返回true
            return true;
        else
            return false;
    }
    @Override
    public String toString() {
        return "EnemyPlane{" +
                "gf=" + gf +
                ", x=" + x +
                ", y=" + y +
                ", width=" + width +
                ", height=" + height +
                ", speed=" + speed +
                ", image=" + image +
                '}';
    }

    //检测碰撞
    public boolean hit(){
        Rectangle myrect = new Rectangle(this.x,this.y,this.width,this.height);
        Rectangle rect = null;
        for (int i = 0; i <gf.bullets.size() ; i++) {
            Bullet bullet = gf.bullets.get(i);
            System.out.println("test hit");
            rect = new Rectangle(bullet.x,bullet.y-1,bullet.width,bullet.height);
            //碰撞检测
            if (myrect.intersects(rect)){
                return true;
            }

        }
        return  false;
    }
}
