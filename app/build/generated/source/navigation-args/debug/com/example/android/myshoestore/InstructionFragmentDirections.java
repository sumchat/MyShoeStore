package com.example.android.myshoestore;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class InstructionFragmentDirections {
  private InstructionFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionInstructionFragmentToMyShoeListFragment2() {
    return new ActionOnlyNavDirections(R.id.action_instructionFragment_to_myShoeListFragment2);
  }
}
