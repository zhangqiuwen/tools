package template;

/**
 * @author zhangqiuwen
 * @create 2018-01-02 15:41
 **/
public class HummerH1Model extends HummerModel {
    private boolean alarmFlag = true; //要响喇叭
    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void alarm() {

    }

    @Override
    public void engineBoom() {

    }

    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }
    //要不要响喇叭，是由客户来决定的
    public void setAlarm(boolean isAlarm){
        this.alarmFlag = isAlarm;
    }
}