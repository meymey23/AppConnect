package com.example.appconnect;//package com.example.appconnect;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        NavHostFragment navHostFragment =
//                (NavHostFragment) getSupportFragmentManager()
//                        .findFragmentById(R.id.registerFragment);
//
//        if (navHostFragment != null) {
//            NavController navController = navHostFragment.getNavController();
//
//            // Optional: hook up with ActionBar for automatic back button
//            NavigationUI.setupActionBarWithNavController(this, navController);
//        }
//    }
//
//    @Override
//    public boolean onSupportNavigateUp() {
//        // Handle the back button in the ActionBar
//        NavHostFragment navHostFragment =
//                (NavHostFragment) getSupportFragmentManager()
//                        .findFragmentById(R.id.registerFragment);
//
//        if (navHostFragment != null) {
//            return navHostFragment.getNavController().navigateUp();
//        }
//        return super.onSupportNavigateUp();
//
    }
}
