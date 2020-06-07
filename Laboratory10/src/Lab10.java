import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Lab10 {
	public static void main(String[] args) {
		Executor exectuor = Executors.newFixedThreadPool(4);
		 //CountDown[] myTask = new CountDown[6];
	      //  FishingLine finish = new FishingLine();
		 	
		 	exectuor.execute (new CountDown());
		 	exectuor.execute (new CountDown());
		 	exectuor.execute (new CountDown());
		 	exectuor.execute (new CountDown());
		 	exectuor.execute (new CountDown());
		 	exectuor.execute (new CountDown());

		}

}
