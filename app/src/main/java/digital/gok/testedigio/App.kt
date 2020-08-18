package digital.gok.testedigio

import android.app.Application
import digital.gok.testedigio.api.ApiModule
import digital.gok.testedigio.data.RepositoriesModule
import digital.gok.testedigio.products.ProductsModule
import digital.gok.testedigio.usecases.UseCasesModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin


class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {

            androidContext(this@App)

            modules(
                ProductsModule.module,
                ApiModule.module,
                UseCasesModule.module,
                RepositoriesModule.module
            )
        }
    }
}