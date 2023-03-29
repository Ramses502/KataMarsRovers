import java.util.HashMap;

public class Rover {
    private Location location;
    private Direction direction;
    Mars mars;

    public Rover(int x, int y){
        this.location = new Location(0,0);
        this.direction= new North();
        this.mars = Mars.getInstance();

        ordersMap.put('L',()-> this.direction = direction.turnLeft());
        ordersMap.put('R',()-> this.direction = direction.turnRight());
        ordersMap.put('F',()-> this.location = direction.goAhead(location));
        ordersMap.put('B',()-> this.location = direction.goBack(location));
    }

    public static Rover getInstance(){
        if(roverInstance == null){
            roverInstance = new Rover(0,0);
        }
        return roverInstance;
    }

    private static Rover roverInstance;

    private final HashMap<Character, Runnable> ordersMap = new HashMap<>();

    public void followOrders(Character[] orders){
        for(Character order : orders){
            ordersMap.get(order).run();
            if(this.getX() > mars.getMaxX()){
                this.location.setX(mars.getMinX());
            }else if(this.getX() < mars.getMinX()){
                this.location.setX(mars.getMaxX());
            }else if(this.getY() > mars.getMaxY()){
                this.location.setY(mars.getMinY());
            }else if(this.getY() < mars.getMinY()){
                this.location.setY(mars.getMaxY());
            }
        }
    }

    public int getX(){
        return this.location.getX();
    }

    public int getY(){
        return this.location.getY();
    }

    public Direction getDirection() {
        return direction;
    }
}
