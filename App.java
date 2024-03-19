import java.util.*;
import java.time.*;
import java.text.SimpleDateFormat;
import OOP.*;
public class App {
    
    public static void main(String[] args) throws Exception {
        Calendar ds = Calendar.getInstance();
        System.out.println(ds.getTime());
        System.out.println(ds.getTimeInMillis());
        System.out.println(ds.equals(ds));
    }
}
