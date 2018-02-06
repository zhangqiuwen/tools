package design.demo.proxy;

/**
 * @author zhangqiuwen
 * @create 2017-12-26 11:43
 **/
public class GamePlayerProxy implements design.demo.proxy.IGamePlayer {
    private design.demo.proxy.IGamePlayer gamePlayer = null;
    public GamePlayerProxy(design.demo.proxy.IGamePlayer iGamePlayer){
      this.gamePlayer = iGamePlayer;
    }

    @Override
    public void login(String user) {
      this.gamePlayer.login(user);
    }
    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }
    @Override
    public void upgrade() {
    this.gamePlayer.upgrade();
    }
}