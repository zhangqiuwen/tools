package factory;

/**
 * @author zhangqiuwen
 * @create 2018-01-22 15:05
 **/
public class YellowHuman implements Human{
    @Override
    public void talk() {
        System.out.println("黄色人种会说话，一般说的都是双字节。");
    }

    @Override
    public void skinColor() {
        System.out.println("黄色人种的皮肤颜色是黄色的！");
    }
}