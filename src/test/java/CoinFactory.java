
public class CoinFactory {
    public static Coin getCoinInstance(EnumCoins coin) {
        try {
            switch (coin) {
                case ILS:
                    return new ILS();
                case USD:
                    return new USD();
                case EXIT:
                    System.out.println("OK");
            }

        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Insert only 1 ,2 or 3");
           // return null;
        }
        return null;
    }

}