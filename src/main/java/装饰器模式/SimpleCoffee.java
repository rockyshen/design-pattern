package 装饰器模式;

/**
 * 基础实现类，实现接口
 * @author rockyshen
 * @date 2025/10/29 09:59
 */
public class SimpleCoffee implements Coffee{
    @Override
    public double cost() {
        return 2.0;
    }
}
