package Restaurant_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Peiran Li
 */
public class Reviews {
  private ArrayList<Review> reviewArrayList = new ArrayList<>();

  public void inputReviews(Scanner scnr) {
    Review currentReview;
    int currentRating;
    String currentComment;

    currentRating = scnr.nextInt();

    while (currentRating >= 0) {
      currentReview = new Review(currentRating, scnr.nextLine());
      reviewArrayList.add(currentReview);
      currentRating = scnr.nextInt();
    }
  }

  public void printCommentByRate(int rate) {
    Review currentReview;

    for (int i = 0; i < reviewArrayList.size(); i++) {
      currentReview = reviewArrayList.get(i);
      if (rate == currentReview.getRating()) {
        System.out.println(currentReview.getComment());
      }
    }
  }

  public int getAverageRating() {
    int rateSum = 0;
    for (int i = 0; i < reviewArrayList.size(); i++) {
      rateSum += reviewArrayList.get(i).getRating();
    }

    return rateSum / reviewArrayList.size();
  }
}
