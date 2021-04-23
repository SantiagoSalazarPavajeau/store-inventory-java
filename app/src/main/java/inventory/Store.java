package inventory;

public class Store {
    public static Inventory inventory = new Inventory();

    public Store(){
        this.inventory = inventory;
    }

    public static void restockItem(Item item){
        if(inventory.stock.containsKey((item.name))){
            inventory.stock.put(item.name, inventory.stock.get(item.name) +1);
        }else{
            inventory.stock.put(item.name, 1);
        }
    }

    public static void buyItem(Item item) {
        if (inventory.stock.containsKey(item.name) && inventory.stock.get(item.name) > 0) {
            inventory.stock.put(item.name, inventory.stock.get(item.name) -1);
        } else {
            System.out.println("Couldn't find " + item.name);
        }
    }
}
