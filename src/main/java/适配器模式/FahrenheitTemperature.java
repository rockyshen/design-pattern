package 适配器模式;

/**
 * 这是Adaptee
 * @author rockyshen
 * @date 2025/10/9 09:48
 */
public class FahrenheitTemperature {
    private double temperature;

    // 构造函数
    public FahrenheitTemperature(double temperature) {
        this.temperature = temperature;
    }

    // getter
    public double getTemperature() {
        return temperature;
    }
}
