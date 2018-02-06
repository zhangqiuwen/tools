package observe;

import java.util.Observable;
import java.util.Observer;
/**
 * @author zhangqiuwen
 * @create 2018-01-02 18:58
 **/
//public class LiSi implements Observer{
//    //首先李斯是个观察者，一旦韩非子有活动，他就知道，他就要向老板汇报
//    @Override
//    public void update(String str){
//        System.out.println("李斯：观察到韩非子活动，开始向老板汇报了...");
//        this.reportToQinShiHuang(str);
//        System.out.println("李斯：汇报完毕...\n");
//    }
//    //汇报给秦始皇
//    private void reportToQinShiHuang(String reportContext){
//        System.out.println("李斯：报告，秦老板！韩非子有活动了-->"+reportContext);
//    }
//}
public class  LiSi implements Observer{

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("李斯：观察到韩非子活动，开始向老板汇报了...");
        this.reportToQinShiHuang(arg.toString());
        System.out.println("李斯：汇报完毕...\n");
    }

    private void reportToQinShiHuang(String reportContext){
        System.out.println("李斯：报告，秦老板！韩非子有活动了--->"+reportContext);
    }
}