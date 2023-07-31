package nn.ru;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class Scena extends JPanel implements ActionListener, MouseListener, KeyListener {
    float SHIFT = 30;

    float Y;
    float X;
    float deltaX;
    float deltaY;

    float A;

    List<Tank> tankList = new ArrayList<>();

    public Scena() {
        super();
        this.setFocusable(true);
        this.requestFocusInWindow();

        addMouseListener(this);
        addKeyListener(this);

        grabFocus();

    }

    @Override
    public void paintComponent(Graphics g) {
        // отрисовка всех объектов
        drawObject((Graphics2D) g);

        repaint();
    }

    private void drawObject(Graphics2D g) {
        Graphics2D g2d = g;

        g2d.setColor(Constants.backgroundColor.brighter().brighter());
        g2d.fillArc(
                100,
                200,
                300,
                200,
                (int) 0,
                (int) 360);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

