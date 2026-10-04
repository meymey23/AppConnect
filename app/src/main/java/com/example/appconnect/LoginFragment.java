package com.example.appconnect;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.appconnect.databinding.FragmentLoginBinding;


public class LoginFragment extends Fragment {

    private FragmentLoginBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Toast.makeText(requireContext().getApplicationContext(), "F1 onViewCreated", Toast.LENGTH_SHORT).show();
        FragmentLoginBinding binding = FragmentLoginBinding.inflate(inflater, container, false);
        binding.btnlogin.setOnClickListener(v -> {

            Navigation.findNavController(binding.getRoot()).
                    navigate(R.id.action_loginFragment_to_registerFragment);
        });

        return binding.getRoot();
    }
}