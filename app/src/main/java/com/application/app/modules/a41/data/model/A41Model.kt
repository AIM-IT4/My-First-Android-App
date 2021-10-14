package com.application.app.modules.a41.`data`.model

import com.application.app.R
import com.application.app.appcomponents.di.MyApp
import kotlin.String

public data class A41Model(
  /**
   * TODO Replace with dynamic value
   */
  public var txtContactUs: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_contact_us)

)
