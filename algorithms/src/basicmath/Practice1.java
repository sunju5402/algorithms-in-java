package basicmath;

import java.util.ArrayList;

// 파스칼의 삼각형
public class Practice1 {

	public static void main(String[] args) {
		// Test code
		System.out.println(solution(1));
		System.out.println(solution(2));
		System.out.println(solution(3));
		System.out.println(solution(4));
		System.out.println(solution(5));
	}

	public static ArrayList<ArrayList<Integer>> solution(int numRows) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();

		ArrayList<Integer> list;
		int x;
		int y;
		for (int i = 0; i < numRows; i++) {
			list = new ArrayList<>();

			for (int j = 0; j < i + 1; j++) {
				if (j == 0 || j == i) {
					list.add(1);
				} else {
					x = result.get(i - 1).get(j - 1);
					y = result.get(i - 1).get(j);
					list.add(x + y);
				}
			}
			result.add(list);
		}
		return result;
	}
}