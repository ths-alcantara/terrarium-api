package com.thais.terrrarium_api.service;

import com.thais.terrrarium_api.entity.Event;
import com.thais.terrrarium_api.enums.ACTIONS;

public interface ActionService {

    Event processNewAction(ACTIONS actions);
}
