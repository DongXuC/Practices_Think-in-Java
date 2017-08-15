/**
 * Created by XuChen on 2017/8/13.
 */

interface Processor {
    String name();

    Object process(Object input);
}

class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using processor " + p.name());
        System.out.println(p.process(s));
    }
}

class Swapper {
    public static String swap(String s) {
        StringBuilder sb = new StringBuilder(s);     /* 对字符串内容进行修改*/
//        if ((sb.length()) % 2 == 0) {                 不需要进行判断，i+=2可自行判断
            for (int i = 0; i < sb.length(); i += 2) {
                char a1 = sb.charAt(i);
                char a2 = sb.charAt(i + 1);
                sb.setCharAt(i, a2);
                sb.setCharAt(i + 1, a1);
            }
//        }
        /*else {
            for (int i = 0; i < sb.length() - 1; i += 2) {
                char a1 = sb.charAt(i);
                char a2 = sb.charAt(i + 1);
                sb.setCharAt(i, a2);
                sb.setCharAt(i + 1, a1);
            }
        }*/
        return sb.toString();           /*需要将StringBuilder转化为字符串对象*/
    }
}

class SwapperAdapter implements Processor {          /*为了Apply.process能够以Swapper对象作为参数，
                                                    且不修改Swapper代码，加入适配器（implement Process）*/
    Swapper swapper = new Swapper();

    @Override
    public String name() {
        return swapper.getClass().getSimpleName();
    }

    @Override
    public Object process(Object input) {
        return swapper.swap((String) input);
    }
}

public class TestProcessor {
    public static void main(String[] args) {
        SwapperAdapter test = new SwapperAdapter();
        String s="Hello world!";

        Apply.process(test, s);
    }
}
