package design.demo.template;

/**
 * @author zhangqiuwen
 * @create 2018-01-02 15:39
 *  抽象模板类
 **/
public  abstract  class HummerModel {
    //基本方法
    public abstract void start();
    //基本方法
    public abstract void stop();
    //基本方法
    public abstract void alarm();
    //基本方法
    public abstract void engineBoom();
    //模板方法
    public void run(){
        this.start();
        this.engineBoom();
        this.alarm();
        this.stop();
    }
    //钩子方法
    protected boolean isAlarm(){
        return true;
    }
}