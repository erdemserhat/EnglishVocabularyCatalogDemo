package com.erdemserhat.englishvocabularycatalog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;

import com.erdemserhat.englishvocabularycatalog.databinding.ActivityDetailsBinding;

public class ActivityDetails extends AppCompatActivity {
    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityDetailsBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);

        Vocabulary cat = new Vocabulary("Cat","a small animal with fur, four legs, and a tail that is kept as a pet",R.drawable.cat);
        Vocabulary computer = new Vocabulary("Computer","an electronic machine that can store and arrange large amounts of information",R.drawable.computer);
        Vocabulary doctor = new Vocabulary("Doctor","a person whose job is to treat people who have an illness or injury",R.drawable.doctor);
        




    }
}