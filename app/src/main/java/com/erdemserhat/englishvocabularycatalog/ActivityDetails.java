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






    }
}