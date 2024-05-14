package kr.dsm.payedin.domain.wallet.persistence

import kr.dsm.payedin.domain.wallet.domain.entity.TransferHistory
import kr.dsm.payedin.domain.wallet.domain.repository.TransferHistoryRepository
import org.springframework.stereotype.Repository

@Repository
class TransferHistoryRepositoryImpl(
    private val transferHistoryJpaRepository: TransferHistoryJpaRepository
) : TransferHistoryRepository {
    override fun saveAll(transferHistory: List<TransferHistory>) {
        transferHistoryJpaRepository.saveAll(transferHistory)
    }
}