package frame;

import javax.swing.*;
import java.awt.*;

import static frame.StaticFrameVariable.*;

public class Friends {
    public static void addFiend() {
        JPanel list = new JPanel();
        JPanel panel = new JPanel();
        list.setBounds(itemX, itemY, leftPanelList.getWidth(), 70);
        itemY += 72;

        list.setPreferredSize(new Dimension(leftPanelList.getWidth(), 70));
        list.setBackground(Color.blue);
        leftPanelItemList.add(new ListPanel(list, panel));

        leftPanelList.add(list);
        leftPanelList.setPreferredSize(new Dimension(leftScrollPanel.getWidth() - 30, itemY));

        leftScrollPanel.setViewportView(leftPanelList);

        frame.revalidate();
        frame.repaint();
    }

    public static void removeFiend() {
    }
}
