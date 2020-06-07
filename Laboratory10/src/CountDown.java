public class CountDown implements Runnable{
	private static int ID = 0;
	public void run(){
		ID++;
		for(int i = 7;i>0;i--) {
		try {
				System.out.println("Task " + ID + ", Count = " + i);
				Thread.sleep(1000);
				Thread.yield();
			}
			catch(InterruptedException e){
				System.out.println("Interruption has stopped the proccess");
			}
		}
	}
}
