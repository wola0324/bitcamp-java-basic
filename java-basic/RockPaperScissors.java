import java.util.Scanner;
class RockPaperScissors{
    public static void main(String[] args){
        System.out.println("가위바위보 게임");
        System.out.println("1.가위 2.바위 3.보");
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        a = scanner.nextInt();
        //컴퓨터가 바위를 냈으면
        if( a == 1 ){
            System.out.println("당신은 졌습니다.");
        }else if( a == 2 ){
            System.out.println("비겼습니다.");
        }else if( a == 3 ){
            System.out.println("당신이 이겼습니다.");
        }else{
            System.out.println("잘 못 입력했습니다.");
        }
    }
}