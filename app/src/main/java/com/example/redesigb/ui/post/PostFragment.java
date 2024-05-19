package com.example.redesigb.ui.post;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.redesigb.R;

public class PostFragment extends Fragment {

    private PostViewModel postViewModel;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        postViewModel = new ViewModelProvider(this).get(PostViewModel.class);
        View root = inflater.inflate(R.layout.fragment_post, container, false);
        final TextView textView = root.findViewById(R.id.post);
        postViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
