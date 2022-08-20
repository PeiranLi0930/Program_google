package Restaurant_ArrayList;

import java.util.Scanner;

/**
 * @author Peiran Li
 */
public class Restaurants_Main {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    Restaurant restaurant;

    System.out.println("Please input the restaurant's name: ");
    restaurant = new Restaurant(scnr.nextLine());
    restaurant.uploadAllReviews(scnr);
    System.out.println();

    System.out.println("Please input the rate of this restaurant: ");
    restaurant.printCommentsByRating(scnr.nextInt());
  }
}
