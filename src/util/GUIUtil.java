package util;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class GUIUtil {
    private static String imageFolder = "E:\\Desktop\\@java\\项目练习\\hutubill\\src\\resources\\img";

    public static void setImageIcon(JButton button, String fileName, String tip) {
        ImageIcon i = new ImageIcon(new File(imageFolder, fileName).getAbsolutePath());
        button.setIcon(i);
        button.setPreferredSize(new Dimension(61, 81));
        button.setToolTipText(tip);  //悬浮提示文本
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setText(tip);
    }

    public static void setColor(Color color, JComponent... cs) {
        for (JComponent c : cs) {
            c.setForeground(color);
        }
    }

    public static void showPanel(JPanel p, double strechRate) {
        GUIUtil.useLNF();
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        CenterPanel cp = new CenterPanel(strechRate);
        frame.setContentPane(cp);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        cp.show(p);
    }

    public static void showPanel(JPanel panel) {
        showPanel(panel, 0.85);
    }

    public static boolean checkNumber(JTextField tf, String input) {
        if (!checkEmpty(tf, input)) {
            return false;
        }
        String text = tf.getText().trim();
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, input + "需要是整数");
            tf.grabFocus(); //获得焦点
            return false;
        }
    }

    public static boolean checkZero(JTextField tf, String input) {
        if (!checkNumber(tf, input)) {
            return false;
        }
        String text = tf.getText().trim();
        if (0 == Integer.parseInt(text)) {
            JOptionPane.showMessageDialog(null, input + "不能为零");
            tf.grabFocus();
            return false;
        }
        return true;
    }

    public static boolean checkEmpty(JTextField tf, String input) {
        String text = tf.getText().trim();
        if (0 == text.length()) {
            JOptionPane.showMessageDialog(null, input + "不能为空");
            tf.grabFocus();
            return false;
        }
        return true;
    }

    public static int getInt(JTextField textField) {
        return Integer.parseInt(textField.getText());
    }

    public static void useLNF() {
        try {
            javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel"); //com.birosoft.liquid.LiquidLookAndFeel
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
