
//this class extends Coin and implements the abstract method getvalue()
public class USD extends Coin{
    private final double value= 3.52; //value of dollar
    private  double result;

    @Override
    public double getValue(){
        return value;
    }
@Override
    public double calculate(double userValue)
{
        return userValue * getValue();
    } //convert function
}