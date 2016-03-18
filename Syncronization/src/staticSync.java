

class Table1 {

	 synchronized static void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
			}
		}
	}
}

class MyThread11 extends Thread {
	public void run() {
		Table1.printTable(1);
	}
}

class MyThread21 extends Thread {
	public void run() {
		Table1.printTable(10);
	}
}

class MyThread3 extends Thread {
	public void run() {
		Table1.printTable(100);
	}
}

class MyThread4 extends Thread {
	public void run() {
		Table1.printTable(1000);
	}
}

public class staticSync {
	public static void main(String t[]) {
		MyThread11 t1 = new MyThread11();
		MyThread21 t2 = new MyThread21();
		MyThread3 t3 = new MyThread3();
		MyThread4 t4 = new MyThread4();
		t1.setPriority(9);
		t1.start();
		t2.start();
//		t3.start();
//		t4.start();
	}
}