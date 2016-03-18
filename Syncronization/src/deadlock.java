



class myThread extends Thread {
	
	public synchronized void run() {
		
		for(int i =1;i<6;i++) {
			System.out.println(""+i);
			try {
				currentThread();
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
public class deadlock {

	public static void main(String[] args) throws InterruptedException {

		myThread t1 = new myThread();
		myThread t2 = new myThread();
		
		t1.start();
		t2.start();
		

	}

}
