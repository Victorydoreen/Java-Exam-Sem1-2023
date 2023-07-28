
//Question 2(ii)
//Importing the required libraries

//java class Restaurant
public class Restaurant {
    private String menuItems;
    private double prices;
    private int ratings;

//    A constructor to initialize the different attributes
    public Restaurant(String menuItems, double prices, int ratings) {
        this.menuItems = menuItems;
        this.prices = prices;
        this.ratings = ratings;
    }

//    Getters and setters to help us in accessing different attributes and updating them
    public String getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(String menuItems) {
        this.menuItems = menuItems;
    }

    public double getPrices() {
        return prices;
    }

    public void setPrices(double prices) {
        this.prices = prices;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }
    public String addMenuItems(){
        return menuItems;
    }
    public String removeMenuItems(){
        return menuItems;
    }
//    public void calculateAverageRating()

//    }

}
