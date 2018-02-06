package proxy;

/**
 * @author zhangqiuwen
 * @create 2017-12-26 11:43
 **/
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;
    public GamePlayerProxy(IGamePlayer iGamePlayer){
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