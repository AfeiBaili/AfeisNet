package frame;

import javax.swing.*;
import java.io.Serial;
import java.io.Serializable;

public class ListPanel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1111111111111111111L;
    private final JPanel list;
    private final JPanel panel;

    public ListPanel(JPanel list, JPanel panel) {
        this.list = list;
        this.panel = panel;
    }

    public JPanel getList() {
        return list;
    }

    public JPanel getPanel() {
        return panel;
    }
}
