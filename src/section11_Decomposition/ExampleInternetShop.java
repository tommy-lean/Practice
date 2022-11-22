package section11_Decomposition;

public class ExampleInternetShop {

    public static long createOrder(long userId, String[] products, int[] prices, int[] counts){
        if(isShoppingCartValid(products, counts)){
            if(isDoesCreateOrderLimitsReached()){
                if(ifTotalCostLessThanMax()){
                    long orderId = saveOrderToDataBase(userId, products, counts);
                    String email = findEmailForUser(userId);
                    sendOrderCompletedEmail(products, prices, counts, orderId, email);
                }
                else{
                    //TODO throw exception
                    return -3;
                }

            }
            else{
                //TODO throw exception
                return -4;
            }
        }
        else{
            //TODO throw exception
            return -5;
        }
        return 0L;
    }

    private static void sendOrderCompletedEmail(String[] products, int[] prices, int[] counts, long orderId, String email) {

    }

    private static String findEmailForUser(long userId) {
        return findEmailForUser(userId);
    }

    private static long saveOrderToDataBase(long userId, String[] products, int[] counts) {
        return saveOrderToDataBase(userId, products, counts);
    }

    private static boolean ifTotalCostLessThanMax() {
        return true;
    }

    private static boolean isDoesCreateOrderLimitsReached() {
        return true;
    }

    private static boolean isShoppingCartValid(String[] products, int[] counts) {
        return isShoppingCartValid(products, counts);
    }
}
