public class InterDemo{
	public static void main(String[] args){
		MyData d=new MyData();
		Produce p=new Produce(d);
		Consume c=new Consume(d);
		p.start();
		c.start();
	}
}
class MyData{
	int val=0;
	boolean flag=true;
	synchronized void set(int v){
	//	System.out.println("Inside the set method");
		while(flag!=true){
                        try{
                                wait();
                        }catch(InterruptedException e){
                                System.out.println("Error");
                        }
                }
		val=v;
		flag=false;
		notify();
	}
	synchronized int get(){
	//	System.out.println("Inside the get method");
		while(flag!=false){
			try{
				wait();
			}catch(InterruptedException e){
				System.out.println("Error");
			}
		}
		int x=0;
		x=val;
		flag=true;
		notify();
		return x;
	}
}
class Consume extends Thread{
	MyData data;
	Consume(MyData d){
		data=d;
	}
	public void run(){
		while(true)
			System.out.println("Con: "+data.get());
	}
}
class Produce extends Thread{
	MyData data;
	Produce(MyData c){
		data=c;
	}
	public void run(){
		int i=0;
		while(true){
			data.set(i);
	//		System.out.println("Produce:"+i);
			i++;
		}
	}
}
