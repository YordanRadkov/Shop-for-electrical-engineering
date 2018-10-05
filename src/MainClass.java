public class MainClass {

    public static void main(String[] args) {

        Items item = new Items();

        System.out.println("Sorted by brand and sale price");
        item.sortedByBrandAndSalePrice();

        System.out.println();
        item.findsAverageProfit();

        System.out.println();
        item.findsAirConditioners();

        System.out.println();
        item.editItem();


    }
}
