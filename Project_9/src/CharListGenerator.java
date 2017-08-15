import java.io.IOException;
import java.nio.CharBuffer;
import java.nio.ReadOnlyBufferException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by XuChen on 2017/8/14.
 */
public class CharListGenerator {
    int len;
    CharListGenerator(){
        this.len=10;
    }
    CharListGenerator(int len){
        this.len=len;
    }
    private final char alphabet[]="abcdefghijklmnopqrstuvwxyz".toCharArray();

    Random random=new Random();
    char[] generate(){
        char buff[]=new char[len];
        for (int i=0;i<len;++i){
            buff[i]=alphabet[random.nextInt(alphabet.length)];
        }
        return buff;
    }
}

class CharListAdapted extends CharListGenerator implements Readable{
    private int count;
    CharListAdapted(int i,int n){
        this.count=i;
        super.len=n;
    }
    /**
     * Attempts to read characters into the specified character buffer.
     * The buffer is used as a repository of characters as-is: the only
     * changes made are the results of a put operation. No flipping or
     * rewinding of the buffer is performed.
     *
     * @param cb the buffer to read characters into
     * @return The number of {@code char} values added to the buffer,
     * or -1 if this source of characters is at its end
     * @throws IOException             if an I/O error occurs
     * @throws NullPointerException    if cb is null
     * @throws ReadOnlyBufferException if cb is a read only buffer
     */
    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count--==0){
            return -1;
        }
        char []buff=generate();
        cb.put(buff);
        return buff.length;
    }

    public static void main(String[] args) {
//        CharListAdapted test=new CharListAdapted(10,20);
//        System.out.println(test.generate());
//        System.out.println(test.len);
        Scanner scanner=new Scanner(new CharListAdapted(5,5));
//        System.out.println(scanner.next());
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }
}
