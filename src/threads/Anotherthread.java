package threads;

public class Anotherthread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main thread");

		Thread thEx = new ThreadEx();
		thEx.setName(" another Thread");
		thEx.start();
		// for (int i = 0; i < 5; i++) {

		System.out.println("Running thread");
		// }

		Thread runnableEx = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Runnable example");

				try {
					thEx.join(2000);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		runnableEx.start();

	}

}
