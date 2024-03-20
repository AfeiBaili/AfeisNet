package frame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class AFrame extends JFrame {
    public AFrame(int width, int height, String title) {
        int w = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 2 - width / 2;
        int h = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 2 - height / 2;
        this.setLocation(w, h);
        this.setSize(width, height);
        this.setTitle(title);
        this.setLayout(null);
        try {
            this.setIconImage(ImageIO.read(new File("resource\\FLIcon_Z.png")));
        } catch (IOException e) {
            throw new RuntimeException("找不到Frame图标");
        }
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
