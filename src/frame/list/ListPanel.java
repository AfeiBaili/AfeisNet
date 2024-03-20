package frame.list;

import javax.swing.*;
import java.io.Serial;
import java.io.Serializable;

public record ListPanel(JPanel list, JPanel panel) implements Serializable {
    @Serial
    private static final long serialVersionUID = 1111111111111111111L;
}
