public class Question3{
  public static void main(String[]args){
  }
}

class ThreadA extends Thread {
	void run() {
		for(int i=0;i<1000;i++){
			System.out.println("ThreadA");
			Thread.sleep(1000);
		}
	}
}