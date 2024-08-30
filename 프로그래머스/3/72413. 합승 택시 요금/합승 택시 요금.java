import java.util.*;

class Solution {
    public int solution(int n, int s, int a, int b, int[][] fares) {
        int INF = 1000000000;
int[][] costs = new int[n][n];

for (int i = 0; i < n; i++) {
	Arrays.fill(costs[i], INF);
	costs[i][i] = 0;
}

for (int[] fare : fares)
	costs[fare[0] - 1][fare[1] - 1] = costs[fare[1] - 1][fare[0] - 1] = fare[2];

for (int i = 0; i < n; i++) {
	for (int j = 0; j < n; j++) {
		for (int k = 0; k < n; k++)
			costs[j][k] = Math.min(costs[j][k], costs[j][i] + costs[i][k]);
	}
}

int answer = costs[s - 1][a - 1] + costs[s - 1][b - 1];

for (int i = 0; i < n; i++) {
	if(costs[s - 1][i] != INF && costs[i][a - 1] != INF && costs[i][b - 1] != INF)
		answer = Math.min(answer, costs[s - 1][i] + costs[i][a - 1] + costs[i][b - 1]);
}

return answer;
    }
}