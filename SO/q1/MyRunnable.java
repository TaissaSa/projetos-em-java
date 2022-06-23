package q1;

public class MyRunnable implements Runnable {
	int vet[];
	int print[];
	int count;

	public MyRunnable(int[] vet, int count) {
		super();
		this.vet = vet;
		this.count = count;
	}

	@Override
	public void run() {
		print = new int[1000];
		int j = 0;
		for (int i = count; i < count + 100; i++) {
			if (vet[i] % 3 == 0 && vet[i] % 7 == 0) {
				print[j++] = vet[i];
				System.out.println("Thread: " + count + " Valor do vetor: " + print[j-1]);
			}
		}
	}
}