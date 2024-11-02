public class addDigits {
    public static void main(String[] args) {
        System.out.println(solution(38));
        //Expected output: 2
        System.out.println(solution(0));
        //Expected output: 0
    }
    public static int solution(int num) {
        if(num/10==0){
            return num;
        }
        else{
            int sum = 0;
            while(num != 0){
                sum += num%10;
                num /= 10;
            }
            return solution(sum);
        }
    }
}