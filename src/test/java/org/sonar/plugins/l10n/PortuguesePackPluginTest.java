/*
 * L10n :: Brazilian Portuguese Pack
 * Copyright (C) 2012-2019 Felipe Zorzo
 * mailto:felipebzorzo AT gmail DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonar.plugins.l10n;

import org.junit.Assert;
import org.junit.Test;
import org.sonar.api.Plugin;
import org.sonar.api.SonarEdition;
import org.sonar.api.SonarQubeSide;
import org.sonar.api.internal.SonarRuntimeImpl;
import org.sonar.api.utils.Version;
import org.sonar.test.i18n.I18nMatchers;

public class PortuguesePackPluginTest {

  @Test
  public void bundles_should_be_up_to_date() {
    I18nMatchers.assertBundlesUpToDate();
  }

  @Test
  public void should_not_have_extensions() {
    Plugin.Context context = new Plugin.Context(SonarRuntimeImpl.forSonarQube(
            Version.create(6, 0), SonarQubeSide.SERVER, SonarEdition.COMMUNITY));
    PortuguesePackPlugin plugin = new PortuguesePackPlugin();
    plugin.define(context);
    Assert.assertTrue(context.getExtensions().isEmpty());
  }
}
