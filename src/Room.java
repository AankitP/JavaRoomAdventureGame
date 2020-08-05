//imports
import java.util.ArrayList;

public class Room 
{
    //fields
    private String Roomname; 
    private String colorOfRoom;//Color of the room
    private ArrayList<String> exitList = new ArrayList<String>();//list of exits
    private ArrayList<Item> itemList = new ArrayList<Item>();//list of items within the room

    //default constructor
    public Room() 
    {
        this.Roomname = "Room";
        this.colorOfRoom = "White";
    }

    //constructor
    public 

    //getters
    public String getThisRoomsColor()
    {
        return this.colorOfRoom;
    }

    public ArrayList<String> getExits()
    {
        return this.exitList;
    }

    public ArrayList<Item> getItemList()
    {
        return this.itemList;
    }

    //setters
    private void setColor(String color)
    {
        this.colorOfRoom = color;
    } 
    
    private void addExit(String e)
    {
        this.exitList.add(e);
    } 

    private void addItem(Item enteredItem)
    {
        this.itemList.add(enteredItem);
    } 



}