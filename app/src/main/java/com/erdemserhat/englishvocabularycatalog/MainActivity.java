package com.erdemserhat.englishvocabularycatalog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import com.erdemserhat.englishvocabularycatalog.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {
    //Adding View Binding Feature 1.
    private ActivityMainBinding binding;
    ArrayList <Vocabulary> vocabularyArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Adding View Binding Feature 2. (Initialize the "binding" variable), xml-code connection
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //Data

        Vocabulary cat = new Vocabulary("Cat","a small animal with fur, four legs, and a tail that is kept as a pet",R.drawable.cat);
        Vocabulary computer = new Vocabulary("Computer","an electronic machine that can store and arrange large amounts of information",R.drawable.computer);
        Vocabulary doctor = new Vocabulary("Doctor","a person whose job is to treat people who have an illness or injury",R.drawable.doctor);

        vocabularyArrayList.add(cat);
        vocabularyArrayList.add(computer);
        vocabularyArrayList.add(doctor);

        //Adapter (provide a connection  : list-data-xml

        //List View

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                vocabularyArrayList.stream().map(vocabulary -> vocabulary.getName()).collect(Collectors.toList())
                                                           //Mapping
        );

        binding.listView.setAdapter(arrayAdapter);



    }
}