package com.example.fragmentbasedapp;

import android.content.Context;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.app.Fragment;
import android.util.Log;



public class FragmentOne extends Fragment {

    private static final String TAG = "17020621";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.i (TAG, "Enter OnCreateView");
        return inflater.inflate(R.layout.fragment_fragment_one, container, false);

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i (TAG, "Enter OnAttach");
    }



    @Override
    public void onStart() {
        super.onStart();
        Log.i (TAG, "Enter OnStartView");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i (TAG, "Enter OnResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i (TAG, "Enter OnPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i (TAG, "Enter OnStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i (TAG, "Enter OnDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i (TAG, "Enter OnDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i (TAG, "Enter OnDetach");
    }
}
