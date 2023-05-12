package com.example.domain.usecases

import com.example.domain.model.DomainMovieDetailsModel
import com.example.domain.repositorycontracts.DomainMovieRepositoryContract
import javax.inject.Inject

class GetMoviesListUseCase @Inject constructor(
    private val domainMovieRepository: DomainMovieRepositoryContract
) : BaseReturnUseCase<List<DomainMovieDetailsModel>>() {
    override suspend fun execute(): List<DomainMovieDetailsModel> {
        return domainMovieRepository.getMoviesList()
    }
}