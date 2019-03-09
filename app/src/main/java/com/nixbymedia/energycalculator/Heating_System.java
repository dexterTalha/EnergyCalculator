package com.nixbymedia.energycalculator;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Heating_System extends Fragment {

    Spinner spinner;


    public Heating_System() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_heating_system, container, false);

        spinner_values(view, R.id.spinner_heat_to_air);
        spinner_values(view, R.id.spinner_heat_hydronic);
        spinner_values(view, R.id.spinner_gas);
        spinner_values(view, R.id.spinner_wood_pellet);
        spinner_values(view, R.id.spinner_electric_heater);
        spinner_values(view, R.id.spinner_gas_califont_efficiency);


        return view;
    }



    private void spinner_values(View v, int id){
        spinner = v.findViewById(id);
        List<Integer> age = new ArrayList<>();
        for (int i = 0; i <= 100; i=i+10) {
            age.add(i);
        }
        ArrayAdapter<Integer> spinnerArrayAdapter = new ArrayAdapter<Integer>(
                v.getContext(), android.R.layout.simple_spinner_item, age);
        spinnerArrayAdapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item );

        spinner.setAdapter(spinnerArrayAdapter);
    }

}
