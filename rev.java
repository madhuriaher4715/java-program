public class rev {
   
    public int reverse(int num) {
        int reverse = 0; 
        while (num > 0) {
            int  n = num % 10;
            reverse = reverse * 10 + n;
            num = num / 10;
        }
        return reverse;
    }

    
    public static void main(String[] args) {
        rev n = new rev(); 
        int reversedNumber = n.reverse(123); 
        System.out.println("Reversed number: " + reversedNumber); 
    }
}
