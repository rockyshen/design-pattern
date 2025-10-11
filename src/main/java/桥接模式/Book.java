package 桥接模式;

/**
 * @author rockyshen
 * @date 2025/10/11 09:42
 */
public class Book extends Product{
    public Book(Payment payment) {
        super(payment);
    }

    @Override
    public void purchase() {
        this.payment.processPayment();
        System.out.println("Book完成购买！");
    }
}
