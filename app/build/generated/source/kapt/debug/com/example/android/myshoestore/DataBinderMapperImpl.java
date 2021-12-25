package com.example.android.myshoestore;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.android.myshoestore.databinding.ActivityMainBindingImpl;
import com.example.android.myshoestore.databinding.FragmentLoginBindingImpl;
import com.example.android.myshoestore.databinding.FragmentLogoutBindingImpl;
import com.example.android.myshoestore.databinding.FragmentShoeDetailBindingImpl;
import com.example.android.myshoestore.databinding.FragmentWelcomeBindingImpl;
import com.example.android.myshoestore.databinding.NavHeaderBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTLOGIN = 2;

  private static final int LAYOUT_FRAGMENTLOGOUT = 3;

  private static final int LAYOUT_FRAGMENTSHOEDETAIL = 4;

  private static final int LAYOUT_FRAGMENTWELCOME = 5;

  private static final int LAYOUT_NAVHEADER = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.android.myshoestore.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.android.myshoestore.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.android.myshoestore.R.layout.fragment_logout, LAYOUT_FRAGMENTLOGOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.android.myshoestore.R.layout.fragment_shoe_detail, LAYOUT_FRAGMENTSHOEDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.android.myshoestore.R.layout.fragment_welcome, LAYOUT_FRAGMENTWELCOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.android.myshoestore.R.layout.nav_header, LAYOUT_NAVHEADER);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGOUT: {
          if ("layout/fragment_logout_0".equals(tag)) {
            return new FragmentLogoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_logout is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSHOEDETAIL: {
          if ("layout/fragment_shoe_detail_0".equals(tag)) {
            return new FragmentShoeDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_shoe_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTWELCOME: {
          if ("layout/fragment_welcome_0".equals(tag)) {
            return new FragmentWelcomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_welcome is invalid. Received: " + tag);
        }
        case  LAYOUT_NAVHEADER: {
          if ("layout/nav_header_0".equals(tag)) {
            return new NavHeaderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for nav_header is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/activity_main_0", com.example.android.myshoestore.R.layout.activity_main);
      sKeys.put("layout/fragment_login_0", com.example.android.myshoestore.R.layout.fragment_login);
      sKeys.put("layout/fragment_logout_0", com.example.android.myshoestore.R.layout.fragment_logout);
      sKeys.put("layout/fragment_shoe_detail_0", com.example.android.myshoestore.R.layout.fragment_shoe_detail);
      sKeys.put("layout/fragment_welcome_0", com.example.android.myshoestore.R.layout.fragment_welcome);
      sKeys.put("layout/nav_header_0", com.example.android.myshoestore.R.layout.nav_header);
    }
  }
}
