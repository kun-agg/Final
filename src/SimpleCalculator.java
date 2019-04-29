import java.lang.Math;
public class SimpleCalculator {
    public final int number1;
    public final int number2;

    public SimpleCalculator(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    public int addition(){
        return number1+number2;
    }

    public int subtraction(){
        return number1-number2;
    }

    public int multiplication(){
        return number1*number2;
    }

    public int division(){
        return number1/number2;
    }

    public int modulo(){
        return number1%number2;
    }
    
    public int power(){
        double a = (double) number1;
        double b = (double) number2;
        return (int) Math.pow(a,b);
    }
}
