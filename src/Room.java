//imports
import java.util.ArrayList;

public class Room 
{
    //fields
    private String Roomname; 
    private String colorOfRoom;//Color of the room
    private ArrayList<Exit> exitList = new ArrayList<Exit>();//list of exits
    private ArrayList<Item> itemList = new ArrayList<Item>();//list of items within the room
    private ArrayList<RoomFeatures> roomFeatureList = new ArrayList<RoomFeatures>();

    //default constructor
    public Room() 
    {
        this.Roomname = "Room";
        this.colorOfRoom = "White";
    }

    //constructor
    public Room(String roomName, String colorOfRoom)
    {
        this.Roomname = roomName;
        this.colorOfRoom = colorOfRoom;
    }

    //getters
    public String getRoomName()
    {
        return this.Roomname;
    }

    public String getRoomColor()
    {
        return this.colorOfRoom;
    }

    public ArrayList<Exit> getExits()
    {
        return this.exitList;
    }

    public ArrayList<RoomFeatures> getRoomFeatures()
    {
        return this.roomFeatureList;
    }

    public ArrayList<Item> getItemList()
    {
        return this.itemList;
    }

    //setters/adders
    public void setColor(String color)
    {
        this.colorOfRoom = color;
    } 

    public void setName(String name)
    {
        this.Roomname = name;
    }
    
    public void addExit(Exit e)
    {
        this.exitList.add(e);
    } 

    public void addItem(Item enteredItem)
    {
        this.itemList.add(enteredItem);
    } 

    public void addRoomFeature(RoomFeatures feature)
    {
        this.roomFeatureList.add(feature);
    }

    //print room
    public void printRoom()
    {
        System.out.println("You are in " + this.Roomname + 
        "\n\tThe exits in the room are : ");

        for(int i = 0; i< this.exitList.size(); i++)
        {
            System.out.println("\t\t" + exitList.get(i).getDirection());
        }

        System.out.println("\tThe items in the room are : ");

        for(int i = 0; i< this.itemList.size(); i++)
        {
            System.out.println("\t\t" + itemList.get(i).getItemName() + " : " + itemList.get(i).getItemDescription());
        }

        System.out.println("\tThe features of the room are : ");

        for(int i = 0; i< this.roomFeatureList.size(); i++)
        {
            System.out.println("\t\t" + roomFeatureList.get(i).getName() + " : " + roomFeatureList.get(i).getDescription());
        }

    }

}