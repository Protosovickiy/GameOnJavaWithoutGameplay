package menu;

import javax.swing.*;
import java.awt.*;

public class Background {

    Image img = new ImageIcon("images/back1.jpg").getImage();

    public void draw(Graphics2D g) {//рисовка в гр2

        Color backColor = new Color(39, 250, 45);
        g.setColor(backColor);

        if (Panel.state.equals(Panel.STATES.MENUE)) g.fillRect((int)0, (int)0, Panel.WIDTH, Panel.HEIGHT);
        if (Panel.state.equals(Panel.STATES.PLAY)) g.drawImage(img, (int)0, (int)0, null);
    }
}
