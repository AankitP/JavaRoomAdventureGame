//imports
import java.util.Scanner;
import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args)
    {

        //create Room objects
        Room Room1 = new Room();
        Room Room2 = new Room();
        Room Room3 = new Room();
        Room Room4 = new Room();
        
        



    }

    public static ArrayList<Room> setupRooms()
    {
        Room Room1 = new Room();
        Room Room2 = new Room();
        Room Room3 = new Room();
        Room Room4 = new Room();

        ArrayList<Room> RoomList = new ArrayList<Room>();

        //Room1 setup
            Room1.setName("Room 1");//set Room name
            Room1.setColor("Yellow");//set room color
            //Set room Exits
            Exit room1EastExit = new Exit("East", Room2, false);
            Exit room1SouthExit = new Exit("South", Room3, false);
            Room1.addExit(room1EastExit);
            Room1.addExit(room1SouthExit);
            //addRoomFeatures
            RoomFeatures desk = new RoomFeatures();
            Room1.addRoomFeature(feature);
            //addRoomItems
    }

}
