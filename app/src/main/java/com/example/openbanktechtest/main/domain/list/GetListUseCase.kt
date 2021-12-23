package com.example.openbanktechtest.main.domain.list

import com.example.openbanktechtest.main.domain.character.CharacterDomainModel
import kotlinx.coroutines.flow.Flow

interface GetListUseCase: (ListRequest) -> Flow<List<CharacterDomainModel>>