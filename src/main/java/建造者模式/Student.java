package 建造者模式;

import lombok.ToString;

/**
 * 练习写一个建造者模式的对象
 * @author rockyshen
 * @date 2026/3/10 10:29
 */
@ToString
public class Student {
    // 1.私有化field
    private String id;
    private String name;
    private String major;

    // 2. 私有化构造方法，接收Builder
    private Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.major = builder.major;
    }

    // 4. 静态builder方法
    public static Builder builder() {
        return new Builder();
    }

    // 3. 静态内部类 Builder
    public static class Builder {
        private String id;
        private String name;
        private String major;

        // 3.1 私有化Builder的构造空方法
        private Builder() {}

        // 3.2 链式调用属性设置，返回Builder
        public Builder id(String id){
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder major(String name){
            this.major = major;
            return this;
        }

        // 5.build方法，返回真正对象
        public Student build(){
            Student student = new Student(this);

            // 支持额外校验逻辑

            return student;
        }
    }


}
