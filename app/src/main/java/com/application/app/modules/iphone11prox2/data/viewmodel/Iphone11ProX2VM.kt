package com.application.app.modules.iphone11prox2.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.application.app.modules.iphone11prox2.`data`.model.Iphone11ProX2Model

public class Iphone11ProX2VM : ViewModel() {
  public val iphone11ProX2Model: MutableLiveData<Iphone11ProX2Model> =
      MutableLiveData(Iphone11ProX2Model())
}
