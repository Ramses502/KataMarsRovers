public class Location {
    int x;
    int y;

    public Location(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void incrementX(){
        this.x += 1;
    }

    public void decrementX(){
        this.x -= 1;
    }

    public void incrementY(){
        this.y += 1;
    }

    public void decrementY(){
        this.y -= 1;
    }

}
