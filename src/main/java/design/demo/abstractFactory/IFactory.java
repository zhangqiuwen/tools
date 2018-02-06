package abstractFactory;

/**
 * 抽象工厂
 *
 * @author zhangqiuwen
 * @create 2018-01-18 15:08
 **/
public interface IFactory {
    IBankHttpSender getBankHttpSender(String bankName);
}