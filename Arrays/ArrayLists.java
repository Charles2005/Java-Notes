package Arrays;

import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args){
        // Initialization of Array List
        ArrayList<String> groceryList = new ArrayList<>();

        addItems("Ps5", groceryList);
        addItems("Electric Guitar", groceryList);
        addItems("Guitar String", groceryList);
        addItems("Graphic Tablet", groceryList);

        outputItem(groceryList);
        removeItem(groceryList, 1);
        outputItem(groceryList);

       replaceItem(groceryList, 1, "Audio Interface");
       outputItem(groceryList);
    }
    public static void addItems(String item, ArrayList<String> groceryList){
        groceryList.add(item);

    }
    public static void outputItem(ArrayList<String> groceryList){
        System.out.println("You have " + groceryList.size() + " items in your list." );
        for(int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1) +". " + groceryList.get(i)  );
        }
    }
    public static void replaceItem(ArrayList<String> groceryList, int position, String newItem){
        groceryList.set(position - 1, newItem);
        System.out.println("Grocery item " + (position -1) + " has been modified");

    }
    public static void removeItem(ArrayList<String> groceryList, int position){

        String item = groceryList.get(position - 1);
        groceryList.remove(position - 1);
    }
}
