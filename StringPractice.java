public class StringPractice
{
	public static void main(String[] args)
	{
		String str1="Java Programs";  //Memory allocated in the Pool(Method Area)
		String str2=new String("Java");  //Memory allocated in the heap memory
		char c[]={'H','E','L','L','O'};
		String str3=new String(c);   //Memory allocated in heap memory
		byte b[]={65,66,67,68,69};  
		String str4=new String(b);   //Memory allocated in heap memory\
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}
}
