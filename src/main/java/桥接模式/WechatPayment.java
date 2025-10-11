package 桥接模式;

/**
 * @author rockyshen
 * @date 2025/10/11 09:40
 */
public class WechatPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.println("处理微信支付...");
    }
}
