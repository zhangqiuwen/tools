package template;

/**
 * @author zhangqiuwen
 * @create 2018-01-02 17:05
 **/
public class HummerH2Model {
    protected void alarm() {
        System.out.println("悍马H2鸣笛...");
    }
    protected void engineBoom() {
        System.out.println("悍马H2引擎声音是这样的...");
    }
    protected void start() {
        System.out.println("悍马H2发动...");
    }
    protected void stop() {
        System.out.println("悍马H2停车...");
    }
    //默认没有喇叭的
    protected boolean isAlarm() {
        return false;
    }
}