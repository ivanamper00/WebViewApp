package vinme.semm.cccgiyumn

import android.os.Bundle
import com.wishland.advertisement.ui.AdsActivity
import com.wishland.advertisement.ui.WebViewActivity

class SplashActivity : AdsActivity(test = false) {

    private val url = "https://www.eharmony.com/dating-advice/attraction/20-ways-to-make-her-fall-in-love/"

    override fun onAdsFallback() {
        startActivity(WebViewActivity.createIntent(this, url ))
        finish()
    }

    override fun onAdsLinkLoaded(adsLink: String) {
        if(adsLink.isEmpty()) {
            onAdsFallback()
            return
        }
        startActivity(WebViewActivity.createIntent(this, adsLink))
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

    }

}