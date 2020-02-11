package per.sjz.demo_ajax.utils;

/**
 * 2020/2/3  11:01
 * 自有白鹿，踏歌入梦来
 */


public class StringUtils {
    public static boolean isEmpty(String s){
        if (s==null||s.trim().length()==0){
            return true;
        }
        return false;
    }
}
