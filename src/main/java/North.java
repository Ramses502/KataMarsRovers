public class North extends Direction{

    @Override
    Direction turnRight() {
        return new East();
    }

    @Override
    Direction turnLeft() {
        return new West();
    }

    @Override
    Location goAhead(Location location){
        location.incrementY();
        return location;
    }

    @Override
    Location goBack(Location location) {

        location.decrementY();
        return location;
    }


}
