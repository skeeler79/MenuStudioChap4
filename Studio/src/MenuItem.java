public class MenuItem {

    private int price;
    private String name;
    private String description;
    private String category;
    private int dateCreated;
    private int dateUpdated;
    private boolean isNew = true;

    public MenuItem {
        this.price = price;
        this.name = name;
        this.description = description;
        this.category = category;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
        this.isNew = isNew;

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(int dateCreated) {
        this.dateCreated = dateCreated;
    }

    public int getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(int dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public String newItem ( )
}
