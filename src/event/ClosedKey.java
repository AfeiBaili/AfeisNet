package event;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ClosedKey implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == '\u001B') {
            System.exit(0);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
