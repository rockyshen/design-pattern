package 组合模式;

/**
 * @author rockyshen
 * @date 2025/10/13 09:29
 */
public class Employee implements Component{
    // 员工的名字
    String name;

    // 要求构造时，就必须传入员工名字
    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println(this.name);
    }
}
