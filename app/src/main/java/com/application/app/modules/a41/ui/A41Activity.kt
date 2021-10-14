package com.application.app.modules.a41.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityA41Binding
import com.application.app.modules.a41.`data`.viewmodel.A41VM
import com.application.app.modules.iphone11prox4.ui.Iphone11ProX4Activity
import com.application.app.modules.splash.ui.SplashActivity
import kotlin.String
import kotlin.Unit

public class A41Activity : BaseActivity<ActivityA41Binding>(R.layout.activity_a4_1) {
  private val viewModel: A41VM by viewModels<A41VM>()

  public override fun setUpClicks(): Unit {
    binding.btnApps.setOnClickListener {

      val destIntent = Iphone11ProX4Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.btnHome.setOnClickListener {

      val destIntent = SplashActivity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public override fun onInitialized(): Unit {
    binding.a41VM = viewModel
  }

  public companion object {
    public const val TAG: String = "A41ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, A41Activity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
