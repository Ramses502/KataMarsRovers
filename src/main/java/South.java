public class South extends Direction{
    @Override
    Direction turnRight() {
        return new West();
    }

    @Override
    Direction turnLeft() {
        return new East();
    }

    @Override
    Location goAhead(Location location) {

        location.decrementY();
        return location;
    }

    @Override
    Location goBack(Location location) {

        location.incrementY();
        return location;
    }

}
