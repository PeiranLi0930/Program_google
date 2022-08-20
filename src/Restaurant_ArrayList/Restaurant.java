package Restaurant_ArrayList;

import javax.swing.*;
import java.util.Scanner;

/**
 * @author Peiran Li
 */
public class Restaurant {
  private String name;
  private Reviews reviews;

  public Restaurant() {
    this.name = "None";
    reviews = null;
  }

  public Restaurant(String name) {
    this.name = name;
    reviews = new Reviews();
  }

  public void uploadAllReviews(Scanner scnr) {
    System.out.println("Please input rating + comments. To end: -1");
    reviews.inputReviews(scnr);
  }

  public void printCommentsByRating(int rate) {
    reviews.printCommentByRate(rate);
  }
}
