package 装饰器模式;

import java.util.HashSet;

/**
 * @author rockyshen
 * @date 2025/9/24 23:45
 */
public class Demo {
    public static void main(String[] args) {
        HistorySet<Integer> historySet = new HistorySet<>(new HashSet<>());
        historySet.add(1);
        historySet.add(2);
        historySet.add(3);
        historySet.add(4);
        historySet.remove(1);

        System.out.println(historySet);
    }
}
