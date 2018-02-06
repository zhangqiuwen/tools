package observe;

import java.util.Observable;

/**
 * @author zhangqiuwen
 * @create 2018-01-02 18:55
 *  //jdk中已经给我们封装好了关于观察者模式的实体类行
 **/
public class HanFeiZi extends Observable implements  IHanFeiZi{
//    private ArrayList<Observer> observerList = new ArrayList<Observer>();
    @Override
    public void haveBreakfast() {
        System.out.println("我要吃早饭");
        this.setChanged();
        this.notifyObservers("韩非子要吃早饭了");
    }

    @Override
    public void haveFun() {
        System.out.println("我要娱乐");
        this.notifyObservers("韩非子要娱乐了");
    }


//    @Override
//    public void addObserver(Observer observer) {
//        this.observerList.add(observer);
//    }
//
//    @Override
//    public void deleteObserver(Observer observer) {
//        this.observerList.remove(observer);
//    }
//
//    @Override
//    public void notifyObservers(String context) {
//        for(Observer observer:observerList){
//            observer.update(context);
//        }
//    }
}