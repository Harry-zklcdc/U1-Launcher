/*
 * Hello Minecraft! Launcher
 * Copyright (C) 2021  huangyuhui <huanghongxun2008@126.com> and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package org.jackhuang.hmcl;

import org.jackhuang.hmcl.util.io.JarUtils;
import org.jackhuang.hmcl.util.platform.OperatingSystem;

import java.nio.file.Path;

/**
 * Stores metadata about this application.
 */
public final class Metadata {
    private Metadata() {}

    public static final String NAME = "HPMCL";
    public static final String FULL_NAME = "HiPer Minecraft Launcher";
    public static final String VERSION = System.getProperty("hmcl.version.override", JarUtils.getManifestAttribute("Implementation-Version", "@develop@"));

    public static final String TITLE = NAME + " " + VERSION;
    public static final String FULL_TITLE = FULL_NAME + " v" + VERSION;

    public static final String CONTACT_URL = "https://github.com/Glavo/HPMCL/issues";
    public static final String HELP_URL = "https://hmcl.huangyuhui.net/help";
    public static final String CHANGELOG_URL = "https://gitcode.net/glavo/hpmcl-meta/-/raw/main/changelog/";
    public static final String PUBLISH_URL = "https://github.com/Glavo/HPMCL";
    public static final String EULA_URL = "https://hmcl.huangyuhui.net/eula";

    public static final String BUILD_CHANNEL = JarUtils.getManifestAttribute("Build-Channel", "nightly");

    public static final Path MINECRAFT_DIRECTORY = OperatingSystem.getWorkingDirectory("minecraft");
    public static final Path HMCL_DIRECTORY = OperatingSystem.getWorkingDirectory("hpmcl");

    public static boolean isStable() {
        return "stable".equals(BUILD_CHANNEL);
    }

    public static boolean isDev() {
        return "dev".equals(BUILD_CHANNEL);
    }

    public static boolean isNightly() {
        return !isStable() && !isDev();
    }
}
