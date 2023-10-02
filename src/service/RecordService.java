package service;

import dao.RecordDAO;
import entity.Category;
import entity.Record;

import java.util.Date;

public class RecordService {
    RecordDAO recordDAO = new RecordDAO();

    public void add(int spend, Category c, String comment, Date date) {
        Record record = new Record();
        record.setSpend(spend);
        record.setCategoryId(c.getId());
        record.setComment(comment);
        record.setDate(date);
        recordDAO.add(record);
    }
}
