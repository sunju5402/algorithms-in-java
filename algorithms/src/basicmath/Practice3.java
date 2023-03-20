package basicmath;

import java.util.ArrayList;

/**
 * 문제 설명
 * ---
 *
 * 문자열 s1 과 s2 가 주어졌을 때,
 * s1 을 permutation 한 문자열이 s2 의 부분 문자열에 해당하면 true 를 반환하고
 * 그렇지 않으면 false 를 반환하는 프로그램을 작성하세요.
 */
public class Practice3 {

	public static void main(String[] args) {
		// Test code
		String s1 = "ab";
		String s2 = "adbak";
		System.out.println(solution(s1, s2));
//		System.out.println(solution2(s1, s2));
		System.out.println();

		s1 = "ac";
		s2 = "car";
		System.out.println(solution(s1, s2));
//		System.out.println(solution2(s1, s2));
		System.out.println();

		s1 = "ak";
		s2 = "aabbkk";
		System.out.println(solution(s1, s2));
//		System.out.println(solution2(s1, s2));
	}

	public static boolean solution(String s1, String s2) {
		boolean[] visited = new boolean[s1.length()];
		char[] out = new char[s1.length()];
		ArrayList<String> list = new ArrayList<>();

		permutation(s1.toCharArray(), 0, s1.length(), s1.length(), visited, out, list);

		for (String s : list) {
			if (s2.contains(s)) {
				return true;
			}
		}
		return false;
	}

	public static void permutation(char[] arr, int depth, int n, int r, boolean[] visited,
		char[] out, ArrayList<String> list) {
		if (depth == r) {
			list.add(new String(out));
		}

		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				out[depth] = arr[i];
				permutation(arr, depth + 1, n, r, visited, out, list);
				visited[i] = false;
			}
		}
	}
}