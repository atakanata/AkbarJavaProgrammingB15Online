package day40;

public class SpaceShip {

    String name;
    String currentDirection;
    int x;
    int y;

    /**
     * provide initial position of spaceship
     *
     * @param newX
     * @param newY
     */
    public void setInitialPosition(int newX, int newY) {
        x = newX;
        y = newY;
    }

    /**
     * Accept 1 String parameter to set the direction to either up , down , right , left
     *
     * @param newDirection
     */
    public void setDirection(String newDirection) {

        // direction can only be up , down , right , left
        if (newDirection.equalsIgnoreCase("up") ||
                newDirection.equalsIgnoreCase("down") ||
                newDirection.equalsIgnoreCase("right") ||
                newDirection.equalsIgnoreCase("left")) {

            currentDirection = newDirection;
        } else {
            System.out.println("Invalid Direction");
            // we set the direction to empty value if user pass wrong direction
            currentDirection = "";
        }
    }

    /**
     * move the spaceship to 1 block according to the currect direction
     */
    public void move1Block() {
        // currentDirection CAN NOT BE NULL
        // OR IT WILL THROW AN EXCEPTION
        switch (currentDirection) {
            case "right":
                x += 1;  // increasing x coordinate by 1 if spaceship move right
                break;
            case "left":
                x -= 1; // decreasing x coordinate by 1 if spaceship move left
                break;
            case "up":
                y += 1;  // increasing y coordinate by 1 if spaceship move up
                break;
            case "down":
                y -= 1;  // decreasing y coordinate by 1 if spaceship move down
                break;
            default:
                break;
        }

    }

    // right click in your class anywhere
    // select generate
    // select toString -->> Hit enter
    // Delete @override
    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", currentDirection='" + currentDirection + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    /*
    * Create a class called SpaceShip

it has 4 attributes :
	name as String
	currentDirection as String  | up , down , right, left
	xCordinate as int
	yCordinate as int


 few behaviours :

 	 setInitialPosition void method
 	 	accept 2 int parameters
 	 	to provide initial position of spaceship

 	 setDirection  void method
 	 	accept 1 String parameter to set the direction

 	 move1Block    void method
 	 	accept no parameter
 	 	and change the position according to the direction

 	 toString method
 	 	return String reperesntation of Spaceship Object







    * */

}
