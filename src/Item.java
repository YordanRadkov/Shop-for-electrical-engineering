import java.util.Scanner;

public class Item {

    Scanner input = new Scanner(System.in);

    private int nomenclatureNumber;
    public  String country;
    private String type;
    private String brand;
    private String model;
    private String salePriceString;
    private String purchasePriceString;
    private int numberOfSales;
    private int firstDigit;
    private int rememberNomenclatureNumber;
    private int secondDigit;
    private double salePrice;
    private double purchasePrice;
    private double profit;
    private int deliveredQuantity;




    public Item(){
        do {
            System.out.println("Enter nomenclature number ") ;
            this.nomenclatureNumber = input.nextInt();

        }while (Integer.toString(nomenclatureNumber).length()>6 || Integer.toString(nomenclatureNumber).length() < 6);



        do {
            System.out.println("Enter brand");
            this.brand = input.next();
        }while (brand.length() > 30 || brand.length()<1);

        do {
            System.out.println("Enter model");
            this.model = input.next();
        }while (model.length() > 15 || model.length() < 1);

        System.out.println("Enter sale price");
        this.salePrice = input.nextDouble();
        this.salePriceString = java.text.NumberFormat.getCurrencyInstance().format(salePrice);

        System.out.println("Enter delivered quantity");
        this.deliveredQuantity = input.nextInt();

        System.out.println("Enter number of sales");
        this.numberOfSales = input.nextInt();

        System.out.println("Enter purchase  price");
        this.purchasePrice = input.nextDouble();
        this.purchasePriceString = java.text.NumberFormat.getCurrencyInstance().format(purchasePrice);

        this.profit = (salePrice - purchasePrice) * numberOfSales;


        this.firstDigit = nomenclatureNumber / 100000;
        rememberNomenclatureNumber = nomenclatureNumber % 100000;
        this.secondDigit = rememberNomenclatureNumber / 10000;

        this.country = findCountry();
        this.type = findType();

    }
    public void print(){
        System.out.println("Brand " + getBrand() + " model " + getModel() + " sale price " + getSalePriceString() + " purchase  price " + getPurchasePriceString() + " type " + getType());
    }

    /**
     * according to the first digit of the number return the country of production
     * @return
     */
    public String findCountry(){

        switch (firstDigit){
            case 1:
                return "Bulgaria";

            case 2:
                return "Germany";

            case 3:
                return "Italy";

            case 4:
                return "Hungary";

            case 5:
                return "Japan";

            case 6:
                return "China";

            default:
                return "No match";
        }
    }

    /**
     * according to the second digit of the number return the type of item
     * @return
     */
    public String findType(){



        switch (secondDigit){
            case 1:
                return "computers and peripherals";

            case 2:
                return "televisions";

            case 3:
                return "air conditioners";

            case 4:
                return "audio";

            case 5:
                return "video";

            case 6:
                return "telecommunications";
            case 7:
                return "home appliances";

            default:
                return "No match";
        }
    }

    public int getNomenclatureNumber() {
        return nomenclatureNumber;
    }

    public void setNomenclatureNumber(int nomenclatureNumber) {
        this.nomenclatureNumber = nomenclatureNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getFirstDigit() {
        return firstDigit;
    }

    public void setFirstDigit(int firstDigit) {
        this.firstDigit = firstDigit;
    }

    public int getRememberNomenclatureNumber() {
        return rememberNomenclatureNumber;
    }

    public void setRememberNomenclatureNumber(int rememberNomenclatureNumber) {
        this.rememberNomenclatureNumber = rememberNomenclatureNumber;
    }

    public int getSecondDigit() {
        return secondDigit;
    }

    public void setSecondDigit(int secondDigit) {
        this.secondDigit = secondDigit;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public int getDeliveredQuantity() {
        return deliveredQuantity;
    }

    public void setDeliveredQuantity(int deliveredQuantity) {
        this.deliveredQuantity = deliveredQuantity;
    }

    public int getNumberOfSales() {
        return numberOfSales;
    }

    public void setNumberOfSales(int numberOfSales) {
        this.numberOfSales = numberOfSales;
    }




    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }



    public String getSalePriceString() {
        return salePriceString;
    }

    public void setSalePriceString(String salePriceString) {
        this.salePriceString = salePriceString;
    }



    public String getPurchasePriceString() {
        return purchasePriceString;
    }

    public void setPurchasePriceString(String purchasePriceString) {
        this.purchasePriceString = purchasePriceString;
    }
}
