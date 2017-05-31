import java.awt.*;

public class DiagonalEnemy extends VerticalEnemy{
  private int xS;
  private int sW;

    public DiagonalEnemy(int x, int y, int w, int h, int sH, int yS, int sW, int xS) {
      super(x, y, w, h, sH, yS);
      this.xS = xS;
      this.sW = sW;
    }
    public Color getColor(){
      return Color.PINK;
    }
    public void move(){
      super.move();
      Rectangle rect = getRectangle();
      rect.x+=xS;
      if(rect.x < 0 || rect.x + rect.width > sW){
        xS *= -1;
      }
    }

}