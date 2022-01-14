package com.example.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> todoList;
    ArrayAdapter<String> arrayAdapter;
    ListView listView;

    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        todoList = new ArrayList<>();
        // ArrayAdapter takes 3 params
        // context,TextView layout ressource to be displayed in the listview,
        // and finally the List object toDoList
        arrayAdapter = new ArrayAdapter<>(this,R.layout.list_view_layout,todoList);
        listView = findViewById(R.id.id_list_view);

        listView.setAdapter(arrayAdapter);
        editText = findViewById(R.id.id_edit_text);

    }

    public void addItemToList(View view){
        todoList.add(editText.getText().toString());
        arrayAdapter.notifyDataSetChanged();

        editText.setText("");
    }
}