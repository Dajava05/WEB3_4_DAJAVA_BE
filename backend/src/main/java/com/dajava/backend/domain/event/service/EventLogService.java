package com.dajava.backend.domain.event.service;

import java.util.List;

import com.dajava.backend.domain.event.dto.PointerClickEventRequest;
import com.dajava.backend.domain.event.dto.PointerMoveEventRequest;
import com.dajava.backend.domain.event.dto.PointerScrollEventRequest;

/**
 * EventLogService
 * EventLog Domain 의 비즈니스 로직을 처리하는 인터페이스
 *
 * @author NohDongHui, Metronon
 * @since 2025-03-24
 */
public interface EventLogService {

	void createClickEvent(PointerClickEventRequest clickEventRequest);

	void createMoveEvent(PointerMoveEventRequest moveEventRequest);

	void createScrollEvent(PointerScrollEventRequest scrollEventRequest);

	void expireSession(String sessionId);
}

