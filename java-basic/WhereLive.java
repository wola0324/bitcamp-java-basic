import java.util.Scanner;
class WhereLive{
    public static void main(String[] args){
        System.out.print("Where are you live?");
        String city = "";
        Scanner scanner = new Scanner(System.in);
        city = scanner.next();
        System.out.print(String.format("I live %s", city));
    }
}