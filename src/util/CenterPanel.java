package util;

import gui.panel.WorkingPanel;

import javax.swing.*;
import java.awt.*;

public class CenterPanel extends JPanel {
    private double rate; //拉伸比例
    private JComponent component; //显示的组件
    private boolean strech; //是否拉伸

    public CenterPanel(double rate, boolean strech) {
        this.setLayout(null);
        this.rate = rate;
        this.strech = strech;
    }

    public CenterPanel(double rate) {
        this(rate, true);
    }

    public void repaint() {
        if (null != component) {
            Dimension containerSize = this.getSize();
            Dimension componentSize = component.getPreferredSize();

            if (strech) {
                component.setSize((int) (containerSize.width * rate), (int) (containerSize.height * rate));
            } else {
                component.setSize(componentSize);
            }
            component.setLocation(containerSize.width / 2 - component.getSize().width / 2, containerSize.height / 2 - component.getSize().height / 2);
        }
        super.repaint();
    }

    public void show(JComponent component) {
        this.component = component;
        Component[] cs = getComponents();
        for (Component c : cs) {
            remove(c);
        }
        add(component);

        if (component instanceof WorkingPanel) {
            ((WorkingPanel) component).updateData();
        }

        this.updateUI();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        frame.setLocationRelativeTo(null);
        CenterPanel cp = new CenterPanel(0.85, true);
        frame.setContentPane(cp);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JButton button = new JButton("abc");
        cp.show(button);
    }
}
