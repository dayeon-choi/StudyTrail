package kr.hs.emirim.s2019w18.studytrail;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class Fragment3 extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle SavedInstanceState){
        ViewGroup rootView=(ViewGroup)inflater.inflate(R.layout.fragment3,container,false);
        initUI(rootView);
        return rootView;
    }
    private void initUI(ViewGroup rootView){

    }

}
