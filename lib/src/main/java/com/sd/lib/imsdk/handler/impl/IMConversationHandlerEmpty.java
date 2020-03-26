package com.sd.lib.imsdk.handler.impl;

import com.sd.lib.imsdk.IMConversation;
import com.sd.lib.imsdk.IMMessage;
import com.sd.lib.imsdk.callback.IMValueCallback;
import com.sd.lib.imsdk.constant.IMCode;
import com.sd.lib.imsdk.handler.IMConversationHandler;

import java.util.List;

public class IMConversationHandlerEmpty implements IMConversationHandler
{
    @Override
    public void saveConversation(IMConversation conversation)
    {

    }

    @Override
    public void removeConversation(IMConversation conversation)
    {

    }

    @Override
    public boolean loadConversation(IMConversation conversation, IMConversation.Accessor accessor)
    {
        return false;
    }

    @Override
    public List<IMConversation> getAllConversation()
    {
        return null;
    }

    @Override
    public void loadMessageBefore(IMConversation conversation, int count, IMMessage lastMessage, IMValueCallback<List<IMMessage>> callback)
    {
        callback.onError(IMCode.ERROR_OTHER, "empty implementation");
    }
}
