package this_example2;

public class Box {
    int height;
    int width;
    int length;

    public Box(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public Box(int width) {
        this.width = this.height = width*width;
    }

}
