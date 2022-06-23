package q2;

public class Main {

	public static void main(String[] args) {

		int mat[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };

		System.out.println("ORIGINAL");
		printMatriz(mat);

		Thread t1 = new Thread(new MMThread(mat, 0));
		Thread t2 = new Thread(new MMThread(mat, 1));
		Thread t3 = new Thread(new MMThread(mat, 2));
		t1.start();
		t2.start();
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			System.out.println("eRRo!");
		}

		System.out.println("\nINVERTIDA");
		printMatriz(mat);
	}

	private static void printMatriz(int[][] mat) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
}