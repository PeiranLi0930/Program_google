package Restaurant_ArrayList;

import java.util.Objects;

/**
 * Review the rate and comments of a restaurant.
 * Use Review.helpReview() to see how to use this class
 * <p>
 * Methods:
 * <p> int getRating() </p>
 * <p> String getComment() </p>
 *
 * @author Peiran Li
 */
public class Review {
  private int rating = -1;
  private String comment = "None";

  public static void helpReview() {
    System.out.println("For using this Review class: ");
    System.out.println("This class includes a constructor which could set the" +
        " rating and the comments of a restaurant directly");
    System.out.println("Create Object: new Review(int rate, String Comment)");
  }

  public Review() {
    this.rating = -1;
    this.comment = "None";
  }
  // constructor for setting the rate and comment
  public Review(int rate, String comment) {
    this.rating = rate;
    this.comment = comment;
  }

  public int getRating() {
    return this.rating;
  }

  public String getComment() {
    return this.comment;
  }
}
