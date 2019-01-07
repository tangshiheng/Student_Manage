package libai.stu_man.util;

public class TextUtil {
	/**
	 * 判断给定的字符串是否为空
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str){
		if(str == null || str.length()==0){
			return true;
		}
		return false;
	}
}
