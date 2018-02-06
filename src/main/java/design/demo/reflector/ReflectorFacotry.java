package design.demo.reflector;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author zhangqiuwen
 * @create 2018-01-29 18:21
 *
 * 将需要的反射放入到缓存中
 **/
public class ReflectorFacotry {
    private boolean cacheEnable = true;
    private ConcurrentMap<Object,Object>  reflectMap = new ConcurrentHashMap<>();

    public Object findForType(Object o){
        //是否开启缓存
        if(this.cacheEnable){
            //从缓存中获取o的值
           Object reflectObject = this.reflectMap.get(o);
           //判断o是否存在缓存中
           if(reflectObject == null){
               reflectObject = new SimulateReflectGenerator(o);
           }
           this.reflectMap.put(o,reflectObject);
           return  reflectObject;
        }else{
            //不开启缓存
            return  new SimulateReflectGenerator(o);
        }
    }

    /**
     * 模拟要生成的反射工具类
     */
    class SimulateReflectGenerator{
        public SimulateReflectGenerator(Object o){
            this.addDefaultConstructor();
            this.addGetMethods();
            this.addSetMethods();
            this.addFields();
        }
        public void addDefaultConstructor(){}
        public void addGetMethods(){}
        public void addSetMethods(){}
        public void addFields(){}
    }
}