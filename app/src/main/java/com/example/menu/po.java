package com.example.menu;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;

import com.example.menu.databinding.FragmentPoBinding;
import com.example.menu.databinding.FragmentSlideshowBinding;
import com.example.menu.ui.slideshow.SlideshowViewModel;

public class po extends Fragment {

    private PoViewModel mViewModel;
    private LayoutInflater inflater;
    private ViewGroup container;

    public static po newInstance() {
        return new po();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_po, container, false);
    }

    public boolean PoViewModel (Menu menu) {

        FragmentPoBinding.inflate(inflater, container, false);
        return true;
    }

    private FragmentPoBinding getMenuInflater() {
        return null;
    }


}

