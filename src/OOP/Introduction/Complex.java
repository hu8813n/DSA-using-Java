package OOP.Introduction;

public class Complex {
    int real, imag;

    public void print(){
        System.out.println(real + " +i" + imag);
    }
    public Complex(int real, int imag){
        this.real = real;
        this.imag= imag;
    }

    void add(Complex c){
        this.real = real + c.real;
        this.imag = imag + c.imag;
    }


    public static void main(String[] args) {
        Complex c1 = new Complex(10, 20);
        c1.print();

        Complex c2 = new Complex(20, 30);
        c1.add(c2);
        c1.print();
    }
}
