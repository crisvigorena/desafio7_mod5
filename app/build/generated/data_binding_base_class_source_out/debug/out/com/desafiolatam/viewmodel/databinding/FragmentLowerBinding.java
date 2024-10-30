// Generated by view binder compiler. Do not edit!
package com.desafiolatam.viewmodel.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.desafiolatam.viewmodel.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentLowerBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatTextView tvLowerClick;

  @NonNull
  public final AppCompatTextView tvLowerCounter;

  private FragmentLowerBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatTextView tvLowerClick, @NonNull AppCompatTextView tvLowerCounter) {
    this.rootView = rootView;
    this.tvLowerClick = tvLowerClick;
    this.tvLowerCounter = tvLowerCounter;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentLowerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentLowerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_lower, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentLowerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tv_lower_click;
      AppCompatTextView tvLowerClick = ViewBindings.findChildViewById(rootView, id);
      if (tvLowerClick == null) {
        break missingId;
      }

      id = R.id.tv_lower_counter;
      AppCompatTextView tvLowerCounter = ViewBindings.findChildViewById(rootView, id);
      if (tvLowerCounter == null) {
        break missingId;
      }

      return new FragmentLowerBinding((ConstraintLayout) rootView, tvLowerClick, tvLowerCounter);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
