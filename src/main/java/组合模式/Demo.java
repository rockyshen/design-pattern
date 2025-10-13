package 组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rockyshen
 * @date 2025/10/13 09:36
 */
public class Demo {
    public static void main(String[] args) {
        List<Component> employees = new ArrayList<>();
        employees.add(new Employee("tom"));
        employees.add(new Employee("merry"));
        employees.add(new Employee("bob"));

        Department department = new Department("Engineering", employees);
        List<Component> departments = new ArrayList<>();
        departments.add(department);
        Team team = new Team("Product", departments);
        team.printName();
    }
}
