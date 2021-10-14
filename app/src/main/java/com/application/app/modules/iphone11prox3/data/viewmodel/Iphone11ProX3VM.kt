package com.application.app.modules.iphone11prox3.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone11prox3.`data`.model.Iphone11ProX3Model

public class Iphone11ProX3VM : ViewModel() {
  public val iphone11ProX3Model: MutableLiveData<Iphone11ProX3Model> =
      MutableLiveData(Iphone11ProX3Model())
}
