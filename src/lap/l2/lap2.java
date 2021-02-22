package lap.l2;

public class lap2 {

    private  int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if (this.isSNT(a)) {
            this.a = a;
        }else{
            System.out.println("Khong set");
        }
    }

    public boolean isSNT(int x){
        if( x<2) return  false;
        else if (x>2){
            if (x%2==0) return false;
            for (int i=3; i<=Math.sqrt((float)x);i++){
                if(x%i==0) return false;
            }
        }
        return true;
    }
    public int timSNTTT(){
        for( int i=a+1;;i++){
            if (isSNT(i)){
                setA(i);
                return i;
            }
        }
    }


}
