import java.util.Iterator;

/**
 * Created by XuChen on 2017/9/15.
 * Description:
 */
public class IterableClass implements Iterable<String> {
    protected String words[] = ("To be or not to be").split(" ");

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }
        };
    }
}
