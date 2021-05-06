/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class TaskManager {

    private int id;
    private int typeID;
    private String name, assign, reviewer, date;
    private double from, to;

    public TaskManager() {
    }

    public TaskManager(int id, int typeID, String name, String assign, String reviewer, String date, double from, double to) {
        this.id = id;
        this.typeID = typeID;
        this.name = name;
        this.assign = assign;
        this.reviewer = reviewer;
        this.date = date;
        this.from = from;
        this.to = to;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTypeID() {
        return typeID;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAssign() {
        return assign;
    }

    public void setAssign(String assign) {
        this.assign = assign;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getFrom() {
        return from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public String typeName() {
        switch (typeID) {
            case 1:
                return "Code";
            case 2:
                return "Test";
            case 3:
                return "Design";
            case 4:
                return "Review";

        }
        return null;
    }

    public double time() {
        return to - from;
    }

    @Override
    public String toString() {
        String out = String.format("%-4s%-15s%-15s%-20s%-20s%-20s%-20s",
                 id, name, typeName(), date, time(), assign, reviewer);
        return out;
    }

}
