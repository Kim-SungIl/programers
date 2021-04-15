class Solution {
    public int solution(int n) {
        int answer = 1;
        // 성능 향상을 위해서 전체를 반복 할 필요 없이 중간값을 찾아서 loop를 수행한다. (연속된 자연수이므로 중간 값보다 큰 연속된 자연수로는 답을 얻을 수 없음
        for (int i = 1; i<n/2 +1; i++){
            int sum = 0;
            for (int j = i; j<n; j++){
                sum += j;
                if (sum == n) {
                    answer++;
                    break;
                }
                else if (sum > n){
                    break;
                }
            }
        }
        return answer;
    }
}
