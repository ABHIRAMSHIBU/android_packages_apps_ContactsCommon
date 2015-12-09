/*
 * Copyright (C) 2015 The Android Open Source Project
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

package com.android.contacts.common.compat;

import android.net.Uri;
import android.provider.ContactsContract.Contacts;

import com.android.contacts.common.ContactsUtils;

public class ContactsCompat {

    // TODO: Use N APIs
    private static final Uri ENTERPRISE_CONTENT_FILTER_URI =
            Uri.withAppendedPath(Contacts.CONTENT_URI, "filter_enterprise");

    public static Uri getContentUri() {
        // TODO: Use N APIs
        if (ContactsUtils.FLAG_N_FEATURE && android.os.Build.VERSION.CODENAME.startsWith("N")) {
            return ENTERPRISE_CONTENT_FILTER_URI;
        }
        return Contacts.CONTENT_FILTER_URI;
    }
}
