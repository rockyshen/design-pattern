package 适配器模式;

/**
 * @author rockyshen
 * @date 2025/10/9 09:50
 */
public class FahrenheitCelsiusAdapter extends FahrenheitTemperature implements CelsiusTemperature{
    // 构造函数
    public FahrenheitCelsiusAdapter(double temperature) {
        super(temperature);
    }

    @Override
    public double getCelsiusTemperature() {
        return (super.getTemperature() - 32) * 5 / 9;
    }
}
