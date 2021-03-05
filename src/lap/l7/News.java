package lap.l7;

import java.util.ArrayList;

public class News implements INews{
    int Id;
    String Title;
    String PublishDate;
    String Author;
    String Conten;
    float AverageRate;
    ArrayList<Integer> RateList;

    public News() {
        RateList = new ArrayList<Integer>();
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getConten() {
        return Conten;
    }

    public void setConten(String conten) {
        Conten = conten;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    @Override
    public void Display() {
        System.out.println("Title: "+getTitle());
        System.out.println("Publish Date: "+this.getPublishDate());
        System.out.println("Author: "+this.getAuthor());
        System.out.println("Content: "+ this.getConten());
        System.out.println("Average Rate: "+ this.getAverageRate());
    }
    public void  addRate(int a,int b, int c){
        RateList.add(a);
        RateList.add(b);
        RateList.add(c);
    }
    public float Caculate(){
        float Caculate =0;
        for (int p: RateList){
            Caculate += p;
        }

        return AverageRate=Caculate/3;
    }
}
