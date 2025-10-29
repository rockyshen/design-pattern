package 装饰器模式;

/**
 * @author rockyshen
 * @date 2025/10/29 10:01
 */
public class MilkDecorator extends CoffeeDecorator{

    // 构造方法
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.5;
    }
}
