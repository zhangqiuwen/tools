package abstractFactory;

/**
 * @author zhangqiuwen
 * @create 2018-01-18 17:32
 **/
public class BankHttpSenderTest {
    public static void main(String[] args) {
        String beanName = "abstractFactory.SHBankFactory";
        try {
            Class c=Class.forName(beanName);
            Object obj=c.newInstance();
            IbankFactory ibankFactory = (IbankFactory) obj;
            ibankFactory.bankHttpSender().creditApply("");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}