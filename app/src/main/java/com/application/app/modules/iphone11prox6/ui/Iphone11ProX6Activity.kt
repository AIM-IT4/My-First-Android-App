package com.application.app.modules.iphone11prox6.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone11ProX6Binding
import com.application.app.modules.iphone11prox6.`data`.viewmodel.Iphone11ProX6VM
import kotlin.String
import kotlin.Unit

public class Iphone11ProX6Activity :
    BaseActivity<ActivityIphone11ProX6Binding>(R.layout.activity_iphone_11_pro_x_6) {
  private val viewModel: Iphone11ProX6VM by viewModels<Iphone11ProX6VM>()

  public override fun setUpClicks(): Unit {
  }

  public override fun onInitialized(): Unit {
    binding.iphone11ProX6VM = viewModel
  }

  public companion object {
    public const val TAG: String = "IPHONE11PRO_X6ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone11ProX6Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
