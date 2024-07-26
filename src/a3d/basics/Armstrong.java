package a3d.basics;

public class Armstrong {
    public static void main(String[] args) {
        int number = 153;
        if (isArmstrong(number)) {
            System.out.println(number + " : is armstrong number");
        } else System.out.println(number + " : is not an armstrong number");
    }

    static boolean isArmstrong(int num) {
        int digit = 0, last = 0, sum = 0, temp;
        temp = num;
        while (temp > 0) {
            temp = temp / 10;
            digit++;
        }
        temp = num;
        while (temp > 0) {
            last = temp % 10;
            sum += (Math.pow(last, digit));
            temp = temp / 10;
        }
        return num == sum;
    }
}
