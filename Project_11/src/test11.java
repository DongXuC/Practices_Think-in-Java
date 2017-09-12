import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by XuChen on 2017/9/12.
 * Description: 注意以容器为参数，则要看清容器所装的类型
 */
class Show{
    void print(Collection<Pet> collection){
        Iterator<Pet> it=collection.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

public class test11 {
    public static void main(String[] args) {
        Collection<Pet> pets= Pets.arrayList(10);
        Show show=new Show();

        show.print(pets);
    }
}
