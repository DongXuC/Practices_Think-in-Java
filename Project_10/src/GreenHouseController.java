/**
 * Created by XuChen on 2017/9/7.
 * Description:  这里还存在问题
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
