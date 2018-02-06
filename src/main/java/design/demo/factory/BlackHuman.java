package factory;

/**
 * @author zhangqiuwen
 * @create 2018-01-22 15:06
 **/
public class BlackHuman implements Human {
    @Override
    public void talk() {
        System.out.println("黑人会说话，一般人听不懂。");
    }

    @Override
    public void skinColor() {
        System.out.println("黑色人种的皮肤颜色是黑色的！");
    }
}