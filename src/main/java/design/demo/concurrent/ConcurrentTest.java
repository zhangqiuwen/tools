package concurrent;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author zhangqiuwen
 * @create 2018-01-29 17:44
 **/
public class ConcurrentTest {
    public static void main(String[] args) {
        ConcurrentMap map = new ConcurrentHashMap();
        map.put("a","b");
        map.put("a","a");
        map.put("ab","ab");
        map.remove("a","a");
        System.out.println(map.size());
    }
}