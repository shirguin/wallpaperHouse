import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Shop shop_1 = new Shop("Обои", "Терешковой, 10");
        Shop shop_2 = new Shop("Обои", "Кирова, 8");
        Shop shop_3 = new Shop("Обои", "Шимборского, 15");
        Shop shop_4 = new Shop("Обои", "Чкалова, 13");
        Shop shop_5 = new Shop("Обои", "Гагарина, 64");

        Shop[] shops = {shop_1, shop_2, shop_3, shop_4, shop_5};

        for (int i = 0; i < shops.length; i++) {
            System.out.printf("Магазин - %s адрес магазина - %s\n", shops[i].shopName, shops[i].shopAddress);
        }

        DailyShopRevenue revenue = new DailyShopRevenue(
                shop_1,
//                Разобраться с форматом DATE!!!
                "31.12.22",
                100.10f,
                10.45f,
                200.35f,
                45.45f,
                300.56f,
                30.12f);

        System.out.println(revenue.getDate());
        System.out.println(revenue.getShop());
        System.out.println(revenue.getTotalRevenue());

//        String stDate = "31-12-22";
//        DateFormat df = new SimpleDateFormat("dd.mm.yyyy");
//
//        Date date = new Date(df.parse(stDate));

//        LocalDate date = LocalDate.parse("31.12.22");

        SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
        Date date;
        date = formatter.parse("31-12-22");
        System.out.println(date);
    }
}