package Assignment04;

import Assignment04.Lists.ToDoList;

public class ListHandler {
    //Create a List of ToDoList objects

    //Create a method to add a new list
    public static void addList(String title){
        //Create a new ToDoList object
        //Use the setTitle method on the new ToDoList object to give it the title passed in from the controller
        //Add the new ToDoList to the List of ToDoList objects
    }

    //Create a method to remove an item from the list
    public static void removeList(ToDoList list){
        //Remove the passed-in ToDoList object from the List
        //Return the updated list of ToDoList objects
    }

    //Create a method to save all lists
    public static void saveAllLists(String directory){
        //Loop through the List of list objects
            //Call the saveList function of each object in the list with the passed-in directory
    }

    //Create a method to load all lists
    public static void loadAllLists(String directory){
        //Load the folder at the passed-in location.
        //Wrap in a Try/Catch in case the file doesn't exist
        //Find every JSON file in the specified folder with the correct name format
        //Add those filenames to a List of Strings

        //Loop through the List of filenames
            //Call the loadList function with the name of every found file
    }

    //Create a method to save a single list
    public static void saveList(String fileName, ToDoList list)
    {
        //Create a new file using an identifier and the title of the list
        //Wrap in a try/catch structure in case it fails to save
        //Convert each ToDoItem in the list into a JSON object
        //Write each JSON object into the file
    }
    //Create a method to save a single list
    public static void loadList(String fileName)
    {
        //Create a new ToDoList object with the title contained in the passed-in filename
        //Open the specified file
        //Wrap in a try/catch structure in case it can't be opened
        //Read in each JSON object from the file
            //Parse the JSON into new ToDoItem objects
            //Save each ToDoItem in the ToDoList object
        //Add the completed ToDoList to the List of ToDoList objects
    }
}
