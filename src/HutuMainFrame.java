//import gui.listener.SpendPanelListener;
//import gui.panel.SpendPanel;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class HutuMainFrame {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame();
//        frame.setSize(500, 450);
//        frame.setTitle("一本糊涂账");
//        frame.setLocationRelativeTo(null);
//        frame.setResizable(false);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        JToolBar toolBar = new JToolBar();
//        JButton b_spend = new JButton("消费一览");
//        JButton b_record = new JButton("记一笔");
//        JButton b_category = new JButton("消费分类");
//        JButton b_report = new JButton("月消费报表");
//        JButton b_config = new JButton("设置");
//        JButton b_backup = new JButton("备份");
//        JButton b_recover = new JButton("恢复");
//
//        toolBar.add(b_spend);
//        toolBar.add(b_record);
//        toolBar.add(b_category);
//        toolBar.add(b_report);
//        toolBar.add(b_config);
//        toolBar.add(b_backup);
//        toolBar.add(b_recover);
//
//        frame.setLayout(new BorderLayout());
//        frame.add(toolBar, BorderLayout.NORTH);
//        frame.add(new JPanel(), BorderLayout.CENTER);
//
//        SpendPanel sp = SpendPanel.instance;
//        frame.add(sp, BorderLayout.CENTER);
//
//
//        frame.setVisible(true);
//
//        //b_spend.addActionListener(new SpendPanelListener(sp));
//        b_record.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });
//        b_category.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });
//        b_config.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });
//        b_backup.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });
//        b_recover.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//            }
//        });
//    }
//}
