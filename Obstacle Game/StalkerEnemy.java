import java.awt.*;

public class StalkerEnemy extends Enemy {
    private Rectangle playerRect;
    public StalkerEnemy(int x, int y, int w, int h, Rectangle p) {
      super(x, y, w, h);
      playerRect = p;
    }
    public Color getColor(){
      return Color.MAGENTA;
    }
    public void move(){
      super.move();
      Rectangle ourRect = getRectangle();
      if(playerRect.x > ourRect.x){
        ourRect.x+=1;
      }
      else{
        ourRect.x-=1;
      }
      if(playerRect.y > ourRect.y){
        ourRect.y+=1;
      }
      else{
        ourRect.y-=1;
      }
    }
    public Image getImage(){
     return ImageLoader.loadCompatibleImage("stalkingalien.png");
    }
       
    
    

}