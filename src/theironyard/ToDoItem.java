package theironyard;

/**
 * Created by vajrayogini on 2/16/16.
 */
public class ToDoItem {
    String text;
    Boolean isDone;

    public ToDoItem(String text) {
        this.text = text;
        this.isDone = false;
    }

    @Override
    public String toString() {
        return text + (isDone ? " (done)" : ""); //in line conditional. if true return done, else return nothing
    }
}
