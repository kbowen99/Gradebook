/****************************************************
**
** Assignment class
**
** This class represents an Assignment. 
**
****************************************************/
public class Assignment {
    private String name;
    private double pointsPossible;
    private double pointsEarned;

    // Assignment constructor
    //
    // postcondition: all instance variables are initialized with
    // the given values. 
    public Assignment (String n, double ptsPoss, double ptsEarned) {
        this.name = n;
        this.pointsPossible = ptsPoss;
        this.pointsEarned = ptsEarned;
    }
    
    // getName accessor method
    //
    // postcondition: returns the name of this Assignment
    public String getName() {
        return this.name;
    }
    
    // getPointsPossible accessor method
    //
    // postcondition: returns the points possible for this Assignment
    public double getPointsPossible() {
        return this.pointsPossible;
    }
    
    // getPointsEarned accessor method
    //
    // postcondition: returns the points earned for this Assignment
    public double getPointsEarned() {
        return this.pointsEarned;
    }
}
