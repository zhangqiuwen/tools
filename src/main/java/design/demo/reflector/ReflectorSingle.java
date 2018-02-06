package reflector;

/**
 * @author zhangqiuwen
 * @create 2018-01-29 18:48
 *
 * 使用单例完成反射的一次初始化
 **/
public class ReflectorSingle {

    private static final ReflectorSingle reflectorSingle = null;

    private SimulateReflectGenerator simulateReflectGenerator = null;
    private static class ReflectorSingleHolder{
        private static ReflectorSingle reflectorSingle = new ReflectorSingle();
    }
    private ReflectorSingle(){
        //生成要反射的类
        simulateReflectGenerator = new SimulateReflectGenerator();
    }

    public static ReflectorSingle getInstance(){
        return ReflectorSingleHolder.reflectorSingle;
    }

    class SimulateReflectGenerator{
        public SimulateReflectGenerator(){
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