import java.util.*;
public class JavaStdinStdoutI{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        for(int i=1;i<=3;i++)
        {
        int a = scan.nextInt();
        System.out.println(a);
        }
    }
}