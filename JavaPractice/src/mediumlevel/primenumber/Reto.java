package mediumlevel.primenumber;

public class Reto {

    /*
     * Find list of Prime numbers from number 2 to 1 million.
     * Try the best solution as possible.Which will take less CPU life cycle.
     * Out put number of Prime numbers on the given range.
     *
     *
     * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
     *
     */
    public static void main(String[] args) {
        Reto.primeNum(23);
//        System.out.println(Reto.isItPrime(11));
//        Reto.prime(2,10);
    }

//    public static void primeNumMyTry(int num){
//        //A prime number is a number which is divisible by only two numbers: 1 and itself.
//        // So, if any number is divisible by any other number, it is not a prime number.
//        if (num % 2 == 1) {// a number is not divisible by more than its half
//            System.out.println(num + " is not a prime number");
//        } else {
//            System.out.println(num + " is a prime number");
//        }
//    }


    public static void primeNum(int num){
        //A prime number is a number which is divisible by only two numbers: 1 and itself.
        // So, if any number is divisible by any other number, it is not a prime number.
            if ((num/2) % 2 == 0) {// a number is not divisible by more than its half
                System.out.println(num + " is not a prime number");
            } else {
                System.out.println(num + " is a prime number");
            }
    }

    //with for loop
    public static void prime(long start, long end){
        for(long i = start; i<end; i++){
            if(i % 2 == 0){
                System.out.println(i + " is not prime");
            }else{
                System.out.println(i + " is a prime number");
            }
        }
    }

    public static boolean isItPrime(long num) {
        if (num <= 1) {
            return false;
        }
        for (long i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        System.out.println();
        return true;
    }
}
