package com.example.shortner

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import dev.hotwire.turbo.config.TurboPathConfiguration
import dev.hotwire.turbo.session.TurboSessionNavHostFragment
import kotlin.reflect.KClass

class MainSessionNavHost : TurboSessionNavHostFragment(){
    override val sessionName = "main"
    override val startLocation = "http://url-shortener-env.eba-btqejfmt.us-east-1.elasticbeanstalk.com"

    override val registeredFragments: List<KClass<out Fragment>>
        get() = listOf(
            WebFragment::class,
            WebBottomSheetFragment::class
        )

    override val registeredActivities: List<KClass<out AppCompatActivity>>
        get() = listOf()

    override val pathConfigurationLocation: TurboPathConfiguration.Location
        get() = TurboPathConfiguration.Location(assetFilePath = "json/configuration.json")
}