package common.gsonutil;

import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangqiuwen
 * @create 2018-02-06 15:43
 **/
public class TestGson {


    public static void main(String[] args) {
        //object 转换为string
        Book book = new Book();
        book.setId("1");
        book.setName("zhangqiuqiu");
        String jsonstr = GsonUtils.toJsonString(book);
        System.out.println(jsonstr);
        //String转换为object
        Book bookReflect = GsonUtils.fromJsonString(jsonstr,Book.class);
        //将list转换为jsonstr
        List<Book> lists = new ArrayList<>();
        lists.add(book);
        lists.add(bookReflect);
        String jsonarray = GsonUtils.toJsonString(lists);
        System.out.println(jsonarray);
        //将jsonarray 转换成带泛型的list，借助typeToken类，定义最后直接要转换的类型
        Type type = new TypeToken<List<Book>>() {}.getType();
        List<Book> books = GsonUtils.fromJsonString(jsonarray,type);
        System.out.println(books.get(0).getId());

    }
}