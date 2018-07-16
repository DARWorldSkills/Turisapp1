package com.davidpopayan.sena.quindioturisticobogota.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.davidpopayan.sena.quindioturisticobogota.Mapas.Todas;
import com.davidpopayan.sena.quindioturisticobogota.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentRestaurantes extends Fragment {


    public FragmentRestaurantes() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_restaurantes, container, false);

        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.btnTodos);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), Todas.class);
                startActivity(intent);

            }
        });

        return view;
    }

}
