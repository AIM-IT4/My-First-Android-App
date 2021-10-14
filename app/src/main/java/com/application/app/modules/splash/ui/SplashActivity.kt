package com.application.app.modules.splash.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivitySplashBinding
import com.application.app.modules.iphone11prox2.ui.Iphone11ProX2Activity
import com.application.app.modules.splash.`data`.viewmodel.SplashVM
import kotlin.String
import kotlin.Unit

public class SplashActivity : BaseActivity<ActivitySplashBinding>(R.layout.activity_splash) {
  private val viewModel: SplashVM by viewModels<SplashVM>()

  public override fun setUpClicks(): Unit {
    binding.btnGetStarted.setOnClickListener {

      val destIntent = Iphone11ProX2Activity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public override fun onInitialized(): Unit {
    binding.splashVM = viewModel
  }

  public companion object {
    public const val TAG: String = "SPLASH_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SplashActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
