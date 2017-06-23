package com.example.habaussoftware.piccreator;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Habaus Software on 6/6/2017.
 */

public class TopSectionFragment extends Fragment {


    private static EditText topTextInput;
    private static EditText bottomTextInput;

    TopSectionListener activitycommander;

    public interface TopSectionListener{
        public  void CreateMeme(String top,String bottom);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            activitycommander =(TopSectionListener) activity;
        }catch (ClassCastException e) {
            throw new  ClassCastException(getActivity().toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_section_fragment,container,false);
        topTextInput =(EditText)view.findViewById(R.id.topTextInput);
        bottomTextInput = (EditText) view.findViewById(R.id.bottomTextInput);
        final Button  button =(Button) view.findViewById(R.id.button);

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        buttonClicked(v);
                    }
                }
        );
        return view;
    }
    public void buttonClicked(View view){
activitycommander.CreateMeme(topTextInput.getText().toString(),bottomTextInput.getText().toString());
    }
}
