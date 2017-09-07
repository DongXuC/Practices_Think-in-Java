import java.util.ArrayList;
import java.util.List;

/**
 * Created by XuChen on 2017/9/7.
 * Description:
 */
public class Controller {
    private List<Event> eventList = new ArrayList<Event>();

    public void addList(Event e[]) {
        for (Event e1:e){
            eventList.add(e1);
        }
    }

    public void run() {
        while (eventList.size() > 0) {
            for (Event e : new ArrayList<Event>(eventList)) {      /*这里创建一个副本，以防原始数据被修改*/
                if (e.ready()) {
                    System.out.println(e);          /*如果event准备好，则运行action，event中的start其实
                                                    应该由外部的硬件触发*/
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }
}
