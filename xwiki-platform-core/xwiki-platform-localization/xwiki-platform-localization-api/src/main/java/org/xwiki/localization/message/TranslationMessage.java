/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.localization.message;

import java.util.Collection;
import java.util.Locale;

import org.xwiki.localization.TranslationBundle;
import org.xwiki.localization.internal.message.TranslationMessageElement;
import org.xwiki.rendering.block.Block;
import org.xwiki.rendering.block.CompositeBlock;
import org.xwiki.stability.Unstable;

/**
 * Generate the final translation based or variables informations (parameters, etc.).
 * 
 * @version $Id$
 * @since 4.3M2
 */
@Unstable
public interface TranslationMessage extends TranslationMessageElement
{
    /**
     * An empty translation message.
     */
    TranslationMessage EMPTY = new TranslationMessage()
    {
        @Override
        public Block render(Locale locale, Collection<TranslationBundle> bundles, Object... parameters)
        {
            return new CompositeBlock();
        }

        @Override
        public String getRawSource()
        {
            return "";
        }
    };

    /**
     * @return the raw source of the translation as it is stored
     */
    String getRawSource();
}
