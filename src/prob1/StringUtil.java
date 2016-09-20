package prob1;

public class StringUtil {
	static String tmp = "";
    public static String concatenate( String[] str ){
        //문자열을 결합하여 리턴하는 메소드 구현
    	for(String i : str) {
//    		tmp += i;
    		tmp = tmp.concat(i);
    	}
    	return tmp;
    }
}

