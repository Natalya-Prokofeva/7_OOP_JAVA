package view;

import model.Event;
import java.util.List;

public interface NotebookView {
    void displayEvents(List<Event> events);
    void showEventAdded(Event event);
    void showEventRemoved(Event event);
    void showError(String message);
}