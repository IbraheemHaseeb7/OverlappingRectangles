public class Driver {
  public static void main(String[] args) {

    // creating rectangles and initializing their parameters
    Rectangle r1 = new Rectangle(10, 10, 0, 5);
    Rectangle r2 = new Rectangle(10, 10, 5, 0);

    // creating overlapping method to call some methods
    Overlap overlap = new Overlap(r1, r2);

    // calls and runs appropriate display commands depending upon the nature of the
    // return of function
    if (overlap.isCheckOverlap()) {
      System.out.println("\nRectangles are Overlapping\n\nAttributes for Overlapping Rectangle\n");
      System.out.printf(overlap.createOverlappingRectangle().showAttributes());
    } else {
      System.out.println("Rectangles are NOT Overlapping");
    }
  }
}