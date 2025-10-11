package 桥接模式;

/**
 * @author rockyshen
 * @date 2025/10/11 09:41
 */
public abstract class Product {
    // 成员变量，protected：包内可见，其他包的子类可见
    protected Payment payment;

    // 抽象类的构造方法
    public Product(Payment payment) {
        this.payment = payment;
    }

    // 抽象方法
    public abstract void purchase();
}
