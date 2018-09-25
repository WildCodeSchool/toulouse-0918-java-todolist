package fr.wildcodeschool.todolist;

// afficher une Todo List qui affichera une description de la tâche
// et un status pour dire si la tâche est faite où non


public class ToDoModel {

    private String task;
    private boolean done;

    public ToDoModel (String task, boolean done) {
        this.task = task;
        this.done = done;

    }

    public String getTask(){
        return this.task;
    }

    public void setTask(String newTask){

        this.task = newTask;
    }

    public boolean isDone() {
        return done;
    }
}
