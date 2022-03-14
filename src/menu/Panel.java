package menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class Panel extends JPanel implements ActionListener {

    //размер панели
    public static int WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width;
    public static int HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height;
    //координаты мыши
    public static int mouseX;
    public static int mouseY;

    public static enum STATES {MENUE, PLAY} //объявление класс перечисления
    public static STATES state = STATES.MENUE;//меняем режмим игры

    private BufferedImage image;
    private Graphics2D g;

    Timer mainTimer = new Timer(30, this);

    Background background = new Background();
    Player player = new Player();
    Menue menue = new Menue();

    public Panel() {
        super();

        setFocusable(true);//передаём фокус
        requestFocus();//активируем
        mainTimer.start();

        image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);//объект хранения картинок
        g = (Graphics2D) image.getGraphics();//присваиваем элемент из буфера

        //Обработчик событий... клик, клава, перемещение
        addMouseListener(new Listeners());
        addKeyListener(new Listeners());
        addMouseMotionListener(new Listeners());
    }

    @Override
    public void actionPerformed(ActionEvent e) {//всё в игре

        if (state.equals(STATES.MENUE)) {
            background.draw(g);
            menue.draw(g);
            //New User
            if (mouseX > menue.button1.getX() && mouseX < menue.button1.getX() + menue.button1.getW() &&
                mouseY > menue.button1.getY() && mouseY < menue.button1.getY() + menue.button1.getH()) {
                menue.button1.s = "images/button2.png";
            }
            else {
                menue.button1.s = "images/button3.png";
            }
            gameDraw();
        }
        if (state.equals(STATES.PLAY)) {
            gameRender();
            gameUpdate();
            gameDraw();
        }
    }

    public void gameRender() {
        background.draw(g);
        player.draw(g);
    }

    public void gameUpdate() {

        player.update();
    }

    private void gameDraw() {
        Graphics g2 = this.getGraphics();
        g2.drawImage(image, (int)0, (int)0, null);//риисуем
        g2.dispose();//мусор
    }
}
