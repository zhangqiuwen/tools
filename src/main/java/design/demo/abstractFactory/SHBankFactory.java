package abstractFactory;

/**
 * @author zhangqiuwen
 * @create 2018-01-18 17:31
 **/
public class SHBankFactory implements IbankFactory {

    @Override
    public IBankHttpSender bankHttpSender() {
        return new SHBankHttpSender();
    }
}