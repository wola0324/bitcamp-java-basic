import java.util.Scanner;
import java.util.Random;
class Dice{
    /**
     * 주사위를 던져서 홀수인지 짝수인지 맞추는 게임입니다.
     * 일단 컴퓨터가 던져서 얻은 값은 3입니다.
     * 사용자는 입력을 홀수 인 것 같으면 '홀'을 선택, '짝'을 선택
     * 한다고 할 때, 결과를 출력하세요.
     */
    public static void main(String [] args){
        System.out.println("주사위 게임입니다.");
        System.out.println("홀 또는 짝을 선택하세요");
        Scanner scanner = new Scanner(System.in);
        Random ran = new Random();
        int dice = 0;
        dice = ran.nextInt(6)+1;
        System.out.println(String.format("랜덤으로 나온 수 %d", dice));
        String dap = "";
        if(dice == 1){
            dap = "홀";
        }else if(dice == 2){
            dap = "짝";
        }else if(dice == 3){
            dap = "홀";
        }else if(dice == 4){
            dap = "짝";
        }else if(dice == 5){
            dap = "홀";
        }else{
            dap = "짝";
        }
        System.out.println("주사위 값을 예측한 홀,짝 입력 [  ]");
        String a = "";
        a = scanner.next();
        if(a.equals(dap)){
            System.out.println("맞습니다.");
        }else if(!a.equals(dap)){
            System.out.println("틀렸습니다.");
        }else{
            System.out.println("잘못 선택했습니다.");
        }
    }
}