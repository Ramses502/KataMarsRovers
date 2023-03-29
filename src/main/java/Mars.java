public class Mars {

    private int minX;
    private int minY;
    private int maxX;
    private int maxY;
    private Obstacle[] obstacles;

    public Mars(){

        this.maxX = 10;
        this.maxY = 10;
        this.minX = -10;
        this.minY = -10;
        this.obstacles = new Obstacle[] {new Obstacle(1, 1), new Obstacle(2, 2)};
    }

    private static Mars marsInstance;

    public static Mars getInstance(){
        if(marsInstance == null){
            marsInstance = new Mars();
        }
        return marsInstance;
    }

    public Obstacle[] getObstacles() {
        return obstacles;
    }

    public void setObstacles(Obstacle[] obstacles) {
        this.obstacles = obstacles;
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
