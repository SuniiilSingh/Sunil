package com.ajira.Rover.service;

import com.ajira.Rover.entiry.EnvironmentConfig;
import com.ajira.Rover.entiry.RoverConfig;
import com.ajira.Rover.repo.RoverRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 */
public class RoverServiceImpl implements  RoverService {
    @Autowired
    private RoverRepository repository;

    /**
     *
     * @param environmentConfig
     * @return
     */
    @Override
    public EnvironmentConfig saveEnvironmentConfig(EnvironmentConfig environmentConfig) {
        return (EnvironmentConfig) repository.save(environmentConfig);
    }

    /**
     *
     * @param temperature
     * @return
     */
    @Override
    public Boolean modifyEnvConfig(int temperature) {

        EnvironmentConfig config= (EnvironmentConfig) repository.findAll().get(0);
        if(config!=null){
            config.setTemperature(temperature);
            EnvironmentConfig config2= (EnvironmentConfig) repository.save(config);
            if(config2!=null){
                return true;
            }
            return false;
        }
        return false;

    }

    /**
     *
     * @param roverConfig
     * @return
     */
    @Override
    public RoverConfig saveRoverConfig(RoverConfig roverConfig) {
        return (RoverConfig) repository.save(roverConfig);
    }
}
