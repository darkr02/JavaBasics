package javaBasics;

public class ThreadsUsingThreadClass {


		public static void main(String[] args) {

			C obj1=new C();
			D obj2=new D();

			obj1.start();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			obj2.start();


		}
	}


	class C extends Thread
	{
		public void run() {
			for(int i=5;i>=1;i--)
			{
				System.out.println("Krish");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	class D extends Thread
	{
		public void run() {
			for(int i=5;i>=1;i--)
			{
				System.out.println("Daripa");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}