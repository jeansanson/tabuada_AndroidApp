package com.example.tabuada;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button);
        final EditText editText = findViewById(R.id.editText);
        final ListView listView = findViewById(R.id.listview);


        editText.setText("");

        View.OnClickListener tabuada = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero = Integer.valueOf(editText.getText().toString());
                editText.setText("");
                List<Integer> numeroTabuada = new ArrayList<>();
                for(int i=1; i<=10; i++){
                    numeroTabuada.add(numero*i);
                }
                editText.setText("");
                ArrayAdapter<Integer> tabuadaAdapter =
                        new ArrayAdapter<Integer>(MainActivity.this, android.R.layout.simple_list_item_1, numeroTabuada);
                listView.setAdapter(tabuadaAdapter);
            }
        };
        button.setOnClickListener(tabuada);
    }
}
