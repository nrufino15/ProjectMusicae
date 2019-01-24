package com.example.projectmusicae;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


public class FavoritesFragment extends Fragment {


    public FavoritesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_favorites, container, false);


//        EditText tal = view.findViewById(R.id)


                // en la activity muchas veces ponias "this"
                // en el fragment, casi siempre, en lugar de "this" pones "getActivity()"

        return view;
    }

}
