public class Exit 
{
    //fields
    private String direction;
    private Room whereItLeadsTo;
    private boolean isLocked;

    //constructor
    public Exit(String directon, Room whereItLeadsTo, boolean isLocked)
    {
        this.direction = directon;
        this.whereItLeadsTo = whereItLeadsTo;
        this.isLocked = isLocked;
    }

    //getters
    public String getDirection() {
        return this.direction;
    }

    public Room getWhereItLeadsTo() {
        return this.whereItLeadsTo;
    }

    public boolean isIsLocked() {
        return this.isLocked;
    }

    //setter
    public void setIsLocked(boolean isLocked) {
        this.isLocked = isLocked;
    }
}