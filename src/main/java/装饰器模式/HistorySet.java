package 装饰器模式;

import java.util.*;

/**
 * 一个自定义的Set，当元素E被移除时，会把移除记录在内部的list中
 * 利用装饰器模式，实现
 * @author rockyshen
 * @date 2025/9/24 23:37
 */
public class HistorySet<E> implements Set<E> {
    List<E> removeHistoryList = new ArrayList<>();

    private final Set<E> delegate;

    public HistorySet(Set<E> hashSet) {
        this.delegate = hashSet;
    }

    // Set接口的其他方法，我们都交给它去做
    // 我们只重写特殊的那个
    @Override
    public int size() {
        // 交给hashSet完成
        return delegate.size();
    }
    @Override
    public boolean remove(Object o) {
        boolean removed = delegate.remove(o);
        // 这里增加移除时的额外的逻辑
        if(removed){
            removeHistoryList.add((E)o);
            return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return delegate.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return delegate.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return delegate.iterator();
    }

    @Override
    public Object[] toArray() {
        return delegate.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return delegate.toArray(a);
    }

    @Override
    public boolean add(E e) {
        return delegate.add(e);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return delegate.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return delegate.addAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return delegate.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return delegate.retainAll(c);
    }

    @Override
    public void clear() {
        delegate.clear();
    }

    @Override
    public String toString() {
        return delegate.toString() + " remove list：" + removeHistoryList;
    }
}
