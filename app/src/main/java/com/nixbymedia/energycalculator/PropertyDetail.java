package com.nixbymedia.energycalculator;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class PropertyDetail extends Fragment {

    //Context context;
    Spinner spinner;


    public PropertyDetail() {
        // Required empty public constructor
        //this.context = ctx;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_property_detail, container, false);


        spinner_values(view, R.id.climate_location);

        return view;
    }



    private void spinner_values(View v, int id){
        spinner = v.findViewById(id);
        List age = new ArrayList<Integer>();
        for (int i = 1; i <= 100; i++) {
            age.add(Integer.toString(i));
        }
        ArrayAdapter<Integer> spinnerArrayAdapter = new ArrayAdapter<Integer>(
               v.getContext(), android.R.layout.simple_spinner_item, age);
        spinnerArrayAdapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item );

        spinner.setAdapter(spinnerArrayAdapter);
    }

}
