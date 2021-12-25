package com.example.android.myshoestore;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ShoeDetailFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private ShoeDetailFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private ShoeDetailFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ShoeDetailFragmentArgs fromBundle(@NonNull Bundle bundle) {
    ShoeDetailFragmentArgs __result = new ShoeDetailFragmentArgs();
    bundle.setClassLoader(ShoeDetailFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("ShoeId")) {
      long ShoeId;
      ShoeId = bundle.getLong("ShoeId");
      __result.arguments.put("ShoeId", ShoeId);
    } else {
      throw new IllegalArgumentException("Required argument \"ShoeId\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public long getShoeId() {
    return (long) arguments.get("ShoeId");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("ShoeId")) {
      long ShoeId = (long) arguments.get("ShoeId");
      __result.putLong("ShoeId", ShoeId);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    ShoeDetailFragmentArgs that = (ShoeDetailFragmentArgs) object;
    if (arguments.containsKey("ShoeId") != that.arguments.containsKey("ShoeId")) {
      return false;
    }
    if (getShoeId() != that.getShoeId()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (int)(getShoeId() ^ (getShoeId() >>> 32));
    return result;
  }

  @Override
  public String toString() {
    return "ShoeDetailFragmentArgs{"
        + "ShoeId=" + getShoeId()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(ShoeDetailFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(long ShoeId) {
      this.arguments.put("ShoeId", ShoeId);
    }

    @NonNull
    public ShoeDetailFragmentArgs build() {
      ShoeDetailFragmentArgs result = new ShoeDetailFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setShoeId(long ShoeId) {
      this.arguments.put("ShoeId", ShoeId);
      return this;
    }

    @SuppressWarnings("unchecked")
    public long getShoeId() {
      return (long) arguments.get("ShoeId");
    }
  }
}
