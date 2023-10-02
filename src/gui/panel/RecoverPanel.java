package gui.panel;

import gui.listener.RecoverListener;
import util.ColorUtil;
import util.GUIUtil;

import javax.swing.*;

public class RecoverPanel extends WorkingPanel {
    static {
        GUIUtil.useLNF();
    }
    JButton buttonRecover = new JButton("恢复");
    public static RecoverPanel instance = new RecoverPanel();

    public RecoverPanel() {
        GUIUtil.setColor(ColorUtil.blueColor, buttonRecover);
        this.add(buttonRecover);
        addListener();
    }

    public void init() {
        this.add(buttonRecover);
    }

    public static void main(String[] args) {
        GUIUtil.showPanel(RecoverPanel.instance);
    }

    @Override
    public void addListener() {
        RecoverListener listener = new RecoverListener();
        buttonRecover.addActionListener(listener);
    }

    @Override
    public void updateData() {

    }
}
