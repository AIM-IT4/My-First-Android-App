package com.application.app.modules.iphone11prox7.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone11prox7.`data`.model.Iphone11ProX7Model

public class Iphone11ProX7VM : ViewModel() {
  public val iphone11ProX7Model: MutableLiveData<Iphone11ProX7Model> =
      MutableLiveData(Iphone11ProX7Model())
}
