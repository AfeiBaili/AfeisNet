package frame.list;

import javax.swing.*;
import java.awt.*;

public class LeftListPanel extends JPanel {
    Image image;
    String name;

    public LeftListPanel(Image image, String name) {
        this.image = image;
        this.name = name;
        this.setLayout(null);
        JLabel avatarJLabel = new JLabel(new ImageIcon(image));
        avatarJLabel.setBounds(3, 3, 64, 64);
        this.add(avatarJLabel);
        JLabel nameJLabel = new JLabel(name, SwingConstants.LEFT);
        nameJLabel.setBounds(avatarJLabel.getWidth() + 10, -15, 200, 64);
        nameJLabel.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
        nameJLabel.setForeground(Color.white);
        this.add(nameJLabel);

    }
}
