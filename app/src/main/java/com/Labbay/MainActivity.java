package com.Labbay;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.Labbay.fragments.HomeFragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

  BottomNavigationView bottomNavigation;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    bottomNavigation = findViewById(R.id.bottom_navigation);
//    bottomNavigation.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
    openFragment(HomeFragment.newInstance("", ""));
  }

  public void openFragment(Fragment fragment) {
    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
    transaction.replace(R.id.container, fragment);
    transaction.addToBackStack(null);
    transaction.commit();
  }

  /*BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener =
          new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override public boolean onNavigationItemSelected(@NonNull MenuItem item) {

          switch (item.getItemId()) {
            case R.id.navigation_home:
              openFragment(HomeFragment.newInstance("", ""));
              return true;
            case R.id.navigation_sms:
              openFragment(MarketFragment.newInstance("", ""));
              return true;
            case R.id.navigation_notifications:
              openFragment(FinanceFragment.newInstance("", ""));
              return true;
          }
          return false;
        }
      };*/

}
