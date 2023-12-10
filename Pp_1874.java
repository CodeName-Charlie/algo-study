package new_algo.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Yy_1874 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			int k = Integer.parseInt(br.readLine());
			arr[i] = k;
		}
		
		StringBuilder sb = new StringBuilder();
		
		Stack<Integer> stack = new Stack<>();
		int index = 0;
		int num = 1;

		while(true) { 
			stack.push(num++);
			sb.append("+").append("\n");
			
			while(!stack.isEmpty()) {
				int pop = stack.pop();
				
				if(pop == arr[index]) {
					sb.append("-").append("\n");
					index++;
					
					continue;
				} else {
					stack.push(pop);
				}
				
				if(num > n) break;
				
				stack.push(num++);
				sb.append("+").append("\n");
			}
			
			if(num > n) break;
		}

		System.out.println(stack.isEmpty() ? sb : "NO");
	}
}
