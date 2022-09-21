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
        int numberOfPeople=n.nextInt();

        Double tipPerPerson= totalBill*tipPercentage/numberOfPeople;
        Double totalPerPerson= totalBill/numberOfPeople+tipPerPerson;
        Double tipAmount=totalBill*tipPercentage;
        Double billIncludingTips=totalBill*(1+tipPercentage);

        System.out.println("Tip amount:" + "$" + String.format("%.2f",tipAmount) );
        System.out.println("Bill including tips:"+ String.format("%.2f",billIncludingTips));
        System.out.println("")

    }
}
