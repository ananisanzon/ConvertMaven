//this class extends Coin and implements the abstract method getvalue()
public class ILS extends Coin {
    private final double value = 0.28;//value of shekel
    private double result;

    @Override
    public double getValue() {
        return value;
    }

    @Override

    public double calculate(double userValue) {   ////convert function
        return userValue * getValue();



    }
}