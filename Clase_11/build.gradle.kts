plugins {
    alias(libs.plugins.android.application) apply false // Si usa alias, cámbialo en el .toml arriba
    // O si aparece así:
    id("com.android.application") version "8.9.1" apply false
}