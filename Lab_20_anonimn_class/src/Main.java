public class Main {
    public static final long STEPS = 100000L;
    public static double Integral (double a, double b, MathFunction f)
    {
        double h = (b-a)/STEPS;
        double summa =0.0;
             for (long i=0; i<STEPS; i++)
             {
                 double x = a+h*i+h/2;
                 double y = f.F(x);
                 summa += y*h;


             }
                return summa;

    }
    public static void main (String [] args){
       Sin2 s = new Sin2();

        double r = Integral(0,Math.PI/2, s);
        System.out.printf("Integral: %g", r);

    }

}
class Sin2 implements MathFunction{
    @Override
    public double F (double x){
        return Math.pow(Math.sin(x), 2.0);
    }

}

