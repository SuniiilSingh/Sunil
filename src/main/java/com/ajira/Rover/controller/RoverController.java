package com.ajira.Rover.controller;

import com.ajira.Rover.entiry.EnvironmentConfig;
import com.ajira.Rover.entiry.RoverConfig;
import com.ajira.Rover.service.RoverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RoverController {

    @Autowired
    private RoverService roverService;

    /**
     *
     * @param environmentConfig
     * @return
     */

    @RequestMapping(value = "/environment/configure",method = RequestMethod.POST,consumes ="Accept=application/json", headers = "Accept=application/json")
    public ResponseEntity<EnvironmentConfig> configEnvironment(@RequestBody EnvironmentConfig environmentConfig  ){
        EnvironmentConfig config =  roverService.saveEnvironmentConfig(environmentConfig);
        return new ResponseEntity<>(config, HttpStatus.CREATED);
    }

    /**
     *
     * @param temperature
     * @return
     */
    @RequestMapping(value = "/environment", method = RequestMethod.PATCH)
    public ResponseEntity<String> modifyEnvConfig(@RequestParam("temperature") int temperature ){
   if(roverService.modifyEnvConfig(temperature)==true){
       return  new ResponseEntity<>("Updated  Successfully", HttpStatus.OK);
   }
        return  new ResponseEntity<>("Failed to update", HttpStatus.OK);
    }

    /**
     *
     * @param roverConfig
     * @return
     */
    @RequestMapping(value = "/rover/configure", method = RequestMethod.POST)
    public ResponseEntity<RoverConfig> configRover(@RequestBody RoverConfig roverConfig){
        RoverConfig roverConfig1 = roverService.saveRoverConfig(roverConfig);
        return new ResponseEntity<>(roverConfig1,HttpStatus.CREATED);
    }

    /**
     *
     * @param temperature
     * @return
     */
    @RequestMapping(value = "/rover/move",method = RequestMethod.POST,headers = "Accept=application/json")
    public ResponseEntity<String> configRoverMovement(@RequestParam("temperature") int temperature ){
return null;
    }

    /**
     *
     * @return
     */
    @RequestMapping(value = "/rover/status",method = RequestMethod.GET)
    public ResponseEntity<String> getRoverStatus(){
return null;
    }
}
