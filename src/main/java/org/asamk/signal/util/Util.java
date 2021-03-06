package org.asamk.signal.util;

import org.asamk.signal.manager.groups.GroupId;
import org.asamk.signal.manager.groups.GroupIdFormatException;

public class Util {

    private Util() {
    }

    public static String formatSafetyNumber(String digits) {
        final int partCount = 12;
        int partSize = digits.length() / partCount;
        StringBuilder f = new StringBuilder(digits.length() + partCount);
        for (int i = 0; i < partCount; i++) {
            f.append(digits, i * partSize, (i * partSize) + partSize).append(" ");
        }
        return f.toString();
    }

    public static GroupId decodeGroupId(String groupId) throws GroupIdFormatException {
        return GroupId.fromBase64(groupId);
    }
}
