public class ShapeClass {
    int height, width, x, y;
    int type;
    Color2 color = new Color2();

    void setType(int type) {
        this.type = type;
    }

    void setHeight(int height) {
        this.height = height;
    }

    void setWidth(int width) {
        this.width = width;
    }

    void setX(int x) {
        this.x = x;
    }

    void setY(int y) {
        this.y = y;
    }

    int getHeight() {
        return height;
    }

    int getWidth() {
        return width;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    int getType() {
        return type;
    }

    ShapeClass(Color2 color, int type, int x, int y, int width, int height) {
        this.color = color;
        this.type = type;
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }

}
