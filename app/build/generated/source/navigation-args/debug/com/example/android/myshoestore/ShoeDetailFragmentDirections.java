package com.example.android.myshoestore;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class ShoeDetailFragmentDirections {
  private ShoeDetailFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionShoeDetailFragmentToMyShoeListFragment() {
    return new ActionOnlyNavDirections(R.id.action_shoeDetailFragment_to_myShoeListFragment);
  }
}
