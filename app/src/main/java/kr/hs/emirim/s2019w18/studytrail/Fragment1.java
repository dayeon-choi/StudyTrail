package kr.hs.emirim.s2019w18.studytrail;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment {

    @Override
    public ViewGroup onCreateView(LayoutInflater inflater, ViewGroup container, Bundle SavedInstanceState){
        ViewGroup rootView=(ViewGroup)inflater.inflate(R.layout.fragment1,container,false);
        initUI(rootView);
        return rootView;
    }

    private void initUI(ViewGroup rootView){

    }

}
