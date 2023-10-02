package entity;

import java.util.Date;

public class Record {
    private int spend;
    private int id;
    private int categoryId;
    private String comment;
    private Date date;

    public void setId(int id) {
        this.id = id;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setSpend(int spend) {
        this.spend = spend;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public int getSpend() {
        return spend;
    }

    public String getComment() {
        return comment;
    }
}
