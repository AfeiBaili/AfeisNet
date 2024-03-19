package frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import static frame.StaticFrameVariable.leftPanelItemList;

public class Friends {
    public static void addFiend() {
        JPanel list = new JPanel();
        JPanel panel = new JPanel();
        list.setBackground(new Color(191, 193, 194));
        list.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                System.out.println(1);
            }

            @Override
            public void focusLost(FocusEvent e) {
                System.out.println(2);
            }
        });
        leftPanelItemList.add(new ListPanel(list, panel));
    }

    public static void removeFiend() {
    }
}
