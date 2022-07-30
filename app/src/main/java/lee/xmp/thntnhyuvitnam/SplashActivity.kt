package lee.xmp.thntnhyuvitnam

import android.os.Bundle
import com.wishland.advertisement.ui.AdsActivity
import com.wishland.advertisement.ui.WebViewActivity

class SplashActivity : AdsActivity(test = false) {

    private val url = "https://vi.greatlove.how/category/1376894458150"

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
