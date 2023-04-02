package com.erdemserhat.englishvocabularycatalog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.erdemserhat.englishvocabularycatalog.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    //Adding View Binding Feature 1.
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Adding View Binding Feature 2. (Initialize the "binding" variable), xml-code connection
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


    }
}