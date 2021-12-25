package com.example.android.myshoestore;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class LogoutFragmentDirections {
  private LogoutFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionLogoutFragmentToLoginFragment() {
    return new ActionOnlyNavDirections(R.id.action_logoutFragment_to_loginFragment);
  }
}
