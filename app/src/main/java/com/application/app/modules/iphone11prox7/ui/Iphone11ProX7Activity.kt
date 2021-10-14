package com.application.app.modules.iphone11prox7.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityIphone11ProX7Binding
import com.application.app.modules.iphone11prox7.`data`.viewmodel.Iphone11ProX7VM
import kotlin.String
import kotlin.Unit

public class Iphone11ProX7Activity :
    BaseActivity<ActivityIphone11ProX7Binding>(R.layout.activity_iphone_11_pro_x_7) {
  private val viewModel: Iphone11ProX7VM by viewModels<Iphone11ProX7VM>()

  public override fun setUpClicks(): Unit {
  }

  public override fun onInitialized(): Unit {
    binding.iphone11ProX7VM = viewModel
  }

  public companion object {
    public const val TAG: String = "IPHONE11PRO_X7ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone11ProX7Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
