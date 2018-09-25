package fr.wildcodeschool.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ToDoModel> toDoModels = new ArrayList<>();
        toDoModels.add(new ToDoModel("acheter des pizzas", true));
        toDoModels.add(new ToDoModel("brosser le chapin", false));
        toDoModels.add(new ToDoModel("récupérer la carte bancaire ahhh", false));

        ListView toDoList = findViewById(R.id.liste_todo);
        TodoAdapter adapterTodoList = new TodoAdapter(this, toDoModels);
        toDoList.setAdapter(adapterTodoList);
    }
}
