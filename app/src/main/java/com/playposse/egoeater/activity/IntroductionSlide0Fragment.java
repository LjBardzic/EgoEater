package com.playposse.egoeater.activity;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.playposse.egoeater.R;

/**
 * A {@link Fragment} that is shown after the user logs on for the first time. It explains the app
 * to the user.
 */
public class IntroductionSlide0Fragment extends Fragment {

    public IntroductionSlide0Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_introduction_slide0, container, false);
    }
}
