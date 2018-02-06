package design.demo.proxy;

import lombok.Data;

/**
 * @author zhangqiuwen
 * @create 2017-12-26 11:50
 **/
@Data
public class GamePlayer implements design.demo.proxy.IGamePlayer {
    private String name="";

    public GamePlayer(String name){
        this.name = name;
    }
    @Override
    public void login(String user) {
        System.out.println("登录名为"+user+"的用户"+this.name+"登录成功！");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "在打怪！");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + " 又升了一级！");
    }
}