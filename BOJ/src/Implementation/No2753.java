//No2753_윤년_정답
package Implementation;
import java.io.*;
public class No2753 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		if((n % 4 == 0 && n % 100 != 0) || (n % 4 == 0 && n % 400 == 0)) 
			System.out.println("1");
		else System.out.println("0");
	}
}