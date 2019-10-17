package eva.evatest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 方银剑
 * @Title: ListOperation
 * @ProjectName eva-test
 * @Description: TODO
 * @date 2019/10/17
 */
public class ListOperation {

    public static void main(String[] args) {
//        addList();
//        asList();
//        subList();
        List<String> list = new ArrayList<>();
        list.add("123456");
        add(list);
        System.out.println(list);
    }

    public static void add(List<String> list){
        list.add("over");
        list = new ArrayList<String>();
        list.add("abcdefg");
    }

    public static void addList(){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        for (String s : list) {
            if(s.equals("a")){
                list.add("c");
            }
        }
        System.out.println(list.toString());

    }

    public static void asList(){
        List<String> list = Arrays.asList("a", "b", "c");
//        List arrList = new ArrayList(list);
        list.add("d");
        System.out.println(list);

    }

    public static void subList(){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        List<String> strings = list.subList(0, 1);
        strings.add("c");
        System.out.println(strings);

    }

}
