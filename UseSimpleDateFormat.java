package day0703;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Date 객체를 입력받아 원하는 날짜형식으로 반환하는 SimpleDateFormat의 사용.
 * @author USER
 */
public class UseSimpleDateFormat {

	public UseSimpleDateFormat() {
		Date date = new Date();
		System.out.println( date );// 원하지 않는 날짜형삭 출력 => Date클래스의 method는 비추천 => SimpleDateFormat을 사용
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy a HH(hh,KK,kk):mm:ss EEEE");
		String value = sdf.format(date);// has a 관계
		System.out.println(value);
		
		//다른 나라의 날짜 형식
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM-dd-yyyy a HH(hh,KK,kk):mm:ss EEEE E",Locale.US);
		String value2 = sdf2.format(date);// has a 관계
		System.out.println(value2);
	}
	
	public static void main(String[] args) {
		new UseSimpleDateFormat();
	
	}

}
