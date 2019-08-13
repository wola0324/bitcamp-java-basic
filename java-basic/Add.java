import java.util.Scanner;
class Add{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a, b, c = 0;
        System.out.print("값을 입력하세요");
        a = scanner.nextInt();
        System.out.print("값을 입력하세요");
        b = scanner.nextInt();
        String op = "";
        op = scanner.next();
        System.out.println("연산종류를 선택하세요 + , - , * , /");
            if(op.equals("+")){
            c = a + b;
            System.out.print(String.format("%d + %d = %d", a, b, c));
        }else if(op.equals("-")){
            c = a - b;
            System.out.print(String.format("%d - %d = %d", a, b, c));
        }else if(op.equals("*")){
            c = a * b;
            System.out.print(String.format("%d * %d = %d", a, b, c));
        }else if(op.equals("/")){
            c = a / b;
            System.out.print(String.format("%d / %d = %d", a, b, c));
        }else{
            System.out.print("잘 못 입력했습니다.");
        }
    }
}