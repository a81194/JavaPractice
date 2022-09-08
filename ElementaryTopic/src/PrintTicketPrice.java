import com.sun.nio.sctp.MessageInfo;

import java.text.MessageFormat;
import java.util.Scanner;

public class PrintTicketPrice {
    public static void ticketPrice(int age, int price, boolean welfare) {
        float finalPrice = 0;
        if (age <= 11) {
            System.out.println((int) finalPrice);
        } else if (age >= 12 && age <= 18 || welfare == true) {
            finalPrice = (float) (price * 0.75);
            System.out.println((int) finalPrice);
        } else {
            System.out.println(price);
        }
    }

    public static void main(String[] args) {
        // 要素:客戶年紀.電影票價錢.客戶有無折扣資格
        // 年紀<11 免費,12-18 25% off,>19 原價但具社福資格 25% off
        Scanner input = new Scanner(System.in);
        System.out.print("請輸入您的年紀:");
        int age = input.nextInt();
        while (age>120){
            System.out.println("請輸入有效年齡");
            System.out.print("請輸入您的年紀:");
            age=input.nextInt();
        }
        System.out.print("請輸入票價:");
        int price = input.nextInt();
        System.out.print("您是否具備社會福利資格,請回答 True or False :");
        boolean welfare = input.nextBoolean();

        ticketPrice(age,price,welfare);

//        ticketPrice(20, 100, false);
//        ticketPrice(15, 200, false);
//        ticketPrice(25, 500, true);
    }
}
