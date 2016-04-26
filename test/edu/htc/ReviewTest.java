package edu.htc;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Joel on 4/24/2016.
 */
public class ReviewTest {

    @Test
    public void addReviewer_fromEmpty(){
        //  Game game = new Game();
        Reviewer reviewer = new Reviewer();
        Review review = new Review();

        review.addReviewer(reviewer);
        assertEquals(1, review.getReviewer());
        assertEquals(reviewer, review.getReviewer());
    }
 //   @Test
  //  public void addReviewer_fromEmpty(){
        //  Game game = new Game();
  //      Reviewer reviewer = new Reviewer();
   //     Review review = new Review();

   //     review.addReviewer(reviewer);
   //     assertEquals(1, review.getLiReviewers().size());
   //     assertEquals(reviewer, review.getLiReviewers().get(0));
   // }
}
