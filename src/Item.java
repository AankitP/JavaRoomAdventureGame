public class Item 
{
    //fields
    private final boolean isUseable; 
    private final String itemName;
    private final String itemDescription;   

    public Item(boolean isUseable, String itemName, String itemDescription) {
        this.isUseable = isUseable;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
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
}