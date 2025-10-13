package 组合模式;

import java.util.List;

/**
 * @author rockyshen
 * @date 2025/10/13 09:30
 */
public class Department implements Component{
    // 部门名字
    String name;

    // 一个部门，可以包含一组：teams 或 employees 都可以
    List<Component> components;

    // 要求构造时，就必须传入部门名字


    public Department(String name, List<Component> components) {
        this.name = name;
        this.components = components;
    }

    @Override
    public void printName() {
        // 1.打印自己的name
        System.out.println("Department:"+ this.name);

        // 2.遍历下属List<Component>，调用component的printName方法
        for (Component component : components){
            component.printName();
        }
    }
}
