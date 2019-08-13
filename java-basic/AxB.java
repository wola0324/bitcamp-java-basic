import java.util.Scanner;
class AxB{
    public static void main(String[] args){
        System.out.print("값을 입력하세요");
        int A = 0;
        Scanner scanner = new Scanner(System.in);
        A = scanner.nextInt();
        System.out.print("값을 입력하세요");
        int B = 0;
        B = scanner.nextInt();
        System.out.print(A*B);
    }
}