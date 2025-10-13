package 组合模式;

import java.util.List;

/**
 * @author rockyshen
 * @date 2025/10/13 09:35
 */
public class Team implements Component{
    // 小组名字
    String name;

    // 一个小组，可以包含一组：employees
    List<Component> components;

    public Team(String name, List<Component> components) {
        this.name = name;
        this.components = components;
    }

    @Override
    public void printName() {
        // 1.打印自己的name
        System.out.println("Team:"+ this.name);

        // 2.遍历下属List<Component>，调用component的printName方法
        for (Component component : components){
            component.printName();
        }
    }
}
