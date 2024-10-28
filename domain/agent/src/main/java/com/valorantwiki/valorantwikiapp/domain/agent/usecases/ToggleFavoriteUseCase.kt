package com.valorantwiki.valorantwikiapp.domain.agent.usecases

import com.valorantwiki.valorantwikiapp.domain.agent.data.AgentRepository
import com.valorantwiki.valorantwikiapp.domain.agent.entities.Agent

class ToggleFavoriteUseCase(private val agentRepository: AgentRepository) {
    suspend operator fun invoke(agent: Agent) {
        agentRepository.toggleFavorite(agent)
    }
}