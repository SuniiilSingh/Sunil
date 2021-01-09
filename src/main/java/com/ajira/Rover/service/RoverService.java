package com.ajira.Rover.service;

import com.ajira.Rover.entiry.EnvironmentConfig;
import com.ajira.Rover.entiry.RoverConfig;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public interface RoverService {
    EnvironmentConfig saveEnvironmentConfig(EnvironmentConfig environmentConfig);

    Boolean modifyEnvConfig(int temperature);

    RoverConfig saveRoverConfig(RoverConfig roverConfig);
}
