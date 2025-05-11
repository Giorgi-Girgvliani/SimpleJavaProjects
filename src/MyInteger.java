//10.3
public class MyInteger {
    private int value;
    MyInteger(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public  boolean isEven(){
        return value%2 == 1;
    }

    public boolean isOdd(){
        return value%2 == 0;
    }

    public boolean isPrime(){

        if (value < 0) return false;

        for (int i = 2; i < Math.sqrt(value); i++){
            if (value%i==0) return false;
        }
        return true;
    }

    public static boolean isEven(int value){
        return value%2 == 1;
    }

    public static boolean isOdd(int value){
        return value%2 == 0;
    }

    public static boolean isPrime(int value){

        if (value < 0) return false;

        for (int i = 2; i < Math.sqrt(value); i++){
            if (value%i==0) return false;
        }
        return true;
    }

    public static boolean isEven(MyInteger myInteger){
        return myInteger.isEven();
    }

    public static boolean isOdd(MyInteger myInteger){
        return myInteger.isOdd();
    }

    public static boolean isPrime(MyInteger myInteger){
        return myInteger.isPrime();
    }

    public static int parseInt(char[] chars){
        StringBuilder numString = new StringBuilder();
        for (Character ch: chars){
            numString.append(ch);
        }
        return Integer.parseInt(numString.toString());
    }
    public static int parseInt(String s){
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        MyInteger even_prime = new MyInteger(13);
        MyInteger even = new MyInteger(21);
        MyInteger odd = new MyInteger(10);
        System.out.println(" Check if even is even: " + even.isEven() + "\n Check if odd is odd: " + odd.isOdd() +
                            "\n Check if odd is prime: " + odd.isPrime() +
                            "\n Check if even_prime is prime: " + even_prime.isPrime() +
                            "\n Check if not prime is prime: " + odd.isPrime() +
                            "\n Check if 11 is prime: " + isPrime(11) +
                            "\n Check if 12 is prime: " + isPrime(12) +
                            "\n Check if 1 is odd || Check if 1 is even: " + isOdd(1) + " || " + isEven(1) +
                            "Parse {'1','2','3','4','5'} into int: " + parseInt(new char[]{'1','2','3','4','5'}));
    }
}
