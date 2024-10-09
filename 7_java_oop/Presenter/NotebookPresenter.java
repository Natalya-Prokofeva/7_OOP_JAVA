package presenter;

import model.Event;
import model.EventRepository;
import view.NotebookView;
import java.time.LocalDateTime;
import java.util.List;

public class NotebookPresenter {
    private EventRepository repository;
    private NotebookView view;

    public NotebookPresenter(EventRepository repository, NotebookView view) {
        this.repository = repository;
        this.view = view;
    }

    public void addEvent(String description, LocalDateTime time) {
        Event event = new Event(description, time);
        repository.addEvent(event);
        view.showEventAdded(event);
    }

    public void removeEvent(Event event) {
        repository.removeEvent(event);
        view.showEventRemoved(event);
    }

    public void showAllEvents() {
        List<Event> events = repository.getAllEvents();
        view.displayEvents(events);
    }
}