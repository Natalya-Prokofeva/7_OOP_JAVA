package main;

import model.FileEventRepository;
import presenter.NotebookPresenter;
import view.ConsoleNotebookView;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        FileEventRepository repository = new FileEventRepository();
        ConsoleNotebookView view = new ConsoleNotebookView();
        NotebookPresenter presenter = new NotebookPresenter(repository, view);

        presenter.addEvent("Встреча с командой", LocalDateTime.now().plusDays(1));
        presenter.showAllEvents();
    }
}

