package frame;

import logger.Logger;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

import static frame.StaticFrameVariable.rightPanel;

public class RightMainPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(new Color(43, 43, 43));
        g.fillRect(0, 0, rightPanel.getWidth(), rightPanel.getHeight());
        try {
            g.drawImage(ImageIO.read(new File("resource\\FLIcon_B.png")), rightPanel.getWidth() / 2 - 560,
                    rightPanel.getHeight() / 2 - 300, 500, 500, this);
        } catch (IOException e) {
            Logger.outErr("找不到FLIcon_B.png文件");
        }
        g.setColor(new Color(152, 155, 159));
        g.setFont(new Font("Microsoft YaHei", Font.BOLD, 70));
        g.drawString("点击列表展开", rightPanel.getWidth() / 2 - 500, rightPanel.getHeight() - 150);
    }
}
