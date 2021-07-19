import java.util.Collection;
import java.util.List;

public class SomeType<T> {
    public <E> void test(Collection<E> collection) {
        System.out.println("col");
        for (E element : collection) {
            System.out.println(element);
        }
    }
    public void test(List<Integer> collection) {
        System.out.println("list");
        for (Integer element : collection) {
            System.out.println(element);
        }
    }
}