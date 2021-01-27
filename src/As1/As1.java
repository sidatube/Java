package As1;

public class As1 {
    int a ;
    int b;
    int c;
    int C;
    double S;
    boolean checklegit(){
        if ((a+b>c)&&(a+c>b)&&(b+c>a)) return  true;
        return  false;
    }
    void tinhC(){
        C=a+b+c;
    }
    void tinhS(){
        double p= (a+b+c) / 2;
        S= Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    void inner(){
        tinhC();
        tinhS();
        System.out.println("Chu vi của tam giác là: "+C);
        System.out.println("Diện tích của tam giác là: "+S);
    }
}
