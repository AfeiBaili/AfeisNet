package event;


import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import static frame.StaticFrameVariable.*;
import static frame.Util.leftPaneListShow;

public class ComponentSizeEvent implements ComponentListener {
    @Override
    public void componentResized(ComponentEvent e) {
        frameWidth = frame.getWidth();
        frameHeight = frame.getHeight();
        leftScrollPanel.setSize(frameWidth / 4, frameHeight - 60);
        rightPanel.setBounds(leftScrollPanel.getWidth(), 0, (int) (frameWidth / 0.75), frameHeight - 60);
        frame.revalidate();
        leftPaneListShow();
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
