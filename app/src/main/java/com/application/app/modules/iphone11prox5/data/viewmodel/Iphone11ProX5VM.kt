package com.application.app.modules.iphone11prox5.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone11prox5.`data`.model.Iphone11ProX5Model

public class Iphone11ProX5VM : ViewModel() {
  public val iphone11ProX5Model: MutableLiveData<Iphone11ProX5Model> =
      MutableLiveData(Iphone11ProX5Model())
}
