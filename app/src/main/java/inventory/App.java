/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inventory;

public class App {

    public static void main(String[] args) {

        Store store = new Store();

        Item item1 = new Item("Corn");
        store.restockItem(item1);
        Item item2 = new Item("Tomato");
        store.restockItem(item2);
        Item item3 = new Item("Corn");
        store.restockItem(item3);
        System.out.println(store.inventory.stock);
        store.buyItem(item1);
        System.out.println(store.inventory.stock);
        store.buyItem(item1);
        store.buyItem(item1);
        Item item4 = new Item("apple");
        store.buyItem(item4);

    }
}