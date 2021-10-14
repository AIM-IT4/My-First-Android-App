package com.application.app.modules.iphone11prox4.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone11prox4.`data`.model.Iphone11ProX4Model

public class Iphone11ProX4VM : ViewModel() {
  public val iphone11ProX4Model: MutableLiveData<Iphone11ProX4Model> =
      MutableLiveData(Iphone11ProX4Model())
}
