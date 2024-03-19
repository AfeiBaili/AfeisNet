package event;


import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import static frame.StaticFrameVariable.*;

public class ComponentSizeEvent implements ComponentListener {
    @Override
    public void componentResized(ComponentEvent e) {
        frameWidth = frame.getWidth();
        frameHeight = frame.getHeight();
        leftScrollPanel.setSize(frameWidth / 4, frameHeight - 60);
        rightPanel.setBounds(leftScrollPanel.getWidth(), 0, frameWidth, frameHeight - 60);
        leftScrollPanel.setViewportView(leftPanelList);


    }

    @Override
    public void componentMoved(ComponentEvent e) {

    }

    @Override
    public void componentShown(ComponentEvent e) {

    }

    @Override
    public void componentHidden(ComponentEvent e) {

    }
}