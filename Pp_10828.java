package new_algo.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Yy_10828 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		Stack<String> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String input = st.nextToken();
			
			switch (input) {
			case "push":
				stack.push(st.nextToken());
				break;
			case "pop" :
				sb.append(stack.isEmpty() ? "-1" : stack.pop()).append("\n");
				break;
			case "size" :
				sb.append(stack.size()).append("\n");
				break;
			case "empty" :
				sb.append(stack.isEmpty() ? "1" : "0").append("\n");
				break;
			case "top" :
				sb.append(stack.isEmpty() ? "-1" : stack.push(stack.pop())).append("\n");
				break;
			}
		}
		
		System.out.println(sb);
		
	}
}
