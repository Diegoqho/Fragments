package com.example.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Descripcion extends Fragment {

    View view;
    TextView titulos;
    TextView detalles;
    ImageView avatares;

    public Descripcion() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_descripcion, container, false);

        titulos = view.findViewById(R.id.listdata);
        avatares = view.findViewById(R.id.imageView);
        detalles = view.findViewById(R.id.detalle);

        Bundle bundle = this.getArguments();
        String tit = bundle.getString("titulo");
        String det = bundle.getString("detalle");
        int av = bundle.getInt("avatar");

        titulos.setText(tit);
        detalles.setText(det);
        avatares.setImageResource(av);

        return view;
    }
}