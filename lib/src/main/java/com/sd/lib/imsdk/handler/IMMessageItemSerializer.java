package com.sd.lib.imsdk.handler;

import com.sd.lib.imsdk.IMMessageItem;

public interface IMMessageItemSerializer
{
    String serialize(Object object);

    IMMessageItem deserialize(String itemContent, String itemType);
}
