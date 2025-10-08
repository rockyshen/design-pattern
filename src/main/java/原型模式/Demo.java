package 原型模式;

/**
 * @author rockyshen
 * @date 2025/10/8 15:33
 */
public class Demo {
    public static void main(String[] args) {
        // 模拟创建一个wilson球拍，放入map
        RacketPrototypeManager.buildPrototype();

        // 拿到了复制的对象
        RacketPrototype pro = RacketPrototypeManager.getCloneRacket("pro");

        System.out.println(pro);
    }
}
