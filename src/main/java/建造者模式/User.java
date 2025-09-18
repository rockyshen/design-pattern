package 建造者模式;

import lombok.Data;
import lombok.Getter;

/**
 * @author rockyshen
 * @date 2025/9/17 11:28
 */
@Getter   // 不提供setter方法，对外不提供修改属性的方法
public class User {
    private final String name;   // 对象属性field一旦被声明为final，表示一旦赋某个值，就不能改了
    private final Integer age;

    // 私有化User构造方法，不允许外部使用new User创建，只能用Builder
    private User(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
    }

    // 静态方法
    public static Builder builder(){
        return new Builder();
    }

    // 静态内部类，建造者
    public static class Builder {
        private String name;
        private Integer age;

        // 构造函数私有化
        private Builder() {}

        public Builder name(String name){
            this.name = name;
            // 链式调用
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public User build() {
            // 由于User的构造函数是私有化的，且属性是final必须new对象的时候提供值，我们通过传递builder对象
            // 将user需要的属性，通过builder身上的属性传递给user
            User user = new User(this);
//            user.name = this.name;    // 把builder的name属性，传递给user，因为user对外不提供setter方法了
//            user.age = this.age;

            // 【自定义创建实例时，检查属性的特定逻辑】建造user对象时，引入一段奇葩的校验逻辑
            if(age < 10 && "Tom".equals(name)){
                throw new IllegalArgumentException("");
            }
            if(age > 10 && "Jerry".equals(name)){
                throw new IllegalArgumentException("");
            }

            return user;
        }
    }
}
