/*
 * Copyright (C) 2016 The Android Open Source Project
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
package com.android.contacts.common.logging;

import android.text.TextUtils;

/**
 * Stores constants identifying individual screens/dialogs/fragments in the application, and also
 * provides a mapping of integer id -> screen name mappings for analytics purposes.
 */
public final class ScreenEvent {
    private static final String FRAGMENT_TAG_SEPARATOR = "#";

    // Should match ContactsExtension.ScreenEvent.ScreenType values in
    // http://cs/google3/logs/proto/wireless/android/contacts/contacts_extensions.proto
    public static final int UNKNOWN = 0;
    public static final int SEARCH = 1;
    public static final int SEARCH_EXIT = 2;

    public static final String TAG_SEARCH = "Search";
    public static final String TAG_SEARCH_EXIT = "SearchExit";

    /**
     * Build a tagged version of the provided screenName if the tag is non-empty.
     *
     * @param screenName Name of the screen.
     * @param tag Optional tag describing the screen.
     * @return the unchanged screenName if the tag is {@code null} or empty, the tagged version of
     *         the screenName otherwise.
     */
    public static String getScreenNameWithTag(String screenName, String tag) {
        if (TextUtils.isEmpty(tag)) {
            return screenName;
        }
        return screenName + FRAGMENT_TAG_SEPARATOR + tag;
    }
}
