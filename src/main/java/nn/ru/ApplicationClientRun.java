package nn.ru;

import javax.swing.*;
import java.awt.*;

public class ApplicationClientRun {
    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] gdList = ge.getScreenDevices();
        GraphicsDevice gd = gdList[0];

        Scena scena1 = new Scena();

        JFrame frame = new JFrame(gd.getDefaultConfiguration());

        frame.setTitle("Tank 3 model");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(Constants.SCENA_WIDTH + Constants.SCENA_BORDER * 2, Constants.SCENA_HEIGTH + Constants.SCENA_BORDER * 2);
        frame.setBackground(Constants.backgroundColor);
        frame.setResizable(true);

        frame.add(scena1);
        frame.setVisible(true);
        
    }
}
