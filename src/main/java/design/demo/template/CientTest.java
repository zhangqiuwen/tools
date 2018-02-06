package design.demo.template;

import java.time.Clock;

/**
 * @author zhangqiuwen
 * @create 2018-01-02 15:41
 * 模板方法模式：定义一个操作的算法框架，将一些步骤的具体实现延迟到子类中，是的子类在不改变算法结构即可以重定义该算法的某些步骤
 * 模板方法中可以使用钩子方法来来影响模板的方法的执行
 **/
public class CientTest {
    public static void main(String[] args) {
        design.demo.template.HummerModel h1 = new design.demo.template.HummerH1Model();
        h1.run();
        Clock clock = Clock.systemUTC();
        System.out.println(clock.millis());
        System.out.println(clock.instant());
        System.out.println(clock.getZone());
    }
}