
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Validation {
      Scanner sc = new Scanner(System.in);

    public int inputInt(String te, int min, int max) {
        System.out.println(te);
        while (true) {
            String input = sc.nextLine();
            try {
                int in = Integer.parseInt(input);
                if (in < min || in > max) {
                    System.out.println("Please enter in range" + min + "and" + max);
                    continue;
                }
                return in;
            } catch (Exception e) {
                System.out.println("Please enter an integer number:");
            }
        }
    }

    // nhap thoi gian bat dau 
    public double getFromTo(String text) {
        double from = 0;
        while (true) {
            System.out.println(text);
            String in = sc.nextLine();
            try {
                from = Double.parseDouble(in);
                if (from < 8 || from > 17.5 || from % 0.5 != 0) {
                    System.out.println("From must be in range (8h-17.5h)");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Please enter double value! ");
                continue;
            }
            break;
        }
        return from;

    }

    // nhap thoi gian ket thuc
   

    /// nhap thoi gian
    public String inputDate(String mess) {
        System.out.print(mess);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        dateFormat.setLenient(false);
        while (true) {
            String input = sc.nextLine();
            try {
                Date date = dateFormat.parse(input);
                return input;
            } catch (Exception e) {
                System.out.print("Please input valid date (dd-MM-yyyy): ");
            }
        }
    }
    // nhap ten comment reviewer

    public String inputString(String text) {
        System.out.println(text);
        while (true) {
            String input = sc.nextLine();
            if (input.trim().equals("")) {
                System.out.println("Please input a non empty string");
            }
            return input;
        }
    }


}
