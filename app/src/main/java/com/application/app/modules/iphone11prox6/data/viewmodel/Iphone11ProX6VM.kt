package com.application.app.modules.iphone11prox6.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone11prox6.`data`.model.Iphone11ProX6Model

public class Iphone11ProX6VM : ViewModel() {
  public val iphone11ProX6Model: MutableLiveData<Iphone11ProX6Model> =
      MutableLiveData(Iphone11ProX6Model())
}
