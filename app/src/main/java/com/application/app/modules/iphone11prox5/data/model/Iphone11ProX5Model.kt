package com.application.app.modules.iphone11prox5.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Iphone11ProX5Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtPaytmStrengths: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_paytm_strengths)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBelowAreTheS: String? =
      MyApp.getInstance().resources.getString(R.string.msg_below_are_the_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtContinue: String? = MyApp.getInstance().resources.getString(R.string.lbl_continue)

)
