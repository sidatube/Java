package again.ex2;

public class Flight {
    int number;
    String destinaytion;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDestinaytion() {
        return destinaytion;
    }

    public void setDestinaytion(String destinaytion) {
        this.destinaytion = destinaytion;
    }

    public Flight() {
        this.number = 0;
    }

    public Flight(int number, String destinaytion) {
        this.number = number;
        this.destinaytion = destinaytion;
    }
    public void display(){
       if (getDestinaytion()==null){
           System.out.println(getNumber()+",No Destinaytion");
           return;
       }else {
           System.out.println(getNumber()+","+getDestinaytion());
       }
    }
}
