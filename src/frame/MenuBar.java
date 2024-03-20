package frame;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static frame.StaticFrameVariable.*;
import static frame.Util.setFont;

public class MenuBar {
    public static void menu() {
        //菜单
        JMenu main = new JMenu("主界面");
        JMenu files = new JMenu("文件");
        JMenu open = new JMenu("打开");
        JMenu set = new JMenu("设置");
        //添加菜单
        menuBar.add(main);
        menuBar.add(files);
        menuBar.add(open);
        menuBar.add(set);
        //菜单项
        JMenuItem config = new JMenuItem("配置文件");
        JMenuItem log = new JMenuItem("日志文件");

        //添加菜单项
        open.add(config);
        open.add(log);

        //FontSet
        fontSetList.add(main);
        fontSetList.add(files);
        fontSetList.add(open);
        fontSetList.add(set);
        fontSetList.add(config);
        fontSetList.add(log);

        setFont();

        main.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                rightPanel.remove(0);
                rightPanel.add(rightMainPanel);
                rightPanel.revalidate();
                rightPanel.repaint();
            }
        });
    }
}
