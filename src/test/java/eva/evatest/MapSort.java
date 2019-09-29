package eva.evatest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author 方银剑
 * @Title: MapSort
 * @ProjectName eva-test
 * @Description: TODO
 * @date 2019/9/29
 */
public class MapSort {

    /**
      * @Description: 输入字符串记录出现次数并排序，包含map排序
      * @Param: 
      * @return: 
    　* @date 2019/9/29
    　*/
    public static void main(String[] args) {
        String src = "aaa22444425666";
        if(null != src && src.length() > 0){
            String[] split = src.split("");
            Map<String,Integer> smap = new HashMap<>();
            for (String s : split) {
                if(smap.get(s)==null){
                    smap.put(s,1);
                }else{
                    smap.put(s,smap.get(s)+1);
                }
            }
            List<Map.Entry<String, Integer>> collect = smap.entrySet().stream().sorted((p1, p2) -> (p1.getValue() - p2.getValue())).collect(Collectors.toList());
            for (Map.Entry<String, Integer> a:collect) {
                System.out.println(a.getKey() + ":" + a.getValue());
            }
        }
    }

}
