
import java.util.Scanner;

 class slabs {

    public static int tax = 0;
    public void slab1(int annualIncome){
        int slab1 = annualIncome - 3_00_000;
        if(slab1 <= 0 ){
            tax = 0;
            System.out.println(" Your tax is :"+ tax);
            System.exit(0);
        }

         slab2(slab1);
    }

    public void slab2(int annualIncome){
        if(annualIncome < 4_00_000) {
            tax = tax+ (int) (annualIncome*(5.0f/100.0f));
            System.out.println("Your tax is : "+tax);
            System.exit(0);
        }

        if(annualIncome == 4_00_000){
            tax = tax+ (int) (4_00_000*(5.0f/100.0f));
            System.out.println("Your tax is : "+tax);
            System.exit(0);
        }

            int slab2 = annualIncome - 4_00_000;
                tax = tax+ (int) (4_00_000*(5.0f/100.0f));
            slab3(slab2);

    }

    public void slab3(int annualIncome){

        if(annualIncome < 3_00_000) {
            tax = tax+ (int) (annualIncome*(10.0f/100.0f));
            System.out.println("Your tax is : "+tax);
            System.exit(0);
        }

        if(annualIncome == 3_00_000){
            tax = tax+ (int) (3_00_000*(10.0f/100.0f));
            System.out.println("Your tax is : "+tax);
            System.exit(0);
        }

            int slab3 = annualIncome - 3_00_000;
            tax = tax+ (int) (3_00_000*(10.0f/100.0f));
            slab4(slab3);


    }

    public void slab4(int annualIncome){

        if(annualIncome < 2_00_000) {
            tax = tax+ (int) (annualIncome*(15.0f/100.0f));
            System.out.println("Your tax is : "+tax);
            System.exit(0);
        }

        if(annualIncome == 2_00_000){
            tax = tax+ (int) (2_00_000*(15.0f/100.0f));
            System.out.println("Your tax is : "+tax);
            System.exit(0);
        }

            int slab4 = annualIncome - 2_00_000;
            tax = tax+ (int) (2_00_000*(15.0f/100.0f));
            slab5(slab4);

    }

    public void slab5(int annualIncome){
        if(annualIncome < 3_00_000) {
            tax = tax+ (int) (annualIncome*(20.0f/100.0f));
            System.out.println("Your tax is : "+tax);
            System.exit(0);
        }

        if(annualIncome == 3_00_000){
            tax = tax+ (int) (3_00_000*(20.0f/100.0f));
            System.out.println("Your tax is : "+tax);
            System.exit(0);
        }

            int slab5 = annualIncome - 3_00_000;
            tax = tax+ (int) (3_00_000*(20.0f/100.0f));
            slab6(slab5);

    }

    public void slab6(int annualIncome){
            tax = tax+ (int) (annualIncome*(30.0f/100.0f));
            System.out.println("your tax is : "+ tax);
            System.exit(0);

    }
}

public class Tax{
    public static void main(String[] args) {
        slabs slabs = new slabs();
        System.out.println("enter your Annual Income");
        Scanner scanner = new Scanner(System.in);
        int annualIncome = scanner.nextInt();
        slabs.slab1(annualIncome);
        scanner.close();
    }
}
