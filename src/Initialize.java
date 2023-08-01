
import java.io.*;
import java.util.*;

public class Initialize {
    
    public Item[] initialize(String path) {

        Item[] items;
        String name;
        int price;
        float calories;
        String icon;
        Scanner sc;
        File file = new File(path);
        try {
            sc = new Scanner(file);
        } catch (IOException e) {
            return null;
        }

        int n = sc.nextInt();
        sc.nextLine();
        items = new Item[n];

        for (int i = 0; i < n; i++) {

            name = sc.nextLine();
            price = sc.nextInt();
            calories = sc.nextFloat();
            sc.nextLine();
            icon = sc.nextLine();
            

            Item a = new Item(name, price, calories,icon);

            items[i] = a;
        }
        
        sc.close();

        return items;
    }

    public Record[] createRecord (Item[] items) {

        int n = items.length;

        Record records[] = new Record[n];

        for (int i = 0; i < n; i++) {
            Record newRec = new Record(items[i]);
            records[i] = newRec;
        }
        
        return records;
    }

    public void initializeCreated () {

        ArrayList<Item> ketIng = new ArrayList<>();
        ketIng.add(SpecialVendo.nonSellableItems[0]);
        ketIng.add(SpecialVendo.nonSellableItems[0]);
        ketIng.add(SpecialVendo.nonSellableItems[0]);
        CreatedItem ketchup = new CreatedItem("Ketchup", 0, 1, null, ketIng);

        SpecialVendo.createdItems[0] = ketchup;

        ArrayList<Item> mayoIng = new ArrayList<>();
        mayoIng.add(RegularVendo.sellableItems[8]);
        mayoIng.add(RegularVendo.sellableItems[8]);
        mayoIng.add(RegularVendo.sellableItems[8]);
        CreatedItem mayo = new CreatedItem("Mayonnaise", 0, 2, null, mayoIng);

        SpecialVendo.createdItems[1] = mayo;

        ArrayList<Item> thouIslIng = new ArrayList<>();
        thouIslIng.add(SpecialVendo.createdItems[0]);
        thouIslIng.add(SpecialVendo.createdItems[1]);
        CreatedItem thouIsl = new CreatedItem("Thousand Island", 0, 3, null, thouIslIng);

        SpecialVendo.createdItems[2] = thouIsl;
    }
}
