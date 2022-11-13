package ru.mirea.exercise1_2;

public class MovableRectangle implements Movable {
    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    private boolean checkingSpeeds(){
        return ((topLeft.xSpeed == bottomRight.xSpeed) && (topLeft.ySpeed == bottomRight.ySpeed));
    }
    @Override
    public void moveUp(){
        if(checkingSpeeds()){
            topLeft.moveUp();
            bottomRight.moveUp();
        }
        else{
            System.out.println("The speeds of the points do not match");
        }
    }
    @Override
    public void moveDown(){
        if(checkingSpeeds()){
            topLeft.moveDown();
            bottomRight.moveDown();
        }
        else{
            System.out.println("The speeds of the points do not match");
        }
    }
    @Override
    public void moveLeft(){
        if(checkingSpeeds()){
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
        else{
            System.out.println("The speeds of the points do not match");
        }
    }
    @Override
    public void moveRight(){
        if(checkingSpeeds()){
            topLeft.moveRight();
            bottomRight.moveRight();
        }
        else{
            System.out.println("The speeds of the points do not match");
        }
    }
    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
