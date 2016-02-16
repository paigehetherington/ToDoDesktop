package theironyard;

import com.sun.tools.javac.comp.Todo;
import com.sun.xml.internal.bind.v2.TODO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{  //create special initialize method to run code right after launches
    ObservableList<ToDoItem> items = FXCollections.observableArrayList();

    @FXML
    ListView list; //same name as in SB for list view in code

    @FXML
    TextField text;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    //connect list to items
        list.setItems(items);
    }

    public void addItem() {
        items.add(new ToDoItem(text.getText()));
        text.setText("");
    }
    public void removeItem() {
        ToDoItem item = (ToDoItem) list.getSelectionModel().getSelectedItem();
        items.remove(item);

    }
    public void toggleItem(){
        ToDoItem item = (ToDoItem) list.getSelectionModel().getSelectedItem();
        if (item != null) {
            item.isDone = !item.isDone; //to flip toggle
            list.setItems(null);
            list.setItems(items); //list will display updated values
        }
    }


}
