public class East extends Direction{
    @Override
    Direction turnRight() {
        return new South();
    }

    @Override
    Direction turnLeft() {
        return new North();
    }

    @Override
    Location goAhead(Location location) {

        location.incrementX();
        return location;
    }

    @Override
    Location goBack(Location location) {

        location.decrementX();
        return location;
    }
}
