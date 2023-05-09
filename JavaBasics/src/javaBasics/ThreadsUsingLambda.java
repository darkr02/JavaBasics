package javaBasics;

public class ThreadsUsingLambda {

	public static void main(String[] args) throws InterruptedException {

		//Using lambda expression and anonymous class
		Thread t1 = new Thread(() -> 
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Krish");
				try {Thread.sleep(1000);} catch (Exception e) {}
			}

		},"1st thread");
		Thread t2 = new Thread(() ->{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Daripa");
				try {Thread.sleep(1000);} catch (Exception e) {}
			}


		},"2nd thread");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		//One way of setting thread name
//		t1.setName("1st Thread");
//		t2.setName("2nd Thread");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		t1.start();
		try {Thread.sleep(10);} catch (Exception e) {}
		t2.start();
		
		//Join will ask the main thread to wait until 
		//t1 and t2 threads job is done
		t1.join();
		t2.join();
		
		//Once thread job is done it will be dead
		System.out.println("Is t1 thread alive? "+t1.isAlive());
		System.out.println("Bye");
	}
}