package 建造者模式;

/**
 * @author rockyshen
 * @date 2025/9/17 11:29
 */
public class Demo {
    public static void main(String[] args) {
        User.Builder builder = new User.Builder();
        builder.name("tom");
        builder.age(11);
        User user = builder.build();
    }
}
