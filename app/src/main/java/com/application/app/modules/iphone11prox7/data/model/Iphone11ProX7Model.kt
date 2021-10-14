package com.application.app.modules.iphone11prox7.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Iphone11ProX7Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAmazonPay: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_amazon_pay)

)
