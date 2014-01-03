/*
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version. You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 */

package org.aitools.programd.processor.botconfiguration;

import org.aitools.programd.Core;
import org.aitools.programd.parser.BotsConfigurationFileParser;
import org.w3c.dom.Element;

/**
 * @version 4.5
 * @author <a href="mailto:noel@aitools.org">Noel Bush</a>
 */
public class ServletPageProcessor extends SubstitutionElementProcessor
{
    /** The label (as required by the registration scheme). */
    public static final String label = "servlet-page";

    /**
     * Creates a new InputProcessor using the given Core.
     * 
     * @param coreToUse the Core object to use
     */
    public ServletPageProcessor(Core coreToUse)
    {
        super(coreToUse);
    }

    /**
     * @see BotConfigurationElementProcessor#process(org.w3c.dom.Element,
     *      BotsConfigurationFileParser)
     */
    @Override
    public String process(Element element, BotsConfigurationFileParser parser)
    {
        parser.getCurrentBot().setServletPage(element.getTextContent());
        return EMPTY_STRING;
    }
}