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

    //set current room
    public void moveToRoom(Room newRoom)
    {
        this.currentRoom = newRoom;
        currentRoom.printRoom();
    }

    public String getName()
    {
        return this.playerName;
    }

    //prints inventory with descriptions
    public void printInventory()
    {
        for(int i = 0; i < this.inventory.size(); i++)
        {
            System.out.println((i + 1) + "." + this.inventory.get(i).getItemName() + " : " + this.inventory.get(i).getItemDescription());
        }
    }
}