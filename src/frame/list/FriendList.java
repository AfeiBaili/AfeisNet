package frame.list;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static frame.StaticFrameVariable.leftPanelItemList;
import static frame.StaticFrameVariable.rightPanel;

public class FriendList {

    public static void addFiend(Image image, String name) {
        LeftListPanel list = new LeftListPanel(image, name);
        RightListPanel panel = new RightListPanel();

        Color color = new Color(43, 43, 43);
        list.setBackground(color);
        list.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                list.setBackground(new Color(10, 30, 58));
                rightPanel.remove(0);
                rightPanel.add(panel);
                rightPanel.revalidate();
                rightPanel.repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                list.setBackground(new Color(152, 155, 159));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                list.setBackground(new Color(152, 155, 159));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                list.setBackground(color);
            }
        });


        leftPanelItemList.add(new ListPanel(list, panel));
    }

    public static void removeFiend() {

    }
}
