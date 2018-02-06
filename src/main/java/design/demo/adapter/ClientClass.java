package adapter;

/**
 * @author zhangqiuwen
 * @create 2017-12-27 16:59
 **/
public class ClientClass {
    public static void main(String[] args) {
        IOutUserHomeInfo iOutUserHomeInfo = new OutUserHomeInfo();
        IOutUserBaseInfo iOutUserBaseInfo = new OutBaseUserInfo();
        IUserInfo userInfo = new AdapterUserInfo(iOutUserBaseInfo,iOutUserHomeInfo);
        userInfo.getAddress();
        userInfo.getMobile();
    }
}