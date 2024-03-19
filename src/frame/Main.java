package frame;

import event.ClosedKey;
import event.ComponentSizeEvent;
import logger.Logger;

import javax.swing.*;
import java.awt.*;

import static frame.Friends.addFiend;
import static frame.MenuBar.menu;
import static frame.StaticFrameVariable.*;

public class Main {
    static {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException e) {
            Logger.outErr("更换系统外观错误");
        }

        screenWidth = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        screenHeight = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        frameWidth = (int) (screenWidth / 1.5);
        frameHeight = (int) (screenHeight / 1.4);

        leftScrollPanel.setSize(frameWidth / 4, frameHeight - 60);
        rightPanel.setBounds(leftScrollPanel.getWidth(), 0, frameWidth, frameHeight - 60);
        rightPanel.setBackground(new Color(191, 193, 194));
        leftScrollPanel.setLayout(null);
        leftPanelList.setLayout(null);
        leftScrollPanel.setViewportView(leftPanelList);

    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            frame = new AFrame(frameWidth, frameHeight, "FLAnYing-Net");

            frame.addKeyListener(new ClosedKey());

            frame.addComponentListener(new ComponentSizeEvent());

            frame.add(rightPanel);

            frame.add(leftScrollPanel);

            frame.setJMenuBar(menuBar);

            for (int i = 0; i < 10; i++) {
                addFiend();
            }

            menu();

            frame.setVisible(true);
        });
    }
}
