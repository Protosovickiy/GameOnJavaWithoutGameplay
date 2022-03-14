package menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ButtMenue extends JButton {

    private double x;
    private double y;
    private double w;
    private double h;

    public Color color1;

    public String f;

    public String selectedBtnImage = "";

    public String nonSelectedBtnImage;

    public ButtMenue(double x, double y, double w, double h, Color color1, String f, String selectedBtnImage, String nonSelectedBtnImage) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.color1 = color1;
        this.f = f;
        this.selectedBtnImage = selectedBtnImage;
        this.nonSelectedBtnImage = nonSelectedBtnImage;

        this.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                /////////////
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                ///////////////
                ButtMenue.this.updateUI();


            }
        });


    }

    @Override
    public void paintComponents(Graphics g) {
        g.drawImage(new ImageIcon().getImage(), (int)x, (int)y, null);
        g.setColor(color1);
        Font font = new Font("Arial", Font.ITALIC, 60);
        g.setFont(font);

        long length = (int) g.getFontMetrics().getStringBounds(f, g).getWidth();
        g.drawString(f, (int)(x + w / 2) - (int)(length / 2), (int)y + (int)(h / 3) * 2);
    }

    @Override
    public void updateUI() {
        super.updateUI();
    }
}
