/**
 * Created by XuChen on 2017/9/7.
 * Description:  这里还存在问题,书上的addList函数传递的并非数组，那么run函数如何能读取到eventList中的对象？
 */
public class GreenHouseController {
    public static void main(String[] args) {
        GreenHouseControls controls = new GreenHouseControls();
//        controls.addList(controls.new LightOn(500));
        Event[] eventsList = {
                controls.new LightOn(200),
                controls.new FanOn(100),
                controls.new LightOff(300),
                controls.new FanOff(400)
        };
        controls.addList(eventsList);
        controls.run();
    }
}
