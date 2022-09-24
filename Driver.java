public class Driver {
  public static void main(String[] args) {






    Rectangle r1 = new Rectangle(10, 10, 5, 5);
    r1.CalculateParameters();





    Rectangle r2 = new Rectangle(10, 10, 0, 0);
    r2.CalculateParameters();






    if (isCheckOverlap(r1, r2)) {
      System.out.println("Rectangles are Overlapping");
      System.out.println("");
      System.out.println("Attributes for Overlapping Rectangle");
      System.out.println("");
      System.out.printf(createOverlappingRectangle(r1, r2).showAttributes());
    } else {
      System.out.println("Rectangles are NOT Overlapping");
    }
  }

  static Rectangle createOverlappingRectangle(Rectangle r1, Rectangle r2) {
    int ox1 = 0, oy1 = 0, owidth = 0, oheight = 0;
    if (r2.x1 >= r1.x1 && r2.x1 <= r1.x2) {
      ox1 = r2.x1;
      oy1 = r2.y1;
      owidth = r1.x2 - ox1;
      oheight = r1.y3 - r2.y1;
    } else if (r2.x2 >= r1.x1 && r2.x2 <= r1.x2) {
      ox1 = r1.x1;
      oy1 = r1.y1;
      owidth = r2.x2 - ox1;
      oheight = r1.y4 - r2.y1;
    }
    Rectangle miniRectangle = new Rectangle(oheight, owidth, ox1, oy1);
    miniRectangle.CalculateParameters();
    return miniRectangle;
  }

  static boolean isCheckOverlap(Rectangle r1, Rectangle r2) {
    if ((((r2.x1 >= r1.x1 && r2.x1 <= r1.x2) || (r2.x2 >= r1.x1 && r2.x2 <= r1.x2)) && ((r2.y1 >= r1.y1 && r2.y1 <= r1.y3) || (r2.y3 >= r1.y1 && r2.y3 <= r1.y3))) || (((r1.x1 >= r2.x1 && r1.x1 <= r2.x2) || (r1.x2 >= r2.x1 && r1.x2 <= r2.x1)) &&((r1.y1 >= r2.y1 && r1.y1 <= r2.y3) || (r1.y3 >= r2.y1 && r1.y3 <= r2.y3)))) {
      return true;
    } else {
      return false;
    }
  }
}