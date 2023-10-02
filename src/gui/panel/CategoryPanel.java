package gui.panel;

import entity.Category;
import gui.listener.CategoryListener;
import gui.model.CategoryTableModel;
import service.CategoryService;
import util.ColorUtil;
import util.GUIUtil;

import javax.swing.*;
import java.awt.*;

public class CategoryPanel extends WorkingPanel {
    static {
        GUIUtil.useLNF();
    }

    public static CategoryPanel instance = new CategoryPanel();

    public JButton bAdd = new JButton("新增");
    public JButton bExit = new JButton("编辑");
    public JButton bDelete = new JButton("删除");
    String columnName[] = new String[]{"分类名称", "消费次数"};

    public CategoryTableModel ctm = new CategoryTableModel();
    public JTable table = new JTable(ctm);

    public CategoryPanel() {
        GUIUtil.setColor(ColorUtil.blueColor, bAdd, bExit, bDelete);
        JScrollPane sp = new JScrollPane(table);
        JPanel pSubmit = new JPanel();
        pSubmit.add(bAdd);
        pSubmit.add(bExit);
        pSubmit.add(bDelete);

        this.setLayout(new BorderLayout());
        this.add(sp, BorderLayout.CENTER);
        this.add(pSubmit, BorderLayout.SOUTH);

        addListener();
    }

    public void addListener() {
        CategoryListener listener = new CategoryListener();
        bAdd.addActionListener(listener);
        bExit.addActionListener(listener);
        bDelete.addActionListener(listener);
    }

    public static void main(String[] args) {
        GUIUtil.showPanel(CategoryPanel.instance);
    }

    public Category getSelectedCategory() {
        int index = table.getSelectedRow();
        return ctm.cs.get(index);
    }

    @Override
    public void updateData() {
        ctm.cs = new CategoryService().list();
        table.updateUI();
        table.getSelectionModel().setSelectionInterval(0, 0);

        if (0 == ctm.cs.size()) {
            bExit.setEnabled(false);
            bDelete.setEnabled(false);
        } else {
            bExit.setEnabled(true);
            bDelete.setEnabled(true);
        }
    }
}
