package again.ex1;

public class Bank {
    private double Balance;
    private double Rate;

    public Bank() {
    }

    public Bank(double balance, double rate) {
        Balance = balance;
        Rate = rate;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public double getRate() {
        return Rate;
    }

    public void setRate(double Rate) {
        this.Rate = Rate;
    }
    public void calculateInterest( int year){
        double interest = 0;
        for (int i = 1;i<=year;i++){
            interest += getBalance()*(getRate()/1200);
        }
         System.out.println("interest for "+year+" year:"+ interest);
    }
    public void calculateInterestForOneYear(){
        double interest = 0;

            interest = getBalance()*(getRate()/1200);

        System.out.println("interest for 1 year:"+ interest);    }
}
