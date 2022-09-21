import java.util.Scanner;
public class PriceCalculator {
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
        Scanner p=new Scanner(System.in);
        Scanner n=new Scanner(System.in);
        System.out.print("Enter your total bill without tax:");
        Double totalBill=t.nextDouble();
        System.out.print("Enter the tip percentage:");
        Double tipPercentage=p.nextDouble();
        System.out.print("Number of people:");
        int numberOfPeople=n.nextInt();//These steps stored the user's input into variables
        tipPercentage=tipPercentage/100; //Convert Percentage to decimal

        Double tipPerPerson= totalBill*tipPercentage/numberOfPeople;
        Double totalPerPerson= totalBill/numberOfPeople+tipPerPerson;
        Double tipAmount=totalBill*tipPercentage;
        Double billIncludingTips=totalBill*(1+tipPercentage);//Calculation for each variable

        System.out.println("-------------------");
        System.out.println("Tip amount:" + "$" + String.format("%.2f",tipAmount) );
        System.out.println("Bill including tips:"+ "$" +String.format("%.2f",billIncludingTips));
        System.out.println("The tip per person:" + "$" + String.format("%.2f",tipPerPerson));
        System.out.print("The total per person"+ "$" + String.format("%.2f",totalPerPerson));
        //The final output which displays four different types of information
    }
}
