import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String word = br.readLine();
		for (String s : croatia) {
			if (word.contains(s)) {
				word = word.replace(s, "A");
			}
		}
		System.out.println(word.length());
    }
}