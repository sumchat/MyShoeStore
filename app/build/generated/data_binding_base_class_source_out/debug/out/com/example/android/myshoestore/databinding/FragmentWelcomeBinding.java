// Generated by data binding compiler. Do not edit!
package com.example.android.myshoestore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.android.myshoestore.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentWelcomeBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final Button welcomebutton;

  protected FragmentWelcomeBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imageView2, TextView textView, TextView textView2, Button welcomebutton) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageView2 = imageView2;
    this.textView = textView;
    this.textView2 = textView2;
    this.welcomebutton = welcomebutton;
  }

  @NonNull
  public static FragmentWelcomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_welcome, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentWelcomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentWelcomeBinding>inflateInternal(inflater, R.layout.fragment_welcome, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentWelcomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_welcome, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentWelcomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentWelcomeBinding>inflateInternal(inflater, R.layout.fragment_welcome, null, false, component);
  }

  public static FragmentWelcomeBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentWelcomeBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentWelcomeBinding)bind(component, view, R.layout.fragment_welcome);
  }
}