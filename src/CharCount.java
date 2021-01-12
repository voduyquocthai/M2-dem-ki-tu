import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Xin Chao Cac Ban";
        System.out.println("Nhập 1 kí tự bạn muốn tìm kiếm: ");
        String x = sc.next();
        char a = x.charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if( a == str.charAt(i)){
                count ++;
            }
        }
        System.out.println("Số kí tự " + x + "ở trong chuỗi là: " + count);
    }
}
