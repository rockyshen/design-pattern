package 适配器模式;

/**
 * @author rockyshen
 * @date 2025/10/9 09:52
 */
public class Demo {
    public static void main(String[] args) {
        FahrenheitTemperature f = new FahrenheitTemperature(100);
        FahrenheitCelsiusAdapter fahrenheitCelsiusAdapter = new FahrenheitCelsiusAdapter(f.getTemperature());
        double c = fahrenheitCelsiusAdapter.getCelsiusTemperature();
        // 这里通过适配器拿到了摄氏度
    }
}
