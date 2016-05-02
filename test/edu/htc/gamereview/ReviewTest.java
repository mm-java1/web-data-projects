package edu.htc.gamereview;

import static org.junit.Assert.assertEquals;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

 /* Created by Sam on 4/10/2016.
 */
public class ReviewTest {
     private Review testReview;

     @Before
     public void setup(){
         testReview = new Review();
     }

     @Test(expected = InvalidDataTypeException.class)
     public void setStarRating_lessThanZero() throws InvalidDataTypeException{
         testReview.setStarRating(-1);
     }
     @Test(expected = InvalidDataTypeException.class)
     public void setStarRating_greaterThanFive() throws InvalidDataTypeException{
         testReview.setStarRating(-1);
     }
     @Test
     public void setStarRating() throws InvalidDataTypeException{
         testReview.setStarRating(3);
         assertEquals(3, testReview.getStarRating());
     }

     @Test(expected = InvalidDataTypeException.class)
     public void setReviewer_null() throws InvalidDataTypeException{
         testReview.setReviewer(null);
     }
     @Test
     public void setReviewer() throws InvalidDataTypeException{
         Reviewer reviewer = new Reviewer();
         testReview.setReviewer(reviewer);
         assertEquals(reviewer, testReview.getReviewer());
     }

     @Test(expected = InvalidDataTypeException.class)
     public void setGame_null() throws InvalidDataTypeException{
         testReview.setGame(null);
     }
     @Test
     public void setGame() throws InvalidDataTypeException{
         Game game = new Game();
         testReview.setGame(game);
         assertEquals(game, testReview.getGame());
     }
     @Test(expected = InvalidDataTypeException.class)
     public void setComments_null() throws InvalidDataTypeException{
         testReview.setComments(null);
     }

     @Test(expected = InvalidDataTypeException.class)
     public void setComments_empty() throws InvalidDataTypeException{
         testReview.setComments("");
     }
     @Test
     public void setComments() throws InvalidDataTypeException{
         testReview.setComments("I could play this game all day!");
         assertEquals("I could play this game all day!", testReview.getComments());
     }

     @Test(expected = InvalidDataTypeException.class)
     public void setDate_null() throws InvalidDataTypeException{
         testReview.setDate(null);
     }
     @Test
     public void setDate() throws InvalidDataTypeException{
         Date date = new Date();
         testReview.setDate(date);
         assertEquals(date, testReview.getDate());
     }
     @Test
     public void validate_true() throws InvalidDataTypeException {
         Reviewer reviewer = new Reviewer();
         Game game = new Game();
         Date date = new Date();
         testReview.setReviewer(reviewer);
         testReview.setGame(game);
         testReview.setDate(date);
         testReview.setComments("Comments");
         testReview.setStarRating(3);
         assertEquals(true, testReview.validate());
     }
     @Test
     public void validate_falseStarRating() throws InvalidDataTypeException{
         Reviewer reviewer = new Reviewer();
         Game game = new Game();
         Date date = new Date();
         testReview.setReviewer(reviewer);
         testReview.setGame(game);
         testReview.setDate(date);
         testReview.setComments("Comments");
         assertEquals(false, testReview.validate());
     }
     @Test
     public void validate_falseReviewer() throws InvalidDataTypeException{
         Game game = new Game();
         Date date = new Date();
         testReview.setGame(game);
         testReview.setDate(date);
         testReview.setComments("Comments");
         assertEquals(false, testReview.validate());
     }

     @Test
     public void validate_falseGame() throws InvalidDataTypeException{
         Reviewer reviewer = new Reviewer();
         Date date = new Date();
         testReview.setReviewer(reviewer);
         testReview.setDate(date);
         testReview.setComments("Comments");
         assertEquals(false, testReview.validate());
     }

     @Test
     public void validate_falseDate() throws InvalidDataTypeException{
         Reviewer reviewer = new Reviewer();
         Game game = new Game();
         testReview.setReviewer(reviewer);
         testReview.setGame(game);
         testReview.setComments("Comments");
         assertEquals(false, testReview.validate());
     }

     @Test
     public void validate_falseComments() throws InvalidDataTypeException{
         Reviewer reviewer = new Reviewer();
         Game game = new Game();
         Date date = new Date();
         testReview.setReviewer(reviewer);
         testReview.setGame(game);
         testReview.setDate(date);
         assertEquals(false, testReview.validate());
     }





 }
