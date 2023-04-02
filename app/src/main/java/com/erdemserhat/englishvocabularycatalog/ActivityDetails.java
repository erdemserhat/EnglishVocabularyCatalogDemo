package com.erdemserhat.englishvocabularycatalog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;

import com.erdemserhat.englishvocabularycatalog.databinding.ActivityDetailsBinding;

public class ActivityDetails extends AppCompatActivity {
    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //Getting the intent which comes
        Intent intent = getIntent();
        /**Getting the data
         //Vocabulary selectedVocabulary =intent.getSerializableExtra("vocabulary");
         we need to do casting
         */
        Vocabulary selectedVocabulary = (Vocabulary) intent.getSerializableExtra("vocabulary");
        //make visible data
        binding.exampleVocabularyDescription.setText(selectedVocabulary.getDescription());
        binding.exampleVocabularyName.setText(selectedVocabulary.getName());
        binding.exampleVocabularyImage.setImageResource(selectedVocabulary.getImage());


    }
}