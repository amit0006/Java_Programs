//Practicing variable argument in which method overloading is possible by writing one method definition also
public class Varargs{
	static void show(int ...x){
		for(int a:x)
			System.out.println(a);
	}
	public static void main(String[] args){
		show();
		show(10,20);
		show(10,10,10,101,10,10,109);
	}
}
