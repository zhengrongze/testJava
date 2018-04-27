package mytest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.sound.midi.Soundbank;


public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*	CaseString c2 = new CaseString();
	CaseString c1 = new CaseString();
	System.out.println(c2.equals(c1));
	
	String s = new String("abc");
	String s1 = "abc";
	System.out.println(s==s1);
	System.out.println(s.equals(s1));
	System.out.println(c2.hashCode());
	System.out.println(c1.hashCode());
	System.out.println(c1.hashCode() == c2.hashCode());*/
	/*	Map<PhoneNumber,String> map = new HashMap<PhoneNumber,String>();
		map.put(new PhoneNumber(707,867,1), "Œ“");
		String value = map.get(new PhoneNumber(707,867,1));
		System.out.println(value);
		Float f = 12.4f;
		int i = Float.floatToIntBits(f);
		System.out.println(i);
		Double d = 12.4;
		int i1 =  (int)Double.doubleToLongBits(d);
		System.out.println(i1);
		int [] a = {1,2,3};
		int [] a2 = {3,2,3};
		
		System.out.println(Arrays.hashCode(a));
		System.out.println(Arrays.hashCode(a2));*/
		Set<BigDecimal> set = new TreeSet<BigDecimal>();
		set.add(new BigDecimal("1.0"));
		set.add(new BigDecimal("1.00"));
		System.out.println(set.size());
	}
}
