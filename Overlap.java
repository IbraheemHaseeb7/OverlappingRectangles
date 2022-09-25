public class Overlap {

    Rectangle r1, r2;

    public Overlap(Rectangle r1, Rectangle r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    public Rectangle createOverlappingRectangle() {
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

    public boolean isCheckOverlap() {
        if ((((r2.x1 >= r1.x1 && r2.x1 <= r1.x2) || (r2.x2 >= r1.x1 && r2.x2 <= r1.x2))
                && ((r2.y1 >= r1.y1 && r2.y1 <= r1.y3) || (r2.y3 >= r1.y1 && r2.y3 <= r1.y3)))
                || (((r1.x1 >= r2.x1 && r1.x1 <= r2.x2) || (r1.x2 >= r2.x1 && r1.x2 <= r2.x1))
                        && ((r1.y1 >= r2.y1 && r1.y1 <= r2.y3) || (r1.y3 >= r2.y1 && r1.y3 <= r2.y3)))) {
            return true;
        } else {
            return false;
        }
    }
}
