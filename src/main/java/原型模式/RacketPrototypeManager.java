package 原型模式;

import java.util.HashMap;

/**
 * 原型管理器
 * @author rockyshen
 * @date 2025/10/8 15:23
 */
public class RacketPrototypeManager {

    private static HashMap<String, RacketPrototype> racketMap = new HashMap<>();

    // 基于原型管理器，对外暴露方法，获取复制的对象
    public static RacketPrototype getCloneRacket(String model) {
        RacketPrototype r = racketMap.get(model);
        return r.clonePrototype();
    }

    // 将原型接口的实现类，写入Map中
    public static void buildPrototype() {
        WilsonRacket r1 = new WilsonRacket("Wilson", "Pro", 320.0, 32.5);
        racketMap.put("pro", r1);
    }
}
