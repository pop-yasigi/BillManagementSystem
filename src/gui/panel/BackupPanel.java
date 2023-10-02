package gui.panel;

import gui.listener.BackupListener;
import util.ColorUtil;
import util.GUIUtil;

import javax.swing.*;

public class BackupPanel extends WorkingPanel {
    static {
        GUIUtil.useLNF();
    }
    JButton buttonBackup = new JButton("备份");
    public static BackupPanel instance = new BackupPanel();

    public BackupPanel() {
        GUIUtil.setColor(ColorUtil.blueColor, buttonBackup);
        this.add(buttonBackup);
        addListener();
    }

    public static void main(String[] args) {
        GUIUtil.showPanel(BackupPanel.instance);
    }

    public void init() {
        this.add(buttonBackup);
    }

    @Override
    public void addListener() {
        BackupListener listener = new BackupListener();
        buttonBackup.addActionListener(listener);
    }

    @Override
    public void updateData() {

    }
}
