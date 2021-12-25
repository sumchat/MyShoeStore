package com.example.android.myshoestore;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class MyShoeListFragmentDirections {
  private MyShoeListFragmentDirections() {
  }

  @NonNull
  public static ActionMyShoeListFragmentToShoeDetailFragment2 actionMyShoeListFragmentToShoeDetailFragment2(
      long ShoeId) {
    return new ActionMyShoeListFragmentToShoeDetailFragment2(ShoeId);
  }

  public static class ActionMyShoeListFragmentToShoeDetailFragment2 implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionMyShoeListFragmentToShoeDetailFragment2(long ShoeId) {
      this.arguments.put("ShoeId", ShoeId);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionMyShoeListFragmentToShoeDetailFragment2 setShoeId(long ShoeId) {
      this.arguments.put("ShoeId", ShoeId);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("ShoeId")) {
        long ShoeId = (long) arguments.get("ShoeId");
        __result.putLong("ShoeId", ShoeId);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_myShoeListFragment_to_shoeDetailFragment2;
    }

    @SuppressWarnings("unchecked")
    public long getShoeId() {
      return (long) arguments.get("ShoeId");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionMyShoeListFragmentToShoeDetailFragment2 that = (ActionMyShoeListFragmentToShoeDetailFragment2) object;
      if (arguments.containsKey("ShoeId") != that.arguments.containsKey("ShoeId")) {
        return false;
      }
      if (getShoeId() != that.getShoeId()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (int)(getShoeId() ^ (getShoeId() >>> 32));
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionMyShoeListFragmentToShoeDetailFragment2(actionId=" + getActionId() + "){"
          + "ShoeId=" + getShoeId()
          + "}";
    }
  }
}
