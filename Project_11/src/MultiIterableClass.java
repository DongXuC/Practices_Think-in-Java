import java.util.*;

/**
 * Created by XuChen on 2017/9/15.
 * Description:
 */
public class MultiIterableClass extends IterableClass {
    Iterable<String> reversed(){
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    int current=words.length-1;
                    @Override
                    public boolean hasNext() {
                        return current>-1;
                    }

                    @Override
                    public String next() {
                        return words[current--];
                    }
                };
            }
        };
    }

    public Iterable<String> randomized(){
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                List<String> shuffled=new ArrayList<String>(Arrays.asList(words));
                Collections.shuffle(shuffled,new Random());
                return shuffled.iterator();
            }
        };
    }

    public static void main(String[] args) {
        MultiIterableClass mic=new MultiIterableClass();
        for (String s:mic){
            System.out.println(s);
        }
        for (String s:mic.reversed()){
            System.out.println(s);
        }
        for (String s:mic.reversed()){
            System.out.println(s);
        }
    }
}
