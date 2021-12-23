package com.example.openbanktechtest.main.di.list

import com.example.data.network.NetworkClient
import com.example.data.repository.Mapper
import com.example.openbanktechtest.main.data.character.CharacterDTO
import com.example.openbanktechtest.main.data.list.ListDataSourceImpl
import com.example.openbanktechtest.main.data.list.ListMapper
import com.example.openbanktechtest.main.data.response.ResponseDTO
import com.example.openbanktechtest.main.domain.character.CharacterDomainModel
import com.example.openbanktechtest.main.domain.character.CharacterMapper
import com.example.openbanktechtest.main.domain.list.GetListUseCase
import com.example.openbanktechtest.main.domain.list.GetListUseCaseImpl
import com.example.openbanktechtest.main.domain.list.ListDataSource
import com.example.openbanktechtest.main.presentation.list.ListFragmentViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module

val listModule = module {

    single<Mapper<CharacterDomainModel, CharacterDTO>>(named(CharacterMapper.NAME)) { CharacterMapper()}
    single<Mapper<List<CharacterDomainModel>, ResponseDTO>>(named(ListMapper.NAME)) {ListMapper(get(named(CharacterMapper.NAME)))}

    single<ListDataSource> {
        ListDataSourceImpl(
            client = get(named(NetworkClient.NAME)),
            mapper = get(named(ListMapper.NAME))
        )
    }

    single<GetListUseCase> {
        GetListUseCaseImpl (
            listDataSource = get()
        )
    }

    viewModel { ListFragmentViewModel(getListUseCase = get()) }
}