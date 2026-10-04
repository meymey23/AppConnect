package com.example.appconnect;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import android.util.Log;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.appconnect.databinding.FragmentRegisterBinding;


public class RegisterFragment extends Fragment {

    FragmentRegisterBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Toast.makeText(requireContext().getApplicationContext(), "F1 onViewCreated", Toast.LENGTH_SHORT).show();
        var view= inflater.inflate(R.layout.fragment_register,container,false);
        TextView tv = view.findViewById(R.id.btnRegister);
        tv.setOnClickListener(v->{
            Navigation.findNavController(view).popBackStack();
        });
        return view;

    }




}