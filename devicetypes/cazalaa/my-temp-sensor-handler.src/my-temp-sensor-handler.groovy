/**
 *  My temp sensor handler
 *
 *  Copyright 2019 Jerome Cloute-Cazalaa
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 */
metadata {
	definition (name: "My temp sensor handler", namespace: "cazalaa", author: "Jerome Cloute-Cazalaa", cstHandler: true) {
		capability "Temperature Measurement"
        
        fingerprint profileId: "C00F", deviceId: "0302", inClusters: "0000, 0003, FFFF, 0402", outClusters: "0000, FFFF", manufacturer: "Ember", model: "Ember.weather", deviceJoinName: "My Temp Sensor"
	}


	simulator {
		// TODO: define status and reply messages here
        for (int i = 0; i <= 100; i += 10) {
            status "${i}F": "temperature: $i F"
		}
	}

	tiles {
		// TODO: define your main and details tiles here
        
        
}
}
// parse events into attributes
def parse(String description) {
	log.debug "Parsing '${description}'"
	// TODO: handle 'temperature' attribute

}
