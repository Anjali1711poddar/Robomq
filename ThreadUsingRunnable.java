package assignment3;

public class ThreadUsingRunnable  implements Runnable{
	
	
	public void run(){  
		System.out.println("thread is running...");  
		}  
		  
		public static void main(String args[]){  
			ThreadUsingRunnable m1=new ThreadUsingRunnable();  
		Thread t1 =new Thread(m1);  
		t1.start();  
		 }  

}
