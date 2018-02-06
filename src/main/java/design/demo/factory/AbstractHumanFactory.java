package factory;

/**
 * @author zhangqiuwen
 * @create 2018-01-22 10:47
 **/
public abstract  class AbstractHumanFactory {
    /**
     * 泛型的作用：减少类之间对象的转换，约束输入参数的类型
     * @param <T>
     * @return
     */
    public abstract  <T extends Human> T createHuman(Class<T> c);
}