abstract class Direction {

    abstract Direction turnRight();

    abstract Direction turnLeft();

    abstract Location goAhead(Location location);

    abstract Location goBack(Location location);
}

