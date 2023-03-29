public class West extends Direction{
    @Override
    Direction turnRight() {
        return new North();
    }

    @Override
    Direction turnLeft() {
        return new South();
    }

    @Override
    Location goAhead(Location location) {

        location.decrementX();
        return location;
    }

    @Override
    Location goBack(Location location) {

        location.incrementX();
        return location;
    }


}
