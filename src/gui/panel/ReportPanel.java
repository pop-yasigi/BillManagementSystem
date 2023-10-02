package gui.panel;


import entity.Record;
import service.ReportService;
import util.ChartUtil;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ReportPanel extends WorkingPanel {

    private final JLabel label = new JLabel();
    private ReportService reportService;
    public static ReportPanel instance = new ReportPanel();

    public void init() {
        this.setLayout(new BorderLayout());

        List<Record> records = reportService.listThisMonthRecords();
        Image image = ChartUtil.getImage(records, 400, 300);
        ImageIcon icon = new ImageIcon(image);

        label.setIcon(icon);
        this.add(label);
        addListener();
    }
    @Override
    public void updateData() {
        List<Record> records = reportService.listThisMonthRecords();
        Image image = ChartUtil.getImage(records, 350, 250);
        ImageIcon icon = new ImageIcon(image);
        label.setIcon(icon);
    }

    @Override
    public void addListener() {

    }
}
