package com.example.fragmenttest;

import android.os.Bundle;

import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.fragmenttest.databinding.FragmentBlankBinding;
import com.example.fragmenttest.databinding.FragmentSecondBinding;


public class BlankFragment extends Fragment {

    private FragmentBlankBinding binding;

    public BlankFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentBlankBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView t = binding.textView1;
                t.setText("Hejadnsadladadklmwad");
            }
        });




    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}