/**
 * Created by XuChen on 2017/9/7.
 * Description:
 */
public abstract class Event {
    private long eventTime;
    protected final long delayTime;

    public Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }

    public void start() {
        eventTime = System.nanoTime() + delayTime;      /*每次start都会更新eventTime*/
    }

    public boolean ready() {
        return System.nanoTime() >= eventTime;          /*如果还在延时时间内，则没准备好*/
    }

    public abstract void action();
}
