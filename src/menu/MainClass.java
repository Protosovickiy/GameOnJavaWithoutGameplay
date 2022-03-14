package menu;

import javax.swing.*;
import java.awt.*;

public class MainClass {

    public static void main(String[] args) {

        JFrame startFrame = new JFrame("Game");
        startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //закрытие проги при клике
        startFrame.setLocation(0,0);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();//получим размер экрана
        startFrame.setSize(1024, 680);
        startFrame.add(new Panel());
        startFrame.setVisible(true);//окно существует и видно
    }
}
