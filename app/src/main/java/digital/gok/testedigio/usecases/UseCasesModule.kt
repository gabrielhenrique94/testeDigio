package digital.gok.testedigio.usecases

import org.koin.dsl.module

object UseCasesModule {
    val module = module {
        single<ListProductsUseCase> { ListProductsUseCase(get()) }
    }
}