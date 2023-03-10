import java.util.*;

public class SnakeList<E> {
    private ArrayList<E> list;

    public SnakeList() {
        list = new ArrayList<E>();
    }

    public SnakeList(E[] body) {
        this();
        for (E val : body) {
            list.add(val);
        }
    }

    public SnakeList(List<E> body) {
        this();
        for (E val : body) {
            list.add(val);
        }
    }

    public SnakeList(E head, SnakeList<E> body) {
        this();
        list.add(head);

        while (!body.isEmpty()) {
            list.add(body.head());
            body = body.body();
        }
    }

    public SnakeList(SnakeList<E> body, E tail) {
        this();
        while (!body.isEmpty()) {
            list.add(body.head());
            body = body.body();
        }

        list.add(tail);
    }

    public E head() {
        if (list.size() == 0)
            return null;
        return list.get(0);
    }

    public SnakeList<E> body() {
        List<E> ret = new ArrayList<E>();
        for (int i = 1; i < list.size(); i++) {
            ret.add(list.get(i));
        }

        return new SnakeList<E>(ret);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public String toString() {
        return list.toString();
    }

}
