package 装饰器模式;

/**
 * @author rockyshen
 * @date 2025/10/29 10:12
 */
public class SugerDecorator extends CoffeeDecorator{
    // 构造方法持有对接口的引用
    public SugerDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.25;
    }
}
