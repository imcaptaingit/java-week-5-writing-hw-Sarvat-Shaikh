package java_programme_week_5_writing;

import java.util.ArrayList;

/*
Write a Java program to test an array list is empty or not. Define array list with underground tube names
 */
public class Programme_7_UnderGroundTubeNames {
    public void isEmpty() {
        ArrayList<String> tubenames = new ArrayList<>();
        tubenames.add("Bakerloo_Line");
        tubenames.add("Central_Line");
        tubenames.add("Circle_Line");
        tubenames.add("District_Line");
        tubenames.add("Hammersmith_and_City_Line");
        tubenames.add("Jubilee_Line");
        tubenames.add("Metropolitan_Line");
        tubenames.add("Northern_Line");
        tubenames.add("Piccadilly_Line");
        tubenames.add("Victoria_Line");
        tubenames.add("Waterloo_and_City_Line");
        System.out.println("Given Array List : " + tubenames);
        if (tubenames.isEmpty()) {
            System.out.println("Given Array List is !! Empty !!");
        } else {
            System.out.println("Given Array List is not Empty !!");
        }
    }

    public static void main(String[] args) {
        Programme_7_UnderGroundTubeNames obj = new Programme_7_UnderGroundTubeNames();
        obj.isEmpty();
    }

}
