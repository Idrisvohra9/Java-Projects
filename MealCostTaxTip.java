import java.util.Scanner;

public class MealCostTaxTip {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Meal cost:- ");
        double meal_cost = input.nextDouble();

        System.out.println("Tip percentage:- ");
        int tip_percent = input.nextInt();

        System.out.println("Tax percentage:- ");
        int tax_percent = input.nextInt();
        double final_cost = meal_cost+(meal_cost*tip_percent/100)+(meal_cost*tax_percent/100);
        System.out.println("Final cost: "+ final_cost);
        input.close();
    }
}
