package menu;

import java.awt.event.*;

public class Listeners implements MouseListener, KeyListener, MouseMotionListener {

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();//код нажатой клавиши
        //проверка клавы
        if (key == KeyEvent.VK_W) {
            Player.up = true;
        }
        if (key == KeyEvent.VK_S) {
            Player.down = true;
        }
        if (key == KeyEvent.VK_A) {
            Player.left = true;
        }
        if (key == KeyEvent.VK_D) {
            Player.right = true;
        }
        if (key == KeyEvent.VK_ESCAPE) {
            if (Panel.state == Panel.STATES.PLAY)Panel.state = Panel.STATES.MENUE;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        //отпускаем клавишу
        if (key == KeyEvent.VK_W) {
            Player.up = false;
        }
        if (key == KeyEvent.VK_S) {
            Player.down = false;
        }
        if (key == KeyEvent.VK_A) {
            Player.left = false;
        }
        if (key == KeyEvent.VK_D) {
            Player.right = false;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {

            if (Panel.state == Panel.STATES.MENUE){
                Menue.click = true;
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {

            if (Panel.state == Panel.STATES.MENUE) {
                Menue.click = false;
            }
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

        Panel.mouseX = e.getX();
        Panel.mouseY = e.getY();
    }
}
