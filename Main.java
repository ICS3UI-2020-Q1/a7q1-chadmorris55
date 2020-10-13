/**
 * will print out a grade based on whatever the grade is equal to
 * @author 
 */
public class Main {

  //create a method to print out what grade you have based on the number
  public static void examGrade(int grade){
    //checks which letter to print based on the number
    if (grade < 50){
      System.out.println("F");
    } else if (grade < 59){
      System.out.println("D");
    } else if (grade < 69){
      System.out.println("C");
    } else if (grade < 79){
      System.out.println("B");
    } else {
      System.out.println("A");
    }
  }
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    //call the method examGrade
    examGrade(71);
    
  }
}
