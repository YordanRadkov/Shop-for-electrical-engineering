import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Items {

    Scanner input = new Scanner(System.in);

    private int numberOfItems;
    private Item[] items;
    double result ;



    public Items(){
        do {
            System.out.println("Enter number of items");
            this.numberOfItems = input.nextInt();
        }while (numberOfItems <1 || numberOfItems >10);

        items = new Item[numberOfItems];
        for(int i=0; i<items.length; i++){
            items[i] = new Item();
        }
    }

    /**
     * Print all items from the array
     */
    public void printAll(){
        for(Item element : items){
            element.print();
        }
    }

    /**
     * Sort items by brand and by sale price
     */
    public void sortedByBrandAndSalePrice(){

        Comparator<Item> byName = (p1,p2) -> p1.getBrand().compareTo(p2.getBrand());
        Comparator<Item> byProdajbaCena = (p1,p2) -> p1.getSalePriceString().compareTo(p2.getSalePriceString());
        Arrays.sort(items,byName.thenComparing(byProdajbaCena));
        printAll();
    }

    /**
     * Finds the store's average profit for all items
     */
    public void findsAverageProfit() {

        double sum = 0;
        int totalSumOfSalesItems = 0;

        for (Item item : items) {
            sum = item.getProfit() + sum;
            totalSumOfSalesItems = item.getNumberOfSales() + totalSumOfSalesItems;
        }

        result = sum / totalSumOfSalesItems;
        System.out.println("Average profit " + result);
    }

    /**
     * Air conditioners whose average profit exceeds the average store profit by no more than 20%
     */
    public void findsAirConditioners(){

        double middle;
        middle = (result + (result*0.2));
        for (Item item : items) {
            if ((item.getType().equals("air conditioners")) && item.getProfit() <= middle) {

                System.out.println("Air conditioners whose average profit exceeds the average store profit by no more than 20% " );
                System.out.println(item.getBrand());

            }
        }
    }

    /**
     * Changes an item that is from Italy and
     * finds the best-selling TVs
     */
    public void editItem() {

        ArrayList <Item> list = new ArrayList<>(Arrays.asList(items));
        Item item;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).country.equals("Italy")) {
                System.out.println("updating element from Italy");
                list.set(i, item = new Item());
            }
        }

        for (Item element : list) {
            element.print();
        }

        ArrayList <Item> tvList = new ArrayList<>();
        int max = 0;

        for (Item aList : list) {
            if (aList.getType().equals("televisions")) {
                tvList.add(aList);
            }
        }

        int index =0;

        for(int i=0; i<tvList.size(); i++){
            if(tvList.get(i).getNumberOfSales() > max){
                max = tvList.get(i).getNumberOfSales();
                index = i;
            }
        }

        System.out.println("best-selling TVs " + tvList.get(index).getBrand() + " number "+ max);
    }

}
