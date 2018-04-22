package ua.com.juja;

/**
 * Created by Dmitriy on 4/22/2018.
 */



/**
 Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.
 changeXY("codex") → "codey"
 changeXY("xxhixx") → "yyhiyy"
 changeXY("xhixhix") → "yhiyhiy"
 */
public class ChangeXY {




    public static String changeXY(String str) {
        char[] chars = str.toCharArray();
        for (int index = 0; index < str.length(); index++) {
            if(chars[index] == 'x'){
                chars[index] = 'y';
            }
        }
        String result = String.valueOf(chars);
        return result;
    }
}
