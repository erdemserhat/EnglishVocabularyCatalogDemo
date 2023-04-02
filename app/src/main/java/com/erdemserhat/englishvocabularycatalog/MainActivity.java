package com.erdemserhat.englishvocabularycatalog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.erdemserhat.englishvocabularycatalog.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {
    //Adding View Binding Feature 1.
    private ActivityMainBinding binding;
    ArrayList<Vocabulary> vocabularyArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Adding View Binding Feature 2. (Initialize the "binding" variable), xml-code connection
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //Data

        Vocabulary cat = new Vocabulary("Cat", "a small animal with fur, four legs, and a tail that is kept as a pet", R.drawable.cat);
        Vocabulary computer = new Vocabulary("Computer", "an electronic machine that can store and arrange large amounts of information", R.drawable.computer);
        Vocabulary doctor = new Vocabulary("Doctor", "a person whose job is to treat people who have an illness or injury", R.drawable.doctor);

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

        //setOnClickListeners Feature...

        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                // i variable is index of the item in the list..
                //When the any item of the list has been clicked then following codes will work...
                Intent intent = new Intent(MainActivity.this, ActivityDetails.class);
                /**We need to hold the data of which item clicked...
                 we can't use the intent.putExtra("vocabulary",vocabularyArrayList.get(i)) because of this, we need to use Serializable interface
                 so we need to implement Serializable class to Vocabulary class
                 */
                intent.putExtra("vocabulary", vocabularyArrayList.get(i));
                startActivity(intent);


            }
        });


    }
}