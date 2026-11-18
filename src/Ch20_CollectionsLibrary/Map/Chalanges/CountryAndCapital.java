package Ch20_CollectionsLibrary.Map.Chalanges;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryAndCapital {


    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Map<String, String> countryList = new HashMap<>();
        countryList.put("India", "Delhi");
        countryList.put("Australia", "Canberra");
        countryList.put("New Zeeland", "Wellington");
        countryList.put("Japan", "Tokyo");
        countryList.put("America", "Washington");
        countryList.put("Italy", "Rome");
        countryList.put("China", "Beijing");
        countryList.put("Pakistan", "Islamabad");
        countryList.put("Bangladesh", "Dhaka");
        countryList.put("Nepal", "Kathmandu");
        countryList.put("Bhutan", "Thimphu");

        System.out.print("Enter the Country Name to Get Capital Name : ");
        String userInput = input.nextLine();

        if (countryList.containsKey(userInput)){
            System.out.printf("Your Input Country Name is %s so capital is %s", userInput, countryList.get(userInput));
        }else {
            System.out.println("Sorry i have no details");
        }





    }


}
