
import static java.lang.System.in;
class Prime {

    public void checkPrime(int... arguments){
        for (int num : arguments) {
            if (isPrime(num)) System.out.print(num + " ");
        }
        System.out.println("");
    }

    private boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}



