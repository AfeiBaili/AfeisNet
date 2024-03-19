package frame;

import java.awt.*;

import static frame.StaticFrameVariable.fontSetList;

public class Util {
    public static void setFont() {
        fontSetList.forEach(jComponent -> jComponent.setFont(new Font("Microsoft YaHei", Font.PLAIN, 13)));
    }
}
