package codility;

import java.util.LinkedList;
import java.util.Queue;

public class Toptal {

	public static int solution(String S, String C) {
		// write your code in Java SE 8
		String[] lines = S.split("\\r?\\n");
		String[] headers = lines[0].split("\\s*,\\s*");
		int cIdx = -1;

		// find the headers index
		for (int i = 0; i < headers.length; i++) {
			if (C.equalsIgnoreCase(headers[i])) {
				cIdx = i;
				break;
			}
		}

		int max = Integer.MIN_VALUE;
//		lines[0] = "";
		for (int j = 1; j < lines.length; j++) {

			String[] contents = lines[j].split("\\s*,\\s*");
			if (contents.length > 1) {
				if (Integer.parseInt(contents[cIdx]) > max) {
					max = Integer.parseInt(contents[cIdx]);
				}
			}
		}
		return max;
	}
	
	static int solution2 (int[] A){
        int n = A.length;
        int sum = 0;
        int answer = 0;
        Queue<Integer> expenses = new LinkedList<>();
        for (int i = 0; i < n; i++){
            if(A[i] >= 0){
                sum += A[i];
            } else {
                expenses.add(A[i]);
                sum += A[i];
                if(sum < 0){
                    int maxExp = expenses.peek();
                    expenses.poll();
                    answer++;
                    sum += Math.abs(maxExp);
                }

            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		String S = "area,land\n3722,CN\n6612,RU\n3855,CA\n3797,USA";
		String C = "area";
		
		System.out.println(solution(S, C));
	}
}
