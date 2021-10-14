package com.application.app.modules.iphone11prox10.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class Iphone11ProX10Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtPaytm: String? = MyApp.getInstance().resources.getString(R.string.lbl_paytm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPaytmWeaknesse: String? =
      MyApp.getInstance().resources.getString(R.string.msg_paytm_weaknesse)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHereAreTheWe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_here_are_the_we)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPaytmOpportuni: String? =
      MyApp.getInstance().resources.getString(R.string.msg_paytm_opportuni)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFollowingAreT: String? =
      MyApp.getInstance().resources.getString(R.string.msg_following_are_t)

)
