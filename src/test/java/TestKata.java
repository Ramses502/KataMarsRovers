import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestKata {

    @Test
    void test_go_ahead(){
        Rover rover = new Rover(0,0);
        Mars mars = rover.mars;

        Character[] orders = {'F'};
        rover.followOrders(orders);
        assertEquals(1,rover.getY());
        assertEquals(0,rover.getX());
    }

    @Test
    void test_go_back(){
        Rover rover = new Rover(0,0);
        Mars mars = rover.mars;

        Character[] orders = {'B'};
        rover.followOrders(orders);
        assertEquals(-1,rover.getY());
        assertEquals(0,rover.getX());
    }

    @Test
    void test_turn_left(){
        Rover rover = new Rover(0,0);
        Mars mars = rover.mars;

        Character[] orders = {'L'};
        rover.followOrders(orders);
        assert(rover.getDirection() instanceof West);
        assertEquals(0,rover.getX());
        assertEquals(0,rover.getY());
    }

    @Test
    void test_turn_right(){
        Rover rover = new Rover(0,0);
        Mars mars = rover.mars;

        Character[] orders = {'R'};
        rover.followOrders(orders);
        assert(rover.getDirection() instanceof East);
        assertEquals(0,rover.getX());
        assertEquals(0,rover.getY());
    }

    @Test
    void test_turn_left_and_go_ahead(){
        Rover rover = new Rover(0,0);
        Mars mars = rover.mars;

        Character[] orders = {'L','F'};
        rover.followOrders(orders);
        assert(rover.getDirection() instanceof West);
        assertEquals(-1,rover.getX());
        assertEquals(0,rover.getY());
    }

    @Test
    void test_turn_left_and_go_back(){
        Rover rover = new Rover(0,0);
        Mars mars = rover.mars;

        Character[] orders = {'L','B'};
        rover.followOrders(orders);
        assert(rover.getDirection() instanceof West);
        assertEquals(1,rover.getX());
        assertEquals(0,rover.getY());
    }

    @Test
    void test_turn_right_and_go_ahead(){
        Rover rover = new Rover(0,0);
        Mars mars = rover.mars;

        Character[] orders = {'R','F'};
        rover.followOrders(orders);
        assert(rover.getDirection() instanceof East);
        assertEquals(1,rover.getX());
        assertEquals(0,rover.getY());
    }

    @Test
    void test_turn_right_and_go_back(){
        Rover rover = new Rover(0,0);
        Mars mars = rover.mars;

        Character[] orders = {'R','B'};
        rover.followOrders(orders);
        assert(rover.getDirection() instanceof East);
        assertEquals(-1,rover.getX());
        assertEquals(0,rover.getY());
    }

    @Test
    void test_turn_until_south_and_go_ahead(){
        Rover rover = new Rover(0,0);
        Mars mars = rover.mars;

        Character[] orders = {'R','R','F'};
        rover.followOrders(orders);
        assert(rover.getDirection() instanceof South);
        assertEquals(0,rover.getX());
        assertEquals(-1,rover.getY());
    }

    @Test
    void test_turn_until_south_and_go_back(){
        Rover rover = new Rover(0,0);
        Mars mars = rover.mars;

        Character[] orders = {'R','R','B'};
        rover.followOrders(orders);
        assert(rover.getDirection() instanceof South);
        assertEquals(0,rover.getX());
        assertEquals(1,rover.getY());
    }

    @Test
    void test_upper_limits(){
        Rover rover = new Rover(0,0);
        Mars mars = rover.mars;

        Character[] orders = {'F','F','F','F','F','F','F','F','F','F','F'};
        rover.followOrders(orders);
        assert(rover.getDirection() instanceof North);
        assertEquals(0,rover.getX());
        assertEquals(-10,rover.getY());
    }

    @Test
    void test_bottom_limits(){
        Rover rover = new Rover(0,0);
        Mars mars = rover.mars;

        Character[] orders = {'B','B','B','B','B','B','B','B','B','B','B'};
        rover.followOrders(orders);
        assert(rover.getDirection() instanceof North);
        assertEquals(0,rover.getX());
        assertEquals(10,rover.getY());
    }

    @Test
    void test_left_limits(){
        Rover rover = new Rover(0,0);
        Mars mars = rover.mars;

        Character[] orders = {'L','F','F','F','F','F','F','F','F','F','F','F'};
        rover.followOrders(orders);
        assert(rover.getDirection() instanceof West);
        assertEquals(10,rover.getX());
        assertEquals(0,rover.getY());
    }

    @Test
    void test_right_limits(){
        Rover rover = new Rover(0,0);
        Mars mars = rover.mars;

        Character[] orders = {'R','F','F','F','F','F','F','F','F','F','F','F'};
        rover.followOrders(orders);
        assert(rover.getDirection() instanceof East);
        assertEquals(-10,rover.getX());
        assertEquals(0,rover.getY());
    }
}
