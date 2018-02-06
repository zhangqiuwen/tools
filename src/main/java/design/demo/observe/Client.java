package observe;

import java.util.Observer;
/**
 * @author zhangqiuwen
 * @create 2018-01-02 18:58
 * 观察者模式：定义对象间一种一对多的依赖关系，使得每当一个对象改变状态，依赖他的所有对象都会得到通知并被自动更新
 **/
public class Client {
    public static void main(String[] args) {
        Observer liSi = new LiSi();
        HanFeiZi hanFeiZi = new HanFeiZi();
//我们后人根据历史，描述这个场景，有三个人在观察韩非子
        hanFeiZi.addObserver(liSi);
        hanFeiZi.haveBreakfast();
    }
}