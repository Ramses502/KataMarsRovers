public class Mars {

    int minX;
    int minY;
    int maxX;
    int maxY;
    Obstacle[] obstacles = {new Obstacle(0,1), new Obstacle(2,2)};

    public Mars(){

        this.maxX = 10;
        this.maxY = 10;
        this.minX = -10;
        this.minY = -10;
    }

    private static Mars marsInstance;

    public static Mars getInstance(){
        if(marsInstance == null){
            marsInstance = new Mars();
        }
        return marsInstance;
    }

    public int getMinX() {
        return minX;
    }

    public void setMinX(int minX) {
        this.minX = minX;
    }

    public int getMinY() {
        return minY;
    }

    public void setMinY(int minY) {
        this.minY = minY;
    }

    public int getMaxX() {
        return maxX;
    }

    public void setMaxX(int maxX) {
        this.maxX = maxX;
    }

    public int getMaxY() {
        return maxY;
    }

    public void setMaxY(int maxY) {
        this.maxY = maxY;
    }
}
