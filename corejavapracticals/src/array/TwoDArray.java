package array;

public class TwoDArray {
	
	public static void main(String[] args) {

		int[][] table = new int[10][10];
//Har baar nayi row ke liye
		for (int i = 0; i < table.length; i++) { // ROW
//Ek row me 10 columns fill honge
			for (int j = 0; j < table.length; j++) {// COLUMN

				table[i][j] = (i + 1) * (j + 1);

				System.out.print(table[i][j] + " \t");

			}

			System.out.println();
		}


}
}
