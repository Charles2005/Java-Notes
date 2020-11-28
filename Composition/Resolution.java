package Composition;

public class Resolution {
    private int width;
    private int height;
    private int pixel;

    public Resolution(int width, int height, int pixel){
        this.width = width;
        this.height = height;
        this.pixel = pixel;

    }
    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }
    public int getPixel(){return pixel;}
}
