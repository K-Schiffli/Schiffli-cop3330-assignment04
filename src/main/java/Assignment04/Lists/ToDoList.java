package Assignment04.Lists;

import Assignment04.Lists.Items.ToDoItem;

import java.util.List;

public class ToDoList {
    //Create a title string parameter for the list
    //Create a List of ToDoItem objects

    //Create a setter method for the title parameter
    public void setTitle(String title) {

        //Set the title parameter to the passed-in string
    }

    //Create a getter method for the title parameter
    public String getTitle() {

        //Return the title

        return null; //temporary return statement
    }

    //Create a method to create a new ToDoItem object and add it to the List of ToDoItem objects
    public void addItem() {
        //Create a new ToDoItem object with placeholder values
        //Add the new ToDoItem to the list
    }

    //Create a method to delete a specified ToDoItem from the list
    public void removeItem(ToDoItem item){
        //Remove the passed-in ToDoItem from the List
    }

    //Create a method to return all the items in the List of ToDoItem objects
    public List<ToDoItem> getItems() {
        //Return the list of ToDoItems

        return null; //temporary return statement
    }

    //Create a method to filter the list by completeness
    public List<ToDoItem> filterItems(boolean selector) {
        //Create a new List of ToDoItems to hold the output

        //Loop through the list
            //Check each item's completeness against the selector
            //If they match, add them to the new list

        //Return the resulting list

        return null; //temporary return statement
    }
}
