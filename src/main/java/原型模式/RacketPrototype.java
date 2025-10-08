package 原型模式;

/**
 * 定义一个网球拍的原型
 * @author rockyshen
 * @date 2025/10/8 15:17
 */
abstract class RacketPrototype {
    // 声明为protected，只有继承的子类可以看到
    protected String brand;

    protected String model;

    protected double weight;

    protected double balancePoint;

    // 构造函数
    public RacketPrototype(String brand, String model, double weight, double balancePoint) {
        this.brand = brand;
        this.model = model;
        this.weight = weight;
        this.balancePoint = balancePoint;
    }

    // 抽象方法
    public abstract RacketPrototype clonePrototype();

    @Override
    public String toString() {
        return "RacketPrototype{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                ", balancePoint=" + balancePoint +
                '}';
    }
}
