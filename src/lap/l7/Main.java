package lap.l7;

public class Main {
    public static  void  main( String[] args){
        News n = new News();
        n.setTitle("No");
        n.setId(1);
        n.setPublishDate("22/4");
        n.setAuthor("BCT");
        n.setConten("None");
        n.addRate(4,6,9);
        n.Caculate();
        n.Display();
    }
}
