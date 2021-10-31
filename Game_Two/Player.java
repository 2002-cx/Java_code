package Game_Two;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Player extends KeyAdapter {
    GameFrame gameFrame;
    //HeroPlane heroPlane;

    //通过构造器把heroPlay传过来
    public Player(GameFrame gameFrame) {
        this.gameFrame=gameFrame;
    }

    //重写按键方法
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode=e.getKeyCode();
        //上下左右对应keyCode:38、40、37、39
        switch (keyCode){
            case 38:
                //左被按下了left=true
                gameFrame.heroPlane.up=true;
                break;
            case 40:
                //同理
                gameFrame.heroPlane.down=true;
                break;
            case 37:
                gameFrame.heroPlane.left=true;
                break;
            case 39:
                gameFrame.heroPlane.right=true;
                break;
            case 66:
                //装弹
                addBullut();
                break;
        }
    }
    //装弹方法
    public void addBullut(){
        gameFrame.bullets.add(new Bullet(gameFrame.heroPlane.x+5,gameFrame.heroPlane.y-20));
    }

    //重写松开键方法
    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        //上下左右对应keyCode:38、40、37、39
        switch (keyCode) {
            case 38:
                //左被按下了left=true
                gameFrame.heroPlane.up = false;
                break;
            case 40:
                //同理
                gameFrame.heroPlane.down = false;
                break;
            case 37:
                gameFrame.heroPlane.left = false;
                break;
            case 39:
                gameFrame.heroPlane.right = false;
                break;
        }
    }
}
