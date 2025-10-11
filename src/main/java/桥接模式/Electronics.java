package 桥接模式;

/**
 * @author rockyshen
 * @date 2025/10/11 09:45
 */
public class Electronics extends Product{
    /**
     * Electronics是一个具体子类，继承自抽象父类Product
     * 抽象父类Product有构造方法，需要传入Payment属性
     * 当你创建一个Electronics对象时，需要初始化该对象的所有部分，保罗抽象父类需要的Payment
     * 借由子类Electronics的构造方法来接收payment实例，通过super(payment)传递给抽象父类Product
     * 子类实例被创建时，父类必须先完成构造
     * @param payment
     */
    public Electronics(Payment payment) {
        super(payment);
    }

    @Override
    public void purchase() {
        this.payment.processPayment();
        System.out.println("电子产品完成购买！");
    }
}
