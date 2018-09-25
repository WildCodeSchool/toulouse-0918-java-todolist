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

        ListView listView = findViewById(R.id.list_todo);

        ArrayList<Todo> todos = new ArrayList<>();
        todos.add(new Todo("jamie doit faire les courses", true));
        todos.add(new Todo("jamie aller manger des tacos", false));
        todos.add(new Todo("jamie du poney et des ...", false));

        TodoAdapter adapter = new TodoAdapter(this,todos );
        listView.setAdapter(adapter);
        // une ListView dans le layout activity_main
        // une classe fr.wildcodeschool.todolist.Todo : attributs String description, boolean done
        // un layout d'item_todo qui va présenter une case de la liste
        // créer des instances de la classe fr.wildcodeschool.todolist.Todo stockées dans un tableau (ArrayList)


        // un Adapter : de mettre en relation les données avec les items de la ListView
    }


}
