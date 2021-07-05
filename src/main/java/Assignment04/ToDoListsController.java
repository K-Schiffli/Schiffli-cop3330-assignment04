package Assignment04;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.input.InputMethodEvent;

public class ToDoListsController {
    public ChoiceBox listChoiceBox;
    public Button editTitleButton;
    public Button saveAllListsButton;
    public Button newListButton;
    public Button loadAllListsButton;
    public TableView itemsTable;
    public TableColumn doneColumn;
    public TableColumn dueDateColumn;
    public TableColumn descriptionColumn;
    public Button newItemButton;
    public Button deleteItemButton;
    public Button saveListButton;
    public Button deleteListButton;
    public Button completeButton;
    public Button loadListButton;

    public void clickedNewList(ActionEvent actionEvent) {
        //Show a pop-up window prompting for the title
        //Get the title from the pop-up window
        //Call the addList function with that title
        //Refresh the content of the selection box
    }

    public void clickedDeleteList(ActionEvent actionEvent) {
        //Get the list object the user has selected
        //Pass that object into the removeList function
        //Refresh the content of the selection box
    }

    public void clickedEditTitle(ActionEvent actionEvent) {
        //Get the list object the user has selected
        //Show a pop-up window prompting for the new title
        //Call the setTitle method of the specified list object
        //Refresh the content of the selection box
    }

    public void editedDueDate(TableColumn.CellEditEvent cellEditEvent) {
        //Get the item the user has selected
        //Get the current text of the column
        //Call the setDueDate method of the specified item
        //Refresh the displayed list
    }

    public void editedDescription(TableColumn.CellEditEvent cellEditEvent) {
        //Get the item the user has selected
        //Get the current text of the column
        //Call the setDueDate method of the specified item
        //Refresh the displayed list
    }

    public void clickedSaveAllLists(ActionEvent actionEvent) {
        //Open an Explorer window to get the save folder
        //Alternatively, display a pop-up box to prompt for the save folder
        //call the saveAllLists method of the list handler with the specified save folder
    }

    public void clickedLoadAllLists(ActionEvent actionEvent) {
        //Open an Explorer window to get the save folder
        //Alternatively, display a pop-up box to prompt for the location of the save folder
        //Call the loadAllLists method of the list handler with the specified save folder
        //Refresh the content of the selection box
    }

    public void clickedNewItem(ActionEvent actionEvent) {
        //Get the current ToDoList object
        //Call the addItem method of the current object
        //Refresh the displayed list
    }

    public void clickedDeleteItem(ActionEvent actionEvent) {
        //Get the current ToDoList object
        //Get the selected ToDoItem
        //Call the removeItem method of the current object with the selected item
        //Refresh the displayed list
    }

    public void clickedSaveList(ActionEvent actionEvent) {
        //Get the selected list object
        //Open an Explorer window to get the save folder path
        //Alternatively, display a pop-up box to prompt for the save folder path
        //Call the saveList function of the current list object with the requested save folder
    }

    public void clickedLoadList(ActionEvent actionEvent) {
        //Open an Explorer window to get the file path
        //Alternatively, display a pop-up box to prompt for the file path
        //Call the loadList method of the list handler to load the specified list into the List of lists
        //Refresh the content of the selection box
    }

    public void clickedCompleteButton(ActionEvent actionEvent) {
        //Check the completeness of the selected item.
            //If it's false, set it to true
            //Else if it's true, set it to false
        //Refresh the table with the current values
    }

    public void clickedFilterComp(ActionEvent actionEvent) {
        //Call the filterItems method of the selected list with true as the parameter
        //Load the returned list into the table
    }

    public void clickedFilterIncomp(ActionEvent actionEvent) {
        //Call the filterItems method of the selected list with false as the parameter
        //Load the returned list into the table
    }

    public void clickedFilterAll(ActionEvent actionEvent) {
        //Refresh the table by calling the getItems method of the selected list object
    }
}
