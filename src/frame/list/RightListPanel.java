package frame.list;

import javax.swing.*;
import java.awt.*;

import static frame.StaticFrameVariable.rightPanel;

public class RightListPanel extends JPanel {
    JPanel topPanel;
    JPanel bottomPanel;

    public RightListPanel() {
        this.topPanel = new JPanel();
        this.bottomPanel = new JPanel();
        this.setLayout(new BorderLayout());
        topPanel.setPreferredSize(new Dimension(rightPanel.getWidth(), (int) (rightPanel.getHeight() * 0.70)));
        bottomPanel.setPreferredSize(new Dimension(rightPanel.getWidth(), (int) (rightPanel.getHeight() * 0.3)));
        topPanel.setBackground(new Color(60, 63, 65));
        bottomPanel.setBackground(new Color(43, 43, 43));
        add(topPanel, BorderLayout.NORTH);
        add(bottomPanel, BorderLayout.SOUTH);
    }
}
