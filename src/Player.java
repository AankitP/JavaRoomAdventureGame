import java.util.ArrayList;

public class Player 
{
    private final String playerName;
    private Room currentRoom;
    private ArrayList<Item> inventory = new ArrayList<Item>();
    
    //constructor
    public Player(String playerName, Room starterRoom) {
        this.currentRoom = starterRoom;
        this.playerName = playerName;
    }

    //adder
    public void addToInventory(Item addedItem)
    {
        this.inventory.add(addedItem);
    }

    //getters
    public Room getCurrentRoom()
    {
        return this.currentRoom;
    }

    public String getName()
    {
        return this.playerName;
    }




}