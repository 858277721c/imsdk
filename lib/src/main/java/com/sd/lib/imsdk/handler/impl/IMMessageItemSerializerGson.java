package com.sd.lib.imsdk.handler.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sd.lib.imsdk.IMManager;
import com.sd.lib.imsdk.IMMessageItem;
import com.sd.lib.imsdk.handler.IMMessageItemSerializer;

public class IMMessageItemSerializerGson implements IMMessageItemSerializer
{
    private final Gson mGson = new GsonBuilder()
            .serializeNulls()
            .create();

    @Override
    public String serialize(Object object)
    {
        return mGson.toJson(object);
    }

    @Override
    public IMMessageItem deserialize(String itemType, String itemContent) throws Exception
    {
        final Class<? extends IMMessageItem> clazz = IMManager.getInstance().getMessageItem(itemType);
        return mGson.fromJson(itemContent, clazz);
    }
}
