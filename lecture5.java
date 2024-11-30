class lecture5 { // recursion program
    static int fact(int a) { // calculate factorial
        if (a == 1) { // base class
            return 1;
        } else {
            return a * fact(a - 1); // method call itself a-1
        }
    }

    public static void main(String[] args) {
        int a = 10, b = fact(a); // b intializate as result
        System.out.println("factorial" + b);
    }

}

// output 10*9*8*7*6*5*4*3*2*1=3628800