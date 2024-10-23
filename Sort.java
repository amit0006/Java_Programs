//A JAVA program to sort the array of strings using sort() method whihc is under Arrays package 
import java.util.*;
public class Sort{
	public static void main(String[] args){
		String s[]={"java","basic","neutral","car","bike"};
		/*java.util.*/Arrays.sort(s);
		for(String x:s)
			System.out.println(x);
	}
}
