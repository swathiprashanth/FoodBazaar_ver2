package Items;

public class PrintReceipt extends PriceCalculation{

    public static void main(String[]args) {

        //Create of column values
        String [] itemHeader = {"Fruit","Quantity","Amount"};
        //Price list
        Double [] Price = {100.00,80.00,30.00,120.00,60.00};
        //Quantity List
        Double [] Quantity = {2.00,1.50,0.50,0.75,2.50};//
        //creating list of items
        String [] itemName = {"Apple","Orange","Banana","Kiwi","Mango"};

            /* Receipt headers for receipt*/
        for (int j=0; j<itemHeader.length; j++) {
            System.out.print(itemHeader[j] + "\t\t");
        }
        System.out.println("\n" + "----------------------------------");

        //Price calculation for the quantity
        PriceCalculation obj = new PriceCalculation();    //inheritance

        //Total Price initialization
        double sum = 0;

        //Receipt Print
        for (int i=0; i<itemName.length; i++) {
            System.out.println((itemName[i]) + "\t\t" + Quantity[i] + "\t\t\t\t" + obj.iTemsCost_Calc(Price[i],Quantity[i]));
            double x  = obj.iTemsCost_Calc(Price[i],Quantity[i]) + 0;
            sum = sum + x;
        }
        System.out.println("--------------------------------");
        System.out.println("Total Amount:\t\t\t\t" + sum);
        System.out.println("-----------------------------------");
        System.out.println("\t\t\tThank You");

    }
}
