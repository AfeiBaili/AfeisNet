package frame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        AFrame aFrame = new AFrame(800, 500, "Test");

        JPanel panel = new JPanel();
        JPanel jPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                try {
                    g.drawImage(ImageIO.read(new File("resource/FLIcon_A.png")), 0, 0, 64, 64, this);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        jPanel.setLayout(null);
        panel.setLayout(null);

        jPanel.setBounds(0, 0, 800, 500);
        panel.add(jPanel);
        panel.setBounds(0,0,800,500);
        aFrame.add(panel);
        aFrame.setVisible(true);
    }
}
