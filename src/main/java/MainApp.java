import processing.core.PApplet;
public class MainApp extends PApplet {

    public static final int WIDTH = 960;
    public static final int HEIGHT = 480;
    int x=0;

    public static void main(String[] args) {
    PApplet.main("MainApp",args);
    }

    @Override
    public void settings()
    {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        //clearBackground();
        drawCircles();

    }

    private void drawCircles() {

        for (int i = 1; i <5 ; i++) {

            ellipse(x*i,(height/5)*i,10 ,10);

        }
      x++;
    }

    private void clearBackground() {
        background(255);
    }
}
