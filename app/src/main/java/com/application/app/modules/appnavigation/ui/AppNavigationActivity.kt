package com.application.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.application.app.R
import com.application.app.appcomponents.base.BaseActivity
import com.application.app.databinding.ActivityAppNavigationBinding
import com.application.app.modules.a41.ui.A41Activity
import com.application.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.application.app.modules.iphone11prox10.ui.Iphone11ProX10Activity
import com.application.app.modules.iphone11prox2.ui.Iphone11ProX2Activity
import com.application.app.modules.iphone11prox3.ui.Iphone11ProX3Activity
import com.application.app.modules.iphone11prox4.ui.Iphone11ProX4Activity
import com.application.app.modules.iphone11prox5.ui.Iphone11ProX5Activity
import com.application.app.modules.iphone11prox6.ui.Iphone11ProX6Activity
import com.application.app.modules.iphone11prox7.ui.Iphone11ProX7Activity
import com.application.app.modules.iphone11prox8.ui.Iphone11ProX8Activity
import com.application.app.modules.iphone11prox9.ui.Iphone11ProX9Activity
import com.application.app.modules.splash.ui.SplashActivity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun setUpClicks(): Unit {
    binding.linear8.setOnClickListener {

      val destIntent = Iphone11ProX10Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear10.setOnClickListener {

      val destIntent = Iphone11ProX7Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear11.setOnClickListener {

      val destIntent = Iphone11ProX8Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear9.setOnClickListener {

      val destIntent = Iphone11ProX6Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear6.setOnClickListener {

      val destIntent = Iphone11ProX4Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear3.setOnClickListener {

      val destIntent = SplashActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear7.setOnClickListener {

      val destIntent = Iphone11ProX5Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear13.setOnClickListener {

      val destIntent = A41Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear4.setOnClickListener {

      val destIntent = Iphone11ProX2Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear12.setOnClickListener {

      val destIntent = Iphone11ProX9Activity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear5.setOnClickListener {

      val destIntent = Iphone11ProX3Activity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public override fun onInitialized(): Unit {
    binding.appNavigationVM = viewModel
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
