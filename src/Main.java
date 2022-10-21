import java.util.List;

public class Main {
    //Просте число — це натуральне число, яке ділиться на 1 і саме себе
    private static int i = 2;

    public static boolean isPrime(int num){
        if(num > 2 && i == num / 2 + 1){
            return true;
        } else if(num % i == 0){
            return false;
        }
        i++;
        return isPrime(num);
    }

    public static void main(String[] args) {
        int number = 6;
        if(isPrime(number) == true){
            System.out.println(number + "\t - просте число");
        } else {
            System.out.println(number + "\t - не просте число");
        }
    }
}