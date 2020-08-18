package digital.gok.testedigio.data

import org.koin.dsl.module

object RepositoriesModule {
    val module = module {
        single<ProductsRepository> { ProductsRepository(get()) }
    }
}