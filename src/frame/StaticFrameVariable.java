package frame;

import javax.swing.*;
import java.util.ArrayList;

public class StaticFrameVariable {
    public static AFrame frame;
    public static int screenWidth;
    public static int screenHeight;
    public static int frameWidth;
    public static int frameHeight;
    public static JMenuBar menuBar = new JMenuBar();
    public static JScrollPane leftScrollPanel = new JScrollPane();
    public static JPanel leftPanelList = new JPanel();
    public static JPanel rightPanel = new JPanel();
    public static ArrayList<ListPanel> leftPanelItemList = new ArrayList<>();
    public static ArrayList<JComponent> fontSetList = new ArrayList<>();
    public static int itemY = 0;
    public static int itemX;
}
