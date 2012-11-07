/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.portlets.tessa.asset;

import org.portlets.tessa.model.Tessa;
import org.portlets.tessa.service.TessaLocalServiceUtil;

import org.portlets.tessa.util.WebKeys;

import com.liferay.portlet.asset.model.BaseAssetRenderer;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * @author Rich Sezov
 */
public class TessaAssetRenderer extends BaseAssetRenderer {

    public TessaAssetRenderer(Tessa tessa) {
        _tessa = tessa;
    }

    public long getClassPK() {
        return _tessa.getTessaId();
    }

    public long getGroupId() {
        return _tessa.getGroupId();
    }

    public String getSummary() {
        return _tessa.getTessaText();
    }

    public String getTitle() {
        return "Tessa Contest Entry";
    }

    public long getUserId() {
        return _tessa.getUserId();
    }

    public String getUuid() {
        return _tessa.getUuid();
    }

    public String render(
            RenderRequest request, RenderResponse response,
            String template)
        throws Exception {

        if (template.equals(TEMPLATE_FULL_CONTENT)) {
            request.setAttribute(WebKeys.TESSA_ENTRY, _tessa);

            return "/html/" + template + ".jsp";
        }
        else {
            return null;
        }
    }

    private Tessa _tessa;

}
