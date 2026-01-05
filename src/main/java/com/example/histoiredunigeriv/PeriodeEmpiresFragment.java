package com.example.histoiredunigeriv;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class PeriodeEmpiresFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_periode_simple, container, false);

        TextView textView = view.findViewById(R.id.textViewContent);
        textView.setText("Période des Empires du Niger...");

        return view;
    }
}
