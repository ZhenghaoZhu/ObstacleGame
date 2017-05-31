import java.awt.*;

public class VerticalEnemy extends Enemy  {
  private int yS;
  private int sH;
    public VerticalEnemy(int x, int y, int w, int h, int sH, int yS) {
     super(x, y, w, h);
     this.yS = yS;
     this.sH = sH;
    }
    public Color getColor(){
      return Color.RED;
    }
    public void move(){
      super.move();
      Rectangle rect = getRectangle();
      rect.y+= yS;
      if(rect.y < 0 || rect.y + rect.height > sH){
        yS *= -1;
      }
    }
    
    

}