package observe;

/**
 * @author zhangqiuwen
 * @create 2018-01-02 18:56
 * 观察者接收到消息后，即进行update（更新方法）操作，对接收到的信息进行处理
 **/
public interface Observer {
    //一发现别人有动静，自己也要行动起来
    public void update(String context);
}