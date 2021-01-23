package threads;

public class ThreadEx extends Thread {

	public void run() {
		// for (int i = 0; i < 5; i++) {
       System.out.println("hellpo from"+currentThread().getName());
	  try {
		Thread.sleep(MIN_PRIORITY);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("another thread woke me up");
    return;
	}
       
       
       System.out.println("thread Example");

		// }
	}

}
