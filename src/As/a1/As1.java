package As.a1;

public class As1 {
    private float a ;
    private float b;
    private float c;

    public As1() {
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }


    public boolean checkLegit(){
        if ((getA()+getB()>getC())&&(getA()+getC()>getB())&&(getB()+getC()>getA())) return  true;
        return  false;
    }
    public float tinhC(){
        return getA()+getB()+getC();
    }
    public double tinhS(){
        double p= (getA()+getB()+getC()) / 2;
        return Math.sqrt(p*(p-getA())*(p-getB())*(p-getC()));
    }
}
