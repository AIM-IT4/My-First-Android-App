package com.application.app.modules.iphone11prox10.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone11prox10.`data`.model.Iphone11ProX10Model

public class Iphone11ProX10VM : ViewModel() {
  public val iphone11ProX10Model: MutableLiveData<Iphone11ProX10Model> =
      MutableLiveData(Iphone11ProX10Model())
}
