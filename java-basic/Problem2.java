/**
 * 가위바위보에서 
 * Random(3)+1 을 사용하면 1 ~ 3까지 나옵니다.
 * 컴퓨터가 만든 값이 1이면 가위를 낸 것이고
 * 2이면 바위를 낸 것이고
 * 3이면 보를 낸 것으로 할 때,
 * 사용자측이 가위, 바위, 보를 냈을 때
 * 승패를 결정하는 프로그램을 작성하시오
 */
import java.util.Scanner;
import java.util.Random;
class Problem2{
    public static void main(String [] args){
        System.out.println("가위바위보 게임입니다.");
        Random abc = new Random();
        
        Scanner scan = new Scanner(System.in);

        int dice = 0;
        dice = abc.nextInt(3)+1;
        String qwe = "";
        
        String zxc = "";
        zxc = scan.next();

        if(dice==1){
            qwe = "가위";
            if(zxc.equals("가위")){
                System.out.print("비겼습니다.");
            }else if(zxc.equals("바위")){
                System.out.print("이겼습니다.");
            }else if(zxc.equals("보")){
                System.out.print("졌습니다.");
            }else{
                System.out.print("잘 못 입력했습니다.");
            }
        }else if(dice == 2){
            qwe = "바위";
            if(zxc.equals("가위")){
                System.out.print("졌습니다.");
            }else if(zxc.equals("바위")){
                System.out.print("비겼습니다.");
            }else if(zxc.equals("보")){
                System.out.println("이겼습니다.");
            }else{
                System.out.print("잘 못 입력했습니다.");
            }   
        }else{
            qwe = "보";
            if(zxc.equals("가위")){
                System.out.print("이겼습니다.");
            }else if(zxc.equals("바위")){
                System.out.print("졌습니다.");
            }else if(zxc.equals("보")){
                System.out.println("비겼습니다.");
            }else{
                System.out.print("잘 못 입력했습니다.");
            }
        }
        
    }
}