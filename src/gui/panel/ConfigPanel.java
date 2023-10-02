package gui.panel;

import gui.listener.ConfigListener;
import service.ConfigService;
import util.ColorUtil;
import util.GUIUtil;

import javax.swing.*;
import java.awt.*;

public class ConfigPanel extends WorkingPanel {
    private final JLabel labelBudget = new JLabel("本月预算（￥）");
    private final JTextField textFieldBudget = new JTextField("0");

    private final JLabel labelMySQL = new JLabel("MySQL安装目录");
    private final JTextField textFieldMySQL = new JTextField("");

    private final JButton buttonSubmit = new JButton("更新");

    private ConfigListener configListener;
    private ConfigService configService;
    public static ConfigPanel instance = new ConfigPanel();

    public void init() {
        GUIUtil.setColor(ColorUtil.getGrayColor(), labelBudget, labelMySQL);
        GUIUtil.setColor(ColorUtil.getBlueColor(), buttonSubmit);

        JPanel panelInput = new JPanel();
        JPanel panelSubmit = new JPanel();

        int gap = 40;

        panelInput.setLayout(new GridLayout(4, 1, gap, gap));
        panelInput.add(labelBudget);
        panelInput.add(textFieldBudget);
        panelInput.add(labelMySQL);
        panelInput.add(textFieldMySQL);

        panelSubmit.add(buttonSubmit);

        this.setLayout(new BorderLayout());
        this.add(panelInput, BorderLayout.NORTH);
        this.add(panelSubmit, BorderLayout.CENTER);

        addListener();
    }

    public JTextField getTextFieldBudget() {
        return textFieldBudget;
    }

    public JTextField getTextFieldMySQL() {
        return textFieldMySQL;
    }

    @Override
    public void updateData() {
        String budget = configService.get(ConfigService.budget);
        String mysqlPath = configService.get(ConfigService.mysqlPath);
        textFieldBudget.setText(budget);
        textFieldMySQL.setText(mysqlPath);
        textFieldBudget.grabFocus();
    }

    @Override
    public void addListener() {
        buttonSubmit.addActionListener(configListener);
    }
}
