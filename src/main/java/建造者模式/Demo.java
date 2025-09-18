package 建造者模式;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author rockyshen
 * @date 2025/9/17 11:29
 */
public class Demo {
    public static void main(String[] args) {
        // 传统new方法
//        User.Builder builder = new User.Builder();
//        builder.name("tom");
//        builder.age(11);
//        User user = builder.build();
//        System.out.println(user);

        // 建造者模式，链式调用
        // 本质上，操作的是中间对象 builder，避免直接操作user
        User user = User.builder().name("tom").age(11).build();
        // 联想到stream流,stream()相当于builder的中间对象，map、filter相当于name、age方法中间操作、collect相当于build()中止操作
//        myList.stream().map(String::valueOf).filter(e -> {e.length() > 1}).collect(Collectors.toList());
    }
}
