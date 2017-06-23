package com.example.habaussoftware.piccreator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.v4.app.Fragment;
/**
 * Created by Habaus Software on 6/8/2017.
 */

public class BottomPictureFragment extends android.support.v4.app.Fragment {





     private static TextView TopMemeText;
    private static  TextView BottomMemeText;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_picture_fragment,container,false);
        TopMemeText = (TextView) view.findViewById(R.id.TopMemeText);
        BottomMemeText = (TextView)view.findViewById(R.id.BottomMemeText);

        return view;
    }
    public void setMemeText(String top,String bottom){
        TopMemeText.setText(top);
        BottomMemeText.setText(bottom);
    }
}
