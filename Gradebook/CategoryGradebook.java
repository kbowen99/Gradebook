/****************************************************
**
** CategoryGradebook class
**
** This class represents a CategoryGradebook that calculates
** grades according to the weighted category grading system.
**
****************************************************/

import java.util.ArrayList;

public class CategoryGradebook implements Gradebook {
    private ArrayList<CategoryAssignment> myGrades;     // set of CategoryAssignments in this Gradebook
    private String[] myCategories;      // names of the various categories
    private int[] myWeights;            // weights of the various categories
    // note that myWeights[0] is the weight for category myCategories[0]
          
    // precondition: categories.length == weights.length;
    // categories contains the names of all categories in this Gradebook;
    // weights contains the values of the weights of each corresponding category;
    // each value in weights is between 0 and 100 inclusive
    // postcondition: all instance variables are initialized;
    // if sum of elements in weights is not equal to 100, then the weight of
    // the last category is adjusted so that the sum is equal to 100
    public CategoryGradebook(String[] categories, int[] weights) {
        this.myCategories = categories;
        this.myWeights = weights;
        myGrades = new ArrayList<CategoryAssignment>();
        
        int count = 0;
        for (int i = 0; i <  myWeights.length; i++){
            count += myWeights[i];
        }
        if (count != 100){
             myWeights[(myWeights.length - 1)] = (myWeights[(myWeights.length - 1)] - (count - 100));
        }
    }

    // calculateGrade accessor method
    //
    // postcondition: the grade represented by this Gradebook is calculated and
    // returned, according to the weighted category grading system. To calculate this
    // value, first calculate the average of all assignments in each category. Then,
    // multiply each of those values with the value of the weight for that category.
    // Finally, add the values together. This value is between 0 and 100, inclusive.
    // 
    // If your task can be made easier by adding private helper methods to this class,
    // then be sure that they are thoroughly documented with comments. 
    public double calculateGrade() {
        return 0.0;
    }
    
    // findCategory private accessor method
    // 
    // precondition: assign IS-A CategoryAssignment, and its category can be found in myCategories
    // postcondition: returns the index into myCategories at which assign's category is located
    // for example: if myCategories contains { "Quizzes", "Tests", "Projects" }, and the return
    // value of assign.getCategoryName() is "Tests", then this method returns 1.
    private int findCategory(Assignment assign) {
        int i;
        CategoryAssignment catAssign = (CategoryAssignment)assign;
        
        for (i = 0; i < myCategories.length; i++) {
            if (catAssign.getCategoryName().equals(myCategories[i])) {
                return i;
            }
        }
        
        // the following line is present just so that this method compiles; 
        // if the precondition is met, then this line will never be reached
        // if the precondition is not met, then an ArrayIndexOutOfBoundsException will be thrown
        return -1;
    }
    
    
    // add mutator method
    //
    // precondition: assign IS-A CategoryAssignment
    // postcondition: the given Assignment object is added to this Gradebook
    public void add(Assignment assign) {
        myGrades.add((CategoryAssignment)assign);
    }
}
