package abstractFactory;

public interface IBankHttpSender {

    /**
     * 数字钱包申请
     *
     * @param account
     * @return
     */
    void digCashAddressApply(String account);

    /**
     * 授信申请
     *
     * @param creditInfo
     * @return
     */
    void creditApply(String creditInfo);
}
