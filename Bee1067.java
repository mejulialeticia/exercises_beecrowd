import java.util.Scanner;

public class Bee1067 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        for(int i = 0; i < x; i++ ){
            if(i % 2 != 0 ){
                System.out.println(i);
            }
        }

        input.close();
    }
}