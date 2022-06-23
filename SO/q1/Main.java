package q1;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		int vet[] = iniciaVet();

		Thread t1 = new Thread(new MyRunnable(vet, 0));
		t1.start();
		Thread t2 = new Thread(new MyRunnable(vet, 100));
		t2.start();
		Thread t3 = new Thread(new MyRunnable(vet, 200));
		t3.start();
		Thread t4 = new Thread(new MyRunnable(vet, 300));
		t4.start();
		Thread t5 = new Thread(new MyRunnable(vet, 400));
		t5.start();
		Thread t6 = new Thread(new MyRunnable(vet, 500));
		t6.start();
		Thread t7 = new Thread(new MyRunnable(vet, 600));
		t7.start();
		Thread t8 = new Thread(new MyRunnable(vet, 700));
		t8.start();
		Thread t9 = new Thread(new MyRunnable(vet, 800));
		t9.start();
		Thread t10 = new Thread(new MyRunnable(vet, 900));
		t10.start();

	}

	public static int[] iniciaVet() {
		Random random = new Random();
		int vet[] = new int[1000];
		int i;
		for (i = 0; i < 1000; i++) {
			vet[i] = random.nextInt(1000);
		}
		return vet;
	}
}