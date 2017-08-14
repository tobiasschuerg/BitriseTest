package de.tobiasschuerg.bitrisetest

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("de.tobiasschuerg.bitrisetest", appContext.packageName)
    }

    @Test
    fun fail() {
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("com.google", appContext.packageName)
    }
}
