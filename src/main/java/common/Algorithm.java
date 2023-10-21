package common;

import java.util.ArrayList;
import java.util.HashMap;

public class Algorithm {
    public static void getNumber(String inputString) {
        HashMap<String, ArrayList<Integer>> hmNumber = new HashMap<>();
        String number = inputString.replaceAll("\\D+", ",");
        if (number.charAt(0) == ',') {
            number = number.substring(1);
        }
        if (number.charAt(number.length() - 1) == ',') {
            number = number.substring(0, number.length() - 1);
        }
        String[] listNumber = number.split(",");
        int lenNumber = listNumber.length;

        ArrayList<Integer> liPerfectSquare = new ArrayList<>();
        ArrayList<Integer> liOdd = new ArrayList<>();
        ArrayList<Integer> liEven = new ArrayList<>();
        ArrayList<Integer> liAll = new ArrayList<>();
        
        for (int i = 0; i < lenNumber; i++) {
            int numberCheck = Integer.parseInt(listNumber[i]);
            if (numberCheck % 2 == 1) {
                liOdd.add(numberCheck);
            }
            if (numberCheck % 2 == 0) {
                liEven.add(numberCheck);
            }
            if (Library.checkSquareNumber(numberCheck)) {
                liPerfectSquare.add(numberCheck);
            }
            liAll.add(numberCheck);
        }
        
        hmNumber.put("Perfect Square Numbers: ", liPerfectSquare);
        hmNumber.put("Odd Numbers: ", liOdd);
        hmNumber.put("Even Numbers: ", liEven);
        hmNumber.put("All Numbers: ", liAll);
        
        String[] order = {
            "Perfect Square Numbers: ",
            "Odd Numbers: ",
            "Even Numbers: ",
            "All Numbers: "
        };
        
        for (String key : order) {
            ArrayList<Integer> values = hmNumber.get(key);
            if (values != null) {
                System.out.println(key + values);
            }
        }
    } 
       
    public static void getCharacter(String inputString) {
        HashMap<String, String> hmString = new HashMap<>();
        String uppercase = inputString.replaceAll("\\W|[0-9]|[a-z]", "");
        String lowercase = inputString.replaceAll("\\W|[0-9]|[A-Z]", "");
        String special = inputString.replaceAll("\\w", "");
        String allCharacters = inputString.replaceAll("[^a-zA-Z\\W_]", "");
        
        hmString.put("Uppercase: ", uppercase);
        hmString.put("Lowercase: ", lowercase);
        hmString.put("Special: ", special);
        hmString.put("All Character: ", allCharacters);
        
        String[] orderString = {
            "Uppercase: ",
            "Lowercase: ",
            "Special: ",
            "All Character: "
        };
        
        for (String key : orderString) {
            String value = hmString.get(key);
            if (value != null) {
                System.out.println(key + value);
            }
        }
    }
}
