package com.example.android.myshoestore;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class LoginFragmentDirections {
  private LoginFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionLoginFragmentToWelcomeFragment() {
    return new ActionOnlyNavDirections(R.id.action_loginFragment_to_welcomeFragment);
  }
}
