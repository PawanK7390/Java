public class SubtractProductAndSum {
    public static void main(String[] args) {
        SubtractProductAndSum sps = new SubtractProductAndSum();
        int result = sps.subtractProductAndSum(16);
        System.out.println(result);
    }

    public int subtractProductAndSum(int n) {
        return product(n) - sum(n);
    }

    public int product(int n){
        int product = 1;
        while(n > 0){
            int lastDigit = n % 10;
            n /= 10;
            product *= lastDigit;
        }
        return product;
    }

    public int sum(int n){
        int sum = 0;
        while(n > 0){
            int lastDigit = n % 10;
            n /= 10;
            sum += lastDigit;
        }
        return sum;
    }
}
