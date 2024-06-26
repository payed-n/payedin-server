package kr.dsm.payedin.domain.trade.application

import kr.dsm.payedin.domain.trade.domain.entity.TradeRequest
import kr.dsm.payedin.domain.trade.domain.repository.TradeRequestRepository
import kr.dsm.payedin.domain.trade.presentation.dto.GetAllTradeRequestResponse
import kr.dsm.payedin.global.security.auth.CustomUserDetail
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class GetAllTradeRequestService(
    private val tradeRequestRepository: TradeRequestRepository,
) {

    fun execute(): GetAllTradeRequestResponse {
        val userId = (SecurityContextHolder.getContext().authentication.principal as CustomUserDetail).user.id
        return GetAllTradeRequestResponse(
            tradeRequestRepository.findAllByUserId(userId)
        )
    }
}