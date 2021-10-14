package com.application.app.modules.iphone11prox9.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone11prox9.`data`.model.Iphone11ProX9Model

public class Iphone11ProX9VM : ViewModel() {
  public val iphone11ProX9Model: MutableLiveData<Iphone11ProX9Model> =
      MutableLiveData(Iphone11ProX9Model())
}
