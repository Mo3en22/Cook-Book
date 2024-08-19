// Generated by view binder compiler. Do not edit!
package com.training.recipeapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.training.recipeapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRecipeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Toolbar appbar;

  @NonNull
  public final BottomNavigationView bottomNavigation;

  @NonNull
  public final ImageView imghomesearcrh;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final FragmentContainerView navHostRecipefragment;

  @NonNull
  public final TextView toolbarTitle;

  private ActivityRecipeBinding(@NonNull ConstraintLayout rootView, @NonNull Toolbar appbar,
      @NonNull BottomNavigationView bottomNavigation, @NonNull ImageView imghomesearcrh,
      @NonNull ConstraintLayout main, @NonNull FragmentContainerView navHostRecipefragment,
      @NonNull TextView toolbarTitle) {
    this.rootView = rootView;
    this.appbar = appbar;
    this.bottomNavigation = bottomNavigation;
    this.imghomesearcrh = imghomesearcrh;
    this.main = main;
    this.navHostRecipefragment = navHostRecipefragment;
    this.toolbarTitle = toolbarTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRecipeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRecipeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_recipe, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRecipeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appbar;
      Toolbar appbar = ViewBindings.findChildViewById(rootView, id);
      if (appbar == null) {
        break missingId;
      }

      id = R.id.bottom_navigation;
      BottomNavigationView bottomNavigation = ViewBindings.findChildViewById(rootView, id);
      if (bottomNavigation == null) {
        break missingId;
      }

      id = R.id.imghomesearcrh;
      ImageView imghomesearcrh = ViewBindings.findChildViewById(rootView, id);
      if (imghomesearcrh == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.nav_host_Recipefragment;
      FragmentContainerView navHostRecipefragment = ViewBindings.findChildViewById(rootView, id);
      if (navHostRecipefragment == null) {
        break missingId;
      }

      id = R.id.toolbar_title;
      TextView toolbarTitle = ViewBindings.findChildViewById(rootView, id);
      if (toolbarTitle == null) {
        break missingId;
      }

      return new ActivityRecipeBinding((ConstraintLayout) rootView, appbar, bottomNavigation,
          imghomesearcrh, main, navHostRecipefragment, toolbarTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
