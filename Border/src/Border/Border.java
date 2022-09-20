package Border;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Border {

	public static void main(String[] args) throws NumberFormatException, IOException {
        //BufferedReader
		int i,j;
		Scanner s = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        String arr[][] = new String[n][m];
        for (i=0; i<n; i++)
        	for (j=0; j<m; j++) {
        		arr[i][j] = s.nextLine();
        	}
        
        for (i=0; i<n; i++) {
        	for (j=0; j<m; j++) {
        		System.out.print(arr[i][j] + " ");
        		}
        	System.out.println();
        	}
        
	}

}
