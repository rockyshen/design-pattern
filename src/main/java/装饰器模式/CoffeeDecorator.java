package 装饰器模式;

/**
 * 抽象类
 * 抽象类实现一个接口，不强制@override接口的方法。但是一个类一旦继承了抽象类，就必须@override接口的方法
 * @author rockyshen
 * @date 2025/10/29 10:00
 */
abstract class CoffeeDecorator implements Coffee{
    // 抽象类持有对接口的引用
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return coffee.cost();
    }
}
