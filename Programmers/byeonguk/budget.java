import java.util.Arrays;

class budget {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int result = 0;

        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            if (budget < 0) {
                break;
            } else {
                result += 1;
            }
        }
        return result;
    }
}