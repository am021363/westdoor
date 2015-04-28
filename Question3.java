public class Question3{
  public static void main(String[]args){
  }
}

class ThreadB implements Runnable{ 
	public void run(){
		int i;
		for(i=0;i<1000;i++){
		System.out.println("ThreadB");
		Thread.sleep(1000);
		}
	}
}
