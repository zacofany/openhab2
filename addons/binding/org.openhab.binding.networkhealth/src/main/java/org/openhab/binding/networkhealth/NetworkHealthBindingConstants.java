/**
 * Copyright (c) 2014 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.networkhealth;

import java.util.Collections;
import java.util.Set;

import org.eclipse.smarthome.core.thing.ThingTypeUID;

/**
 * The {@link NetworkHealthBindingConstants} class defines common constants, which are 
 * used across the whole binding.
 * 
 * @author Marc Mettke - Initial contribution
 */
public class NetworkHealthBindingConstants {

    public static final String BINDING_ID = "networkhealth";
    
    // List of all Thing Type UIDs
    public final static ThingTypeUID THING_TYPE_DEVICE = new ThingTypeUID(BINDING_ID, "device");

    // List of all Channel ids
    public final static String CHANNEL_ONLINE = "online";

    // List of all Parameters
    public final static String PARAMETER_HOSTNAME = "hostname";
    public final static String PARAMETER_PORT = "port";
    public final static String PARAMETER_TIMEOUT = "timeout";
    public final static String PARAMETER_REFRESH_INTERVAL = "refresh_interval";
    
    public final static Set<ThingTypeUID> SUPPORTED_THING_TYPES_UIDS = Collections.singleton(THING_TYPE_DEVICE);
    
}
