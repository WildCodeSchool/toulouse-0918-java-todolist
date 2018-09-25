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


        // afficher une Todo List qui affichera une description de la tâche
        // et un status pour dire si la tâche est faite où non

        // 1. ListView pour afficher la liste : dans activity_main.xml

        // 2. Créer un layout pour chaque élément de la liste (item)

        // 3. ArrayList (tableau) : pour stocker les données de la liste
        // (stocker les éléments en dur)

        // 4. Créer l'Adapter qui prend les données et les insère dans la ListView


    }
}
