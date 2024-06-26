package kr.dsm.payedin.domain.trade.domain.repository

import kr.dsm.payedin.domain.trade.domain.entity.Trade
import kr.dsm.payedin.domain.trade.persistence.vo.TradeVO
import java.util.UUID

interface TradeRepository {
    fun findAll(userId: UUID): List<TradeVO>

    fun findById(tradeId: UUID): Trade?

    fun save(trade: Trade): Trade

    fun delete(trade: Trade): Unit
}