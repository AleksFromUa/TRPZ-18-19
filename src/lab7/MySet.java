package lab7;

import lab6.МузичнаКомпозиція;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class MySet implements Set<МузичнаКомпозиція> {
    private static final int INITIAL_CAPACITY = 15;
    private МузичнаКомпозиція[] elements = new МузичнаКомпозиція[INITIAL_CAPACITY];
    private int size = 0;

    public MySet() {
    }

    public MySet(МузичнаКомпозиція музичнаКомпозиція) {
        add(музичнаКомпозиція);
    }

    public MySet(Collection<МузичнаКомпозиція> collection) {
        addAll(collection);
    }



    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        Iterator<МузичнаКомпозиція> iterator = iterator();
        while (iterator.hasNext()) {
            if (o.equals(iterator.next())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<МузичнаКомпозиція> iterator() {
        return new Iterator<МузичнаКомпозиція>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public МузичнаКомпозиція next() {
                return elements[index++];
            }
        };
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(elements, size);
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(МузичнаКомпозиція музичнаКомпозиція) {
        elements[size++] = музичнаКомпозиція;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends МузичнаКомпозиція> c) {
        /*Iterator<? extends МузичнаКомпозиція> iterator = c.iterator();
        while (iterator.hasNext()) {
            add(iterator.next());
        }*/
        for (МузичнаКомпозиція музичнаКомпозиція : c) {
            add(музичнаКомпозиція);
        }
        //todo fix return value
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
