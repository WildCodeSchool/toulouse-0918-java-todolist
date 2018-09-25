package fr.wildcodeschool.todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class TodoAdapter extends ArrayAdapter<Todo> {
    public TodoAdapter(Context context, ArrayList<Todo> todos) {
        super(context, 0, todos);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Todo todo = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_todo, parent, false);
        }
        // Lookup view for data population
        TextView description =  convertView.findViewById(R.id.thingtodo);
        CheckBox done =  convertView.findViewById(R.id.checkBox_done);
        // Populate the data into the template view using the data object
        description.setText(todo.getDescription());
        done.setChecked(todo.isDone());
        // Return the completed view to render on screen
        return convertView;
    }
}
