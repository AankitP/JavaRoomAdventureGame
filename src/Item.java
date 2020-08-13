public class Item 
{
    //fields
    private final boolean isUseable; 
    private final String itemName;
    private final String itemDescription;   
    private final boolean canBePickedUp = true;

    public Item(boolean isUseable, String itemName, String itemDescription, boolean canBePickedUp) {
        this.isUseable = isUseable;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.canBePickedUp = canBePickedUp;
    }

    //getters
    public boolean getIsUsable()
    {
        return this.isUseable;
    }

    public String getItemName()
    {
        return this.itemName;
    }

    public String getItemDescription()
    {
        return this.itemDescription;
    }

    public boolean getCanBePickedUp()
    {
        return this.canBePickedUp;
    }
}