package factory;

/**
 * @author zhangqiuwen
 * @create 2018-01-22 15:04
 **/
public class WhiteHuman implements Human{
    @Override
    public void talk() {
        System.out.println("白色人种会说话，一般都是但是单字节。");
    }

    @Override
    public void skinColor() {
        System.out.println("白色人种的皮肤颜色是黄色的！");
    }
}