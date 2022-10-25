import java.util.ArrayList;

/**
 * A good example of recursion
 *
 * @author Peiran Li
 */
class GroceryItem {
  public String itemName;
  public int itemPrice;
}

public class ShoppingCombination {
  public static final int BAG_SIZE = 3;

  public static void shoppingBagCombination(ArrayList<GroceryItem> currBag,
                                            ArrayList<GroceryItem> remainingItems) {
    int bagValue;
    GroceryItem tempItem;

    if (currBag.size() == BAG_SIZE) {
      bagValue = 0;
      for (int i = 0; i < currBag.size(); i++) {
        bagValue += currBag.get(i).itemPrice;
        System.out.print(currBag.get(i).itemName + " ");
      }
      System.out.println("= $" + bagValue);
    } else {
      for (int i = 0; i < remainingItems.size(); i++) {
        tempItem = remainingItems.get(i);
        remainingItems.remove(i);
        currBag.add(tempItem);

        shoppingBagCombination(currBag, remainingItems);

        // recover the original ArrayList
        remainingItems.add(i, tempItem);
        currBag.remove(currBag.size() - 1);
      }
    }
  }

  public static void main(String[] args) {
    ArrayList<GroceryItem> currBag = new ArrayList<>();
    ArrayList<GroceryItem> remainingItems = new ArrayList<>();

    GroceryItem item1 = new GroceryItem();
    item1.itemName = "Milk";
    item1.itemPrice = 1;
    remainingItems.add(item1);

    GroceryItem item2 = new GroceryItem();
    item2.itemName = "Patato";
    item2.itemPrice = 2;
    remainingItems.add(item2);

    GroceryItem item3 = new GroceryItem();
    item3.itemName = "Pepper";
    item3.itemPrice = 3;
    remainingItems.add(item3);

    GroceryItem item4 = new GroceryItem();
    item4.itemName = "Cheese";
    item4.itemPrice = 4;
    remainingItems.add(item4);

    GroceryItem item5 = new GroceryItem();
    item5.itemName = "Coke";
    item5.itemPrice = 5;
    remainingItems.add(item5);

    shoppingBagCombination(currBag, remainingItems);

  }
}
