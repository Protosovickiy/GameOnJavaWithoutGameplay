package menu;

import javax.swing.*;
import java.awt.*;

public class Player {

    private double x;
    private double y;
    private double h;
    private double w;

    private int speed;

    public static boolean up;
    public static boolean down;
    public static boolean right;
    public static boolean left;

    Image img = new ImageIcon("images/player.jpg").getImage();

    public Player() {

        x = 400;
        y = 500;

        w = 145;
        h = 225;

        speed = 5;

        up = false;
        down = false;
        right= false;
        left = false;
    }

    public double getX() {return x; }
    public double getY() {return y; }
    public double getH() {return h; }
    public double getW() {return w; }

    public void update() {

        if (up && y > 20) {
            y -= speed;
        }
        if (down && y < Panel.HEIGHT - h) {
            y += speed;
        }
        if (left && x > 0) {
            x -= speed;
        }
        if (right && x < Panel.WIDTH - w) {
            x += speed;
        }
    }

    public void draw(Graphics2D g) {

        g.drawImage(img, (int)x, (int)y, null);//картинка
    }
}
