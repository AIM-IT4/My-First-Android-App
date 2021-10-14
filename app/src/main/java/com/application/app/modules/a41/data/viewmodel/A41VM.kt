package com.application.app.modules.a41.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.a41.`data`.model.A41Model

public class A41VM : ViewModel() {
  public val a41Model: MutableLiveData<A41Model> = MutableLiveData(A41Model())
}
