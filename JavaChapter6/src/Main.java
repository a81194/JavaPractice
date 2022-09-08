import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Calendar;

public class Main {

  public static void main(String[] args) {

    System.out.println(System.currentTimeMillis());
    System.out.println(LocalDateTime.now());
    System.out.println(ZonedDateTime.now());
    System.out.println(Calendar.getInstance().getTime());
  }
}
