package 建造者模式;

import lombok.Data;

/**
 * @author rockyshen
 * @date 2025/9/17 11:28
 */
@Data
public class User {
    private String name;
    private Integer age;

    // 静态内部类，建造者
    public static class Builder {
        private String name;
        private Integer age;

        public void name(String name){
            this.name = name;
        }

        public void age(int age){
            this.age = age;
        }

        public User build() {
            User user = new User();
            user.setName(this.name);
            user.setAge(this.age);

            // 建造user对象时，引入一段奇葩的校验逻辑
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
