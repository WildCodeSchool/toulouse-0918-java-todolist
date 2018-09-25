package fr.wildcodeschool.todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class TodoAdapter extends ArrayAdapter<ToDoModel>{

    public TodoAdapter (Context context, ArrayList<ToDoModel> toDoModels) {
        super(context, 0,toDoModels);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        ToDoModel model = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_list, parent, false);
        }
        // Lookup view for data population
        TextView textViewtodo = (TextView) convertView.findViewById(R.id.TVtodo);
        CheckBox checkBoxdone = (CheckBox) convertView.findViewById(R.id.checkboxdone);
        // Populate the data into the template view using the data object
        textViewtodo.setText(model.getTask());
        checkBoxdone.setChecked(model.isDone());
        // Return the completed view to render on screen
        return convertView;
    }

}
