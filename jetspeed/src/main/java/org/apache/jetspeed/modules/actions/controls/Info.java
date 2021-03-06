/*
 * Copyright 2000-2001,2004 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 
package org.apache.jetspeed.modules.actions.controls;

// Turbine stuff
import org.apache.turbine.modules.Action;
import org.apache.turbine.util.RunData;
import org.apache.jetspeed.services.rundata.JetspeedRunData;

/**
 * Display information about the selected portlet
 * 
 * @author <a href="mailto:raphael@apache.org">Rapha謖 Luta</a>
 * @author <a href="mailto:mark_orciuch@ngsltd.com">Mark Orciuch</a>
 */
public class Info extends Action
{
    public void doPerform( RunData rundata ) throws Exception
    {

        String peid = rundata.getParameters().getString("js_peid");
        if ( peid == null )
        {
            rundata.setScreenTemplate("Ecs");
            return;
        }

         JetspeedRunData jdata = (JetspeedRunData)rundata;
         jdata.setJs_peid(peid);

        // redirect to the info template
        rundata.setScreenTemplate("Info");
    }
}
