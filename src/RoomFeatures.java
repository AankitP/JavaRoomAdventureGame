//imports
import java.util.ArrayList;

public class RoomFeatures extends Item
{
    //fields
    private final String neededToUse;
    private final String placement;
    private boolean isOpen = false;

    public RoomFeatures(String name, String description, String neededToUse, String placment) {
        super(false, name, description, false);
        this.neededToUse = neededToUse;
        this.placement = placment;
    }

    public String getNeededToUse()
    {
        return this.neededToUse;
    }
    
    public String getPlacement()
    {
        return this.placement;
    }

    public boolean getCanBePickedUp()
    {
        return false;
    }

    public void open(ArrayList<Item> inventory)
    {
        if(neededToUse == null)
        {
            this.isOpen = true;
            System.out.println(super.getItemName() + " is open");
        }
        else if(neededToUse != null)
        {
            String a;
            for(int i = 0; i < inventory.size(); i++)
            {
                a = inventory.get(i).getItemName();
                if(a == neededToUse)
                {
                    this.isOpen = true;
                    System.out.println(super.getItemName() + " is open");
                }
            }
        }
        else
        {
            System.out.println(super.getItemName() + " cannot be opened at this time");
        }
        
    }
}