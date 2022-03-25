public class Primes {
    public static void main(String[] args) {
        for (int i=2; i<=100; i++){
            if(isPrime(i)) System.out.print (i+" ");
        }
    }

    public static boolean isPrime(int n){ // функция для нахождения простых чисел в указанном диапозоне
        for (int m=2; m<n; m++){
            if(n%m==0) return false;
        }
        return true;
    }
}
