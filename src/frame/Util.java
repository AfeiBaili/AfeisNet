package frame;

import javax.swing.*;
import java.awt.*;

import static frame.StaticFrameVariable.*;

public class Util {
    public static void setFont() {
        fontSetList.forEach(jComponent -> jComponent.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13)));
    }

    public static void leftPaneListShow() {
        itemY = 0;
        leftPanelItemList.forEach(listPanel -> {
            JPanel list = listPanel.list();
            list.setBounds(itemX, itemY, leftScrollPanel.getWidth(), 70);
            itemY += 72;
            leftPanelList.add(list);
            leftPanelList.setPreferredSize(new Dimension(leftScrollPanel.getWidth() - 30, itemY));
            leftScrollPanel.setViewportView(leftPanelList);
        });
    }
}
