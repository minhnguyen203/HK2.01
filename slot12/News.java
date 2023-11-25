package slot12;

import java.util.ArrayList;
import java.util.Scanner;

interface INews {
    void Display();
}

class New implements INews {
    private int ID;
    private String Title;
    private String PublishDate;
    private String Author;
    private String Content;
    private float AverageRate;
    private ArrayList<Integer> RateList;

    public New(int ID, String Title, String PublishDate, String Author, String Content) {
        this.ID = ID;
        this.Title = Title;
        this.PublishDate = PublishDate;
        this.Author = Author;
        this.Content = Content;
        this.RateList = new ArrayList<>();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String PublishDate) {
        this.PublishDate = PublishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    public void inputRate(int rate) {
        RateList.add(rate);
        Calculate();
    }

    public void Calculate() {
        int sum = 0;
        for (int rate : RateList) {
            sum += rate;
        }
        AverageRate = (float) sum / RateList.size();
    }

    @Override
    public void Display() {
        System.out.println("Title: " + Title);
        System.out.println("Publish Date: " + PublishDate);
        System.out.println("Author: " + Author);
        System.out.println("Content: " + Content);
        System.out.println("Average Rate: " + AverageRate);
    }
}