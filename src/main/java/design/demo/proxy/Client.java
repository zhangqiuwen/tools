package design.demo.proxy;

/**
 * @author zhangqiuwen
 * @create 2017-12-26 11:57
 **/
public class Client {
    public static void main(String[] args) {
        design.demo.proxy.IGamePlayer iGamePlayer = new design.demo.proxy.GamePlayer("张三");
        design.demo.proxy.IGamePlayer proxy  = new design.demo.proxy.GamePlayerProxy(iGamePlayer);
        //开始打游戏，记下时间戳
        System.out.println("开始时间是：2009-8-25 10:45");
        proxy.login("zhangSan");
        //开始杀怪
        proxy.killBoss();
        //升级
        proxy.upgrade();
        //记录结束游戏时间
        System.out.println("结束时间是：2009-8-26 03:40");
    }


}