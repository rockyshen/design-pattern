package 桥接模式;

/**
 * @author rockyshen
 * @date 2025/10/11 09:40
 */
public class CreditCardPayment implements Payment{


    @Override
    public void processPayment() {
        System.out.println("处理信用卡支付...");
    }
}
