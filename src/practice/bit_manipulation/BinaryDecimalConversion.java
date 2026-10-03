package practice.bit_manipulation;

public class BinaryDecimalConversion {
    public static void main (String[] args){
        int num  = 20;
        int binary = 10100;
        System.out.println(convertDecimal2Binary(num));
        System.out.println(convertBinary2Decimal(binary));


    }

    private static String convertDecimal2Binary(int num){
        String binaryNum = "";

        while (num != 1){

            if (num % 2 == 1) binaryNum += 1; // if the remainder is 1 we put 1 if 0 we put 0 as digit
            else binaryNum += 0;

            num = num / 2; // this divides the num each time by 2 until it is 1, ex 13->6->3->1

        }
        binaryNum += 1;
        String sb = new StringBuilder(binaryNum).reverse().toString();

        return sb;


    }

    private static int convertBinary2Decimal(int num){
        String s = String.valueOf(num);
        int n =  s.length();
        int decimalNum = 0;
        for (int i = 0; i<n; i++){ // iterate through the string containing the numbers
            int bit = s.charAt(n-i-1) - '0';

            decimalNum += bit*Math.pow(2,i);

        }
        return decimalNum;
    }
}
