package popularjavainterviewquestions.prime;

public class Easha {

    public static void main(String[] args) {
        Easha.checkPrime(19);
    }

    public static void checkPrime(int num){
        if((num/2) % 2 == 0){
            System.out.println(num + " is not a prime number");
        } else System.out.println(num + " is a prime number");
    }
}
