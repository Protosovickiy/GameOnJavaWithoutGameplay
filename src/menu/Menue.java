package menu;

import javax.swing.*;
import java.awt.*;

public class Menue {

    public static boolean click = false;

    ButtMenue button1 = new ButtMenue(10 , 10, 396, 100, "images/button2.png", "New Game");
    ButtMenue button2 = new ButtMenue(10 , 150, 396, 100, "images/button2.png", "Play");
    ButtMenue button3 = new ButtMenue(10 , 300, 396, 100, "images/button2.png", "Settings");
    ButtMenue button4 = new ButtMenue(10 , 450, 396, 100, "images/button2.png", "Rool");
    ButtMenue button5 = new ButtMenue(10 , 600, 396, 100, "images/button2.png", "Quiet");

    public void draw(Graphics2D g) {
        button1.draw(g);
        button2.draw(g);
        button3.draw(g);
        button4.draw(g);
        button5.draw(g);
    }

    class ButtMenue {

        private double x;
        private double y;
        private double w;
        private double h;

        public Color color1;

        public String f;

        public String s;

        public ButtMenue(int x, int y, int w, int h, String s, String f) {
            this.x = x;
            this.y = y;
            this.w = w;
            this.h = h;
            this.f = f;
            this.s = s;
            color1 = Color.WHITE;
        }

        public double getX() {
            return this.x;
        }

        public double getY() {
            return this.y;
        }

        public double getW() {
            return this.w;
        }

        public double getH() {
            return this.h;
        }

        public void draw(Graphics2D g) {
            g.drawImage(new ImageIcon(s).getImage(), (int)x, (int)y, null);
            g.setColor(color1);
            Font font = new Font("Arial", Font.ITALIC, 60);
            g.setFont(font);

            long length = (int) g.getFontMetrics().getStringBounds(f, g).getWidth();
            g.drawString(f, (int)(x + w / 2) - (int)(length / 2), (int)y + (int)(h / 3) * 2);
        }

    }
}
