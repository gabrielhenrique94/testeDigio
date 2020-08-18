package digital.gok.testedigio.products

import org.koin.dsl.module

object ProductsModule {
    val module = module {
        single<IProductsViewModel> {
            ProductsViewModel(get())
        }
    }
}