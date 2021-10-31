package Game_Two;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;
import java.util.Vector;

public class GameFrame extends JFrame {

    HeroPlane heroPlane;

    //实现子弹多颗发射，将多颗子弹存放在一个子弹的集合之中
    //定义子弹集合、利用多线程，子弹一出边界，则自动销毁
    Vector<Bullet> bullets = new Vector<>();
    //定义敌机集合
    Vector<EnemyPlane> enemys = new Vector<>();

    GameFrame gameFrame;
public GameFrame(){
    gameFrame=this;
    //创建英雄飞机
    heroPlane = new HeroPlane();
    //启动飞机线程
    heroPlane.start();

    this.setSize(443,664);
    this.setTitle("雷霆战机");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setVisible(true);

    //线程、实现图片一直加载

        new Thread(new Runnable() {

            @Override
            public void run() {
                while(true){
                    repaint();
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }


            }
        }).start();

        //产生敌机的线程
            new Thread(new Runnable() {
                //创建随机数对象
                Random r= new Random();
                @Override
                public void run() {
                    while(true){
                        EnemyPlane enemyPlane = new EnemyPlane(r.nextInt(443),0,50,50,gameFrame);

                        //生产敌机的时候就让敌机启动
                        enemyPlane.start();
                        //添加敌机，让x随机
                            enemys.add(enemyPlane);
                        try {
                            Thread.sleep(500);//每500毫秒产生一辆
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();



}



//在窗口上画内容，paint这个画笔的方法在窗口初始化的时候会默认执行
    public void paint(Graphics g){
    //System.out.println("绘制面板");
        //画背景
        BufferedImage image = (BufferedImage) this.createImage(this.getSize().width,this.getSize().height);
        //高校缓存画笔
        Graphics bi = image.getGraphics();
        //画背景
        bi.drawImage(new ImageIcon("D://Love//我家菜馆.png").getImage(),0,0,null);
        //画飞机
        bi.drawImage(heroPlane.image, heroPlane.x,heroPlane.y,heroPlane.width=40,heroPlane.heigh=40,null);
        //画飞机发射炮弹
        for (int i = 0; i < bullets.size(); i++) {
            Bullet bullet = bullets.get(i);
            //画子弹
            if(bullet.y>0)//只有当在边界内，才画子弹
                bi.drawImage(bullet.image, bullet.x,bullet.y-=bullet.speed,bullet.width=40,bullet.height=40,null);
            else{
                //出了边界，则子弹销毁
                bullets.remove(bullet);
            }
        }

        //画敌机
        for (int i = 0; i < enemys.size(); i++) {
            EnemyPlane ep = enemys.get(i);

            //画子弹
            if(ep.y<664)//只有当在边界内，才画子弹
                bi.drawImage(ep.image, ep.x,ep.y+=ep.speed,ep.width=40,ep.height=40,null);
            else{
                //出了边界，则子弹销毁
                enemys.remove(ep);
            }
        }





        //生效
        g.drawImage(image,0,0,null);
}

public  static void main(String[] args){

    GameFrame frame = new GameFrame();
    Player player = new Player(frame);
    frame.addKeyListener(player);
}

//public void show(){
//    for (int i = 0; i <20 ; i++) {
//        System.out.print("*");
//    }
//    System.out.println("0：退出、1：雷霆战机");
//    for (int i = 0; i <20 ; i++) {
//        System.out.print("*");
//    }
//
//}

}
