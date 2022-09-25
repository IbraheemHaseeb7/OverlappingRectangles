class Rectangle {

  // attributes
  public int x1, y1, height, width, x2, y2, x3, y3, x4, y4;

  // constructor
  public Rectangle(int height, int width, int x1, int y1) {
    this.height = height;
    this.width = width;
    this.x1 = x1;
    this.y1 = y1;
    CalculateParameters();
  }

  // returns a string that has all the attributes
  String showAttributes() {
    return String.format("Height: %d\nWidth: %d\nX1: %d\tY1: %d\nX2: %d\tY2: %d\nX3: %d\tY3: %d\nX4: %d\tY4: %d",
        height, width, x1, y1, x2, y2, x3, y3, x4, y4);
  }

  // calculates attributes of the rectangle on the basis of width, height, x1 and
  // y1
  public void CalculateParameters() {
    x2 = x1 + width;
    y2 = y1;
    x3 = x1;
    y3 = y1 + height;
    x4 = x1 + width;
    y4 = y1 + height;
  }
}
