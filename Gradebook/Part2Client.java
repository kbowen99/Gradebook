/****************************************************
**
** Client class for Part 2
**
** This class is a Gradebook client, and is used
** to test the CategoryAssignment and CategoryGradebook
** classes.
**
** First, write a program that declares an CategoryAssignment 
** object, and then invokes all CategoryAssignment methods using
** that object. Print the return values to the screen, and
** verify that the CategoryAssignment class works properly. 
** Use your MainClass.java file from Part 1 as an example. 
** All methods available to CategoryAssignment objects, including
** those inherited from the Assignment class, must be tested. 
**
** Then, delete or comment out that code, and 
** write a program that declares a CategoryGradebook
** object, and adds CategoryAssignment objects to it. Then, 
** invoke the calculateGrade method on the CategoryGradebook
** object, and print the resulting value to the screen. 
** Use your MainClass.java from Part 1 as an example. Here
** are some grades that you can use:
**
** The two categories in this example are "Labs" and "Tests".
** Each has a weight of 50.
**
** name         pts available         pts earned    category
** Lab 1        27                    30            Labs
** Lab 2        30                    30            Labs
** Test 1       30                    30            Tests
** Lab 3        30                    30            Labs
** Lab 4        30                    30            Labs
** Test 2       30                    15            Tests
** Test 3       30                    0             Tests
** 
** The grade printed should be 73.75
**
** After this works, you should change your code so that the
** CategoryGradebook is instantiated with weights of 50 and 75
** in each category. The constructor should reduce the second
** weight to 50, and the grade calculated for this data should
** be the same as above.
**
** Then, instantiate the CategoryGradebook with weights of 50
** and 25 in each category. The constructor should increase the 
** second weight to 50, and the grade calculated for this data 
** should be the same as above.
**
****************************************************/
public class Part2Client {
    //public static void main(String[] args) {}
    
    public static void catGradeTest(){
        //create the assignments
        CategoryAssignment a1 = new CategoryAssignment("Lab 1", 30.0, 27.0, "Labs");
        CategoryAssignment a2 = new CategoryAssignment("Lab 2", 30.0, 30.0, "Labs");
        CategoryAssignment a3 = new CategoryAssignment("Test 1", 30.0, 30.0, "Tests");
        CategoryAssignment a4 = new CategoryAssignment("Lab 3", 30.0, 30.0, "Labs");
        CategoryAssignment a5 = new CategoryAssignment("Lab 4", 30.0, 30.0, "Labs");
        CategoryAssignment a6 = new CategoryAssignment("Test 2", 30.0, 15.0, "Tests");
        CategoryAssignment a7 = new CategoryAssignment("Test 3", 30.0, 0.0, "Tests");
        String[] cats = {"Labs", "Tests"};
        int[] Weights1 = {50, 50};
        int[] Weights2 = {50, 75};
        int[] Weights3 = {50, 25};
        //create gradebooks
        CategoryGradebook T1 = new CategoryGradebook(cats, Weights1);
        CategoryGradebook T2 = new CategoryGradebook(cats, Weights2);
        CategoryGradebook T3 = new CategoryGradebook(cats, Weights3);
        //add assignments
        T1.add(a1);
        T1.add(a2);
        T1.add(a3);
        T1.add(a4);
        T1.add(a5);
        T1.add(a6);
        T1.add(a7);
        //T2
        T2.add(a1);
        T2.add(a2);
        T2.add(a3);
        T2.add(a4);
        T2.add(a5);
        T2.add(a6);
        T2.add(a7);
        //T3
        T3.add(a1);
        T3.add(a2);
        T3.add(a3);
        T3.add(a4);
        T3.add(a5);
        T3.add(a6);
        T3.add(a7);
        //Outputting information
        p("Category Gradebook Test");
        p("50/50 Weight - Should be 73.75");
        p(T1.calculateGrade());
        p("50/75 Weight - Should be 73.75");
        p(T2.calculateGrade());
        p("50/25 Weight - Should be 73.75");
        p(T3.calculateGrade());
        p("---------------------------------------------------");
    }
    
    public static void catAssnTest(){
        p("Category Assignment Methods Test:");
        CategoryAssignment gradeSign = new CategoryAssignment("Gradebook Project", 80.0, 80.0, "APCS");
        p("Name (should be 'Gradebook Project')");
        p(gradeSign.getName());
        p("Possible Points (should be 80)");
        p(gradeSign.getPointsPossible());
        p("Earned Points (should be 80)");
        p(gradeSign.getPointsEarned());
        p("Category (should be 'APCS')");
        p(gradeSign.getCategoryName());
        p("---------------------------------------------------");
    }
    
    static void p(Object out){
        //Efficiency
        System.out.println(out);
    }
}
