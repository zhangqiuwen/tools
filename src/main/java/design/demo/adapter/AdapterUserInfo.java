package adapter;

/**
 * @author zhangqiuwen
 * @create 2017-12-27 16:59
 * 适配器模式是根据业务拓展，在现有的基础引入了一些原本不合适的模型接口
 * 而适配器则通过关联或者继承新的模型接口，并实现高层的统一调用接口，组装成一个适合的目标接口
 **/
public class AdapterUserInfo implements IUserInfo {
    private IOutUserBaseInfo iOutUserBaseInfo = null;
    private IOutUserHomeInfo iOutUserHomeInfo = null;
    public AdapterUserInfo(IOutUserBaseInfo iOutUserBaseInfo, IOutUserHomeInfo iOutUserHomeInfo){
      this.iOutUserBaseInfo = iOutUserBaseInfo;
      this.iOutUserHomeInfo = iOutUserHomeInfo;
    }
    @Override
    public void getMobile() {
        System.out.println(iOutUserBaseInfo.getMobilePhone());
    }

    @Override
    public void getAddress() {
        System.out.println(iOutUserHomeInfo.getAddress());
    }
}