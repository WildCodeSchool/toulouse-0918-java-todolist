package fr.wildcodeschool.todolist;

public class Todo {

    private String description;
    private boolean done;

    public Todo(String description, boolean done) {
        this.description = description;
        this.done = done;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
