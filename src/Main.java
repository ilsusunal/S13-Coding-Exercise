public class Main {
    public static void main(String[] args) {
        System.out.println("FIRST PROBLEM: " + getFirstAndLastDigitSum(1234567));
        System.out.println("FIRST PROBLEM: " + getFirstAndLastDigitSum(45897));
        System.out.println("FIRST PROBLEM: " + getFirstAndLastDigitSum(874521));
        System.out.println("******************************");
        System.out.println("SECOND PROBLEM: " + hasSameLastDigit(new int[]{12, 23, 35, 16, 17}));
        System.out.println("SECOND PROBLEM: " + hasSameLastDigit(new int[]{12, 23, 35, 13, 16, 17}));
        System.out.println("SECOND PROBLEM: " + hasSameLastDigit(new int[]{10, 87, 23, 44, 56, 90}));

    }
    public static int getFirstAndLastDigitSum(int number){
        int length = String.valueOf(number).length();
        int[] digits = new int[length];
        int firstDigit;
        int lastDigit;
        for(int i = 0; i < digits.length; i++){
            digits[i] = number % 10;
            number /= 10;
        }
        firstDigit = digits[0];
        lastDigit = digits[length - 1];
        return firstDigit + lastDigit;
    }
    public static boolean hasSameLastDigit(int[] numbers){
        int[] lastDigits = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            lastDigits[i] = numbers[i] % 10;
        }
        for(int i = 0; i < lastDigits.length; i++){
            for(int j = i + 1; j < lastDigits.length; j++){
                if(lastDigits[i] == lastDigits[j]){
                    return true;
                }
            }
        }
        return false;
    }
}