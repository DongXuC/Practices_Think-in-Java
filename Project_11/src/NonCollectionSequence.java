import typeinfo.pets.Pet;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by XuChen on 2017/9/15.
 * Description:
 */

//若希望NonCollectionSequence对象能够用于foreach，那么该类一定继承于Iterable
public class NonCollectionSequence extends PetSequence implements Iterable<Pet> {
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }
        };
    }

    public Iterable<Pet> reversed() {
        return new Iterable() {
            @Override
            public Iterator iterator() {
                return new Iterator() {
                    int current = pets.length - 1;

                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public Object next() {
                        return pets[current--];
                    }
                };
            }
        };

    }

    public Iterable<Pet> randomized() {
        return new Iterable<Pet>() {
            @Override
            public Iterator<Pet> iterator() {
                Random random = new Random();
                List<Pet> shuffled = new ArrayList<Pet>(Arrays.asList(pets));
                Collections.shuffle(shuffled, new Random());
                return shuffled.iterator();
            }
        };
    }

    public static void main(String[] args) {
        NonCollectionSequence ncs = new NonCollectionSequence();
        for (Pet p : ncs) {
            System.out.println(p);
        }
        System.out.println("Reversed:");
        for (Pet p : ncs.reversed()) {
            System.out.println(p);
        }
        System.out.println("Random:");
        for (Pet p : ncs.randomized()) {
            System.out.println(p);
        }
    }
}
